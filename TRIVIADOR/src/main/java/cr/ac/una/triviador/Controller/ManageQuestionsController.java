package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.model.TrivQuestionsDto;
import cr.ac.una.triviador.service.playersService;
import cr.ac.una.triviador.service.questionService;
import cr.ac.una.triviador.util.Mensaje;
import cr.ac.una.triviador.util.Respuesta;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.input.KeyEvent;

public class ManageQuestionsController extends Controller implements Initializable {

    private ObservableList<TrivQuestionsDto> questionDtoList = FXCollections.observableArrayList();
    TrivQuestionsDto questionDto;

    @FXML
    private MFXButton btnModify;

    @FXML
    private MFXButton btnSearch;

    @FXML
    private MFXFilterComboBox<String> cmbCategories;

    @FXML
    private MFXFilterComboBox<String> cmbFilterType;

    @FXML
    private TableColumn<TrivQuestionsDto, String> colQuestion;

    @FXML
    private MFXLegacyTableView<TrivQuestionsDto> tbvQuestion;

    @FXML
    private MFXTextField txtSearchText;

    @FXML
    void onActonCmbFilterType(ActionEvent event) {
        typesActiveSearchComponents();
    }

    @FXML
    private void onActionCmbCategories(ActionEvent event) {
        if (cmbCategories.getValue() != null) {
            btnSearch.setDisable(false);
        }
    }

    @FXML
    private void onActionBtnSearch(ActionEvent event) {
        if (cmbFilterType.getValue().equals("Texto de pregunta")) {
            if (!txtSearchText.getText().isBlank()) {
                callServiceType();
            } else {
                new Mensaje().show(Alert.AlertType.ERROR, "Texto vacio", "Has dejado un espacio vacio, por favor revisar");
            }
        } else {
            callServiceType();
        }
    }

    @FXML
    void onActionBtnCreateQuestion(ActionEvent event) {

    }

    @FXML
    void onActionBtnModify(ActionEvent event) {
        try {
            questionDto = tbvQuestion.getSelectionModel().getSelectedItem();
            if (questionDto != null) {
                //meter lo de llevar a otra ventana
            } else {
                new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Jugador", getStage(), "No se ha seleccionado ningún jugador");
            }
        } catch (Exception ex) {
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error Eliminar el jugador ", ex);
            new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Jugador", getStage(), "Ocurrio un error al Eliminar el jugador.");
        }
    }

    //aqui metemos por parametro de la respuesta del service y el nombre de la respuesta para poder cargar la tabla con las preguntas que nos de el service
    private void loadQuestionTable(Respuesta answer, String answerName) {
        if (answer.getEstado()) {
            questionDtoList = FXCollections.observableArrayList((List<TrivQuestionsDto>) answer.getResultado(answerName));
            tbvQuestion.getItems().clear();
            tbvQuestion.getItems().addAll(questionDtoList);
            tbvQuestion.refresh();
        }
    }

    //aqui inicializamos todos los componentes como: tablas,combo box y componente que esten activos,visibles y habilitados
    private void initializeComponent() {
        cmbFilterType.getItems().addAll("Categorias", "Texto de pregunta", "Preguntas activas", "Preguntas inactivas", "Todas");
        cmbCategories.getItems().addAll("Geografia", "Historia ", "Arte", "Ciencia", "Entretenimiento", "Deportes");
        typesActiveSearchComponents();
        btnSearch.setDisable(true);
        colQuestion.setCellValueFactory(cd -> cd.getValue().questions);

    }

    //aqui llamamos los service segun lo que ocupemos y mandamos a llamar el metodo para cargar las tablas.
    private void callServiceType() {
        String typeSearch = cmbFilterType.getValue();
        if (typeSearch != null) {
            questionService questionService = new questionService();
            Respuesta answer;
            if (typeSearch.equals("Todas")) {
                answer = questionService.loadAllQuestion();
                loadQuestionTable(answer, "ListaPreguntas");
            } else if (typeSearch.equals("Preguntas activas")) {
                answer = questionService.getQuestionActive("1");
                loadQuestionTable(answer, "ListaPreguntasActivas/Inactivas");
            } else if (typeSearch.equals("Preguntas inactivas")) {
                answer = questionService.getQuestionActive("0");
                loadQuestionTable(answer, "ListaPreguntasActivas/Inactivas");
            } else if (typeSearch.equals("Categorias")) {
                answer = questionService.getQuestionCategory(cmbCategories.getValue());
                loadQuestionTable(answer, "ListaPreguntasCategorias");
            } else if (typeSearch.equals("Texto de pregunta")) {
                answer = questionService.getQuestionText(txtSearchText.getText());
                loadQuestionTable(answer, "PreguntasPorTexto");
            }
            //se llama el cargar tabla
        }
    }

    //Aqui activamos y desactivamos componentes segun el tipo de busca queda que la persona aplique 
    private void typesActiveSearchComponents() {
        txtSearchText.clear();
        cmbCategories.clear();
        String typeSearch = cmbFilterType.getValue();
        if ((typeSearch == null) || (typeSearch.equals("Todas")) || (typeSearch.equals("Preguntas activas")) || (typeSearch.equals("Preguntas inactivas"))) {
            if (typeSearch != null) {
                btnSearch.setDisable(false);
            }
            cmbCategories.setVisible(false);
            cmbCategories.setDisable(true);
            cmbCategories.setManaged(false);
            txtSearchText.setVisible(false);
            txtSearchText.setDisable(true);
            txtSearchText.setManaged(false);
        } else if (typeSearch.equals("Categorias")) {
            btnSearch.setDisable(true);
            cmbCategories.setVisible(true);
            cmbCategories.setDisable(false);
            cmbCategories.setManaged(true);
            txtSearchText.setVisible(false);
            txtSearchText.setDisable(true);
            txtSearchText.setManaged(false);
        } else if (typeSearch.equals("Texto de pregunta")) {
            btnSearch.setDisable(false);
            cmbCategories.setVisible(false);
            cmbCategories.setDisable(true);
            cmbCategories.setManaged(false);
            txtSearchText.setVisible(true);
            txtSearchText.setDisable(false);
            txtSearchText.setManaged(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeComponent();
    }

    @Override
    public void initialize() {
        //initializeComponent();
    }

}
