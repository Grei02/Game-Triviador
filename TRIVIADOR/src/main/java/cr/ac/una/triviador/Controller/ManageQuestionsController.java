package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.model.TrivQuestionsDto;
import cr.ac.una.triviador.service.playersService;
import cr.ac.una.triviador.util.Respuesta;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

public class ManageQuestionsController extends Controller implements Initializable {

    private ObservableList<TrivPlayersDto> playerDtolist = FXCollections.observableArrayList();
    
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

//    private void loadPlayerTable() {
//        playersService playerService = new playersService();
//        Respuesta answer = playerService.loadAllPlayer();
//        if (answer.getEstado()) {
//            playerDtolist = FXCollections.observableArrayList((List<TrivPlayersDto>) answer.getResultado("ListaJugadores"));
//            tbvQuestion.getItems().clear();
//            tbvQuestion.getItems().addAll(playerDtolist);
//            tbvQuestion.refresh();
//        }
//    }

    private void initializeComponent() {
        cmbFilterType.getItems().addAll("Categorias", "Texto de pregunta", "Preguntas activas", "Preguntas inactivas", "Todas");
        cmbCategories.getItems().addAll("Geografia", "Historia ", "Arte", "Ciencia", "Entretenimiento", "Deportes");
        typesActiveSearchComponents();
       // colQuestion.setCellValueFactory(cd -> cd.getValue().name);
       // loadPlayerTable();
       
    }
    
    private void typesActiveSearchComponents() {
        String typeSearch = cmbFilterType.getValue();
        if ((typeSearch == null) || (typeSearch.equals("Todas")) || (typeSearch.equals("Preguntas activas")) || (typeSearch.equals("Preguntas inactivas"))) {
            cmbCategories.setVisible(false);
            cmbCategories.setDisable(true);
            cmbCategories.setManaged(false);
            txtSearchText.setVisible(false);
            txtSearchText.setDisable(true);
            txtSearchText.setManaged(false);
        }
        else if (typeSearch.equals("Categorias")) {
            cmbCategories.setVisible(true);
            cmbCategories.setDisable(false);
            cmbCategories.setManaged(true);
            txtSearchText.setVisible(false);
            txtSearchText.setDisable(true);
            txtSearchText.setManaged(false);
        } else if (typeSearch.equals("Texto de pregunta")) {
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
