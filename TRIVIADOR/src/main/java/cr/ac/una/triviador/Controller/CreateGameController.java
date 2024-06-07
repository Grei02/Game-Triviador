package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivGameDto;
import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.service.playersService;
import cr.ac.una.triviador.util.BindingUtils;
import cr.ac.una.triviador.util.FlowController;
import cr.ac.una.triviador.util.Formato;
import cr.ac.una.triviador.util.Respuesta;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
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
import javafx.scene.image.ImageView;

public class CreateGameController extends Controller implements Initializable {

    @FXML
    private ImageView imgLogo;
    @FXML
    private MFXTextField txtName;
    @FXML
    private MFXComboBox<String> cmbNumberPlayer;
    @FXML
    private MFXButton btnPlayerRegistration;
    @FXML
    private MFXLegacyTableView<TrivPlayersDto> tbvPlayers;
    @FXML
    private MFXRadioButton rbtDuelMode;
    @FXML
    private MFXCheckbox chbTimeLimit;
    @FXML
    private MFXComboBox<String> cmbTimeLimit;
    @FXML
    private MFXButton btnStartGame;
    @FXML
    private MFXButton btnReturnBeginning;
    @FXML
    private TableColumn<TrivPlayersDto, String> colPlayer;
    @FXML
    private MFXComboBox<String> cmbDifficuity;

    private ObservableList<TrivPlayersDto> playerDtolist=FXCollections.observableArrayList();
    private TrivGameDto gameDto;
    
    @FXML
    void onActionBtnPlayerRegistration(ActionEvent event) {
        FlowController.getInstance().goViewInStage("PlayerRegistrationView", getStage());
    }

    @FXML
    private void onActionCmbNumberPlayer(ActionEvent event) {
    }

    @FXML
    private void onActionChbTimeLimit(ActionEvent event) {
    }

    @FXML
    private void onActionBtnStartGame(ActionEvent event) {
        
    }

    @FXML
    private void onActionBtnReturnBeginning(ActionEvent event) {
        
    }

    private void bindGame(){
        txtName.textProperty().bindBidirectional(gameDto.name);
        chbTimeLimit.selectedProperty().bindBidirectional(gameDto.isTime);
      //  BindingUtils.bindToggleGroupToProperty(rbtDuelMode, gameDto.isDuel);
    }
    
    private void loadPlayerTable() {
        playersService playerService = new playersService();
        Respuesta answer = playerService.loadAllPlayer();
        if (answer.getEstado()) {
            playerDtolist = FXCollections.observableArrayList((List<TrivPlayersDto>) answer.getResultado("ListaJugadores"));
            tbvPlayers.getItems().clear();
            tbvPlayers.getItems().addAll(playerDtolist);
            tbvPlayers.refresh();
        }
    }
    
    private void initializeView() {
        initializeComboBox();
        colPlayer.setCellValueFactory(cd -> cd.getValue().name);
        loadPlayerTable();
        txtName.delegateSetTextFormatter(Formato.getInstance().letrasFormat(30));
    }

    private void initializeComboBox(){
        initializeComboBoxNumberPlayer();
        initializeComboBoxDifficuity();
        initializeComboBoxTimeLimit();
    }
    
    private void initializeComboBoxNumberPlayer(){
        ObservableList<String> numberPlayer = FXCollections.observableArrayList(
                "2", "3", "4", "5", "6"
        );
        cmbNumberPlayer.setItems(numberPlayer);
    }
    
    private void initializeComboBoxDifficuity(){
        ObservableList<String> numberPlayer = FXCollections.observableArrayList(
                "Facil", "Intermedio", "Dificil"
        );
        cmbDifficuity.setItems(numberPlayer);
    }
    
    private void initializeComboBoxTimeLimit(){
        ObservableList<String> numberPlayer = FXCollections.observableArrayList(
                "10", "20", "30"
        );
        cmbTimeLimit.setItems(numberPlayer);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeView();
    }

    @Override
    public void initialize() {
        initializeView();
    }
}
