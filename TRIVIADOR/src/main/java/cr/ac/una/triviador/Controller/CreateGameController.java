package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivGameDto;
import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.service.gameService;
import cr.ac.una.triviador.service.playersService;
import cr.ac.una.triviador.util.BindingUtils;
import cr.ac.una.triviador.util.FlowController;
import cr.ac.una.triviador.util.Formato;
import cr.ac.una.triviador.util.Mensaje;
import cr.ac.una.triviador.util.Respuesta;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javax.management.StringValueExp;

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

    private ObservableList<TrivPlayersDto> playerDtoObservableList = FXCollections.observableArrayList();
    private TrivGameDto gameDto;
    private List<Node> required = new ArrayList<>();

    @FXML
    void onActionBtnPlayerRegistration(ActionEvent event) {
        FlowController.getInstance().goViewInStage("PlayerRegistrationView", getStage());
    }

    @FXML
    private void onActionCmbNumberPlayer(ActionEvent event) {

    }

    @FXML
    private void onActionChbTimeLimit(ActionEvent event) {
        if (!chbTimeLimit.isSelected()) {
            cmbTimeLimit.setDisable(true);
        } else {
            cmbTimeLimit.setDisable(false);
        }
    }

    @FXML
    private void onActionBtnStartGame(ActionEvent event) {
        try {
            String invalidate = validateRequired();
            if (!invalidate.isBlank()) {
                new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Partida", getStage(), invalidate);
            } else {
                if (getPlayersTable()) {
                    if (!chbTimeLimit.isSelected()) {
                        gameDto.setTime(0L);
                    }
                    gameService gameService = new gameService();
                    List <TrivPlayersDto> playerDtoList;
                    Respuesta respuesta = gameService.saveGame(this.gameDto);
                    if (respuesta.getEstado()) {
                        unbindGame();
                        this.gameDto = (TrivGameDto) respuesta.getResultado("Partida");
                        bindGame();
                        new Mensaje().showModal(Alert.AlertType.CONFIRMATION, "Iniciar Partida", getStage(), "Partida Iniciada");
                    } else {
                        new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Partida", getStage(), respuesta.getMensaje());
                    }
                } else {
                    new Mensaje().showModal(Alert.AlertType.ERROR, "Iniciar Partida", getStage(), "Te faltan escoger participantes");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(gameService.class.getName()).log(Level.SEVERE, "Error al iniciar la partida", ex);
            new Mensaje().showModal(Alert.AlertType.ERROR, "Error al iniciar la partida", getStage(), "Ocurrio un error al iniciar la partida.");
        }
    }

    @FXML
    private void onActionBtnReturnBeginning(ActionEvent event) {

    }

    private Boolean getPlayersTable() {
        tbvPlayers.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        int totalSelected = playerDtoObservableList.size();
        if (Integer.parseInt(cmbNumberPlayer.getValue()) <= totalSelected) {
            playerDtoObservableList = tbvPlayers.getSelectionModel().getSelectedItems();
            int startIndex = Math.max(totalSelected - Integer.parseInt(cmbNumberPlayer.getValue()), 0);
            ObservableList<TrivPlayersDto> lastSixSelected = FXCollections.observableArrayList(playerDtoObservableList.subList(startIndex, totalSelected));
            return true;
        }
        return false;
    }

    private void indicateRequired() {
        required.clear();
        required.addAll(Arrays.asList(txtName, cmbDifficuity, cmbNumberPlayer));
    }

    private String validateRequired() {
        Boolean validos = true;
        String invalidos = "";
        for (Node node : required) {
            if (node instanceof MFXTextField && (((MFXTextField) node).getText() == null || ((MFXTextField) node).getText().isBlank())) {
                if (validos) {
                    invalidos += ((MFXTextField) node).getFloatingText();
                } else {
                    invalidos += "," + ((MFXTextField) node).getFloatingText();
                }
                validos = false;
            } else if (node instanceof MFXPasswordField && (((MFXPasswordField) node).getText() == null || ((MFXPasswordField) node).getText().isBlank())) {
                if (validos) {
                    invalidos += ((MFXPasswordField) node).getFloatingText();
                } else {
                    invalidos += "," + ((MFXPasswordField) node).getFloatingText();
                }
                validos = false;
            } else if (node instanceof MFXDatePicker && ((MFXDatePicker) node).getValue() == null) {
                if (validos) {
                    invalidos += ((MFXDatePicker) node).getFloatingText();
                } else {
                    invalidos += "," + ((MFXDatePicker) node).getFloatingText();
                }
                validos = false;
            } else if (node instanceof MFXComboBox && ((MFXComboBox) node).getSelectionModel().getSelectedIndex() < 0) {
                if (validos) {
                    invalidos += ((MFXComboBox) node).getFloatingText();
                } else {
                    invalidos += "," + ((MFXComboBox) node).getFloatingText();
                }
                validos = false;
            }
        }
        if (validos) {
            return "";
        } else {
            return "Campos requeridos o con problemas de formato [" + invalidos + "].";
        }
    }

    private void newGame() {
        gameDto = new TrivGameDto();
        unbindGame();
        bindGame();
    }

    private void bindGame() {
        txtName.textProperty().bindBidirectional(gameDto.name);
        chbTimeLimit.selectedProperty().bindBidirectional(gameDto.isTime);
        rbtDuelMode.selectedProperty().bindBidirectional(gameDto.isDuel);
        cmbDifficuity.textProperty().bindBidirectional(gameDto.difficulty);
        cmbNumberPlayer.textProperty().bindBidirectional(gameDto.numberplayer);
        cmbTimeLimit.textProperty().bindBidirectional(gameDto.time);
    }

    private void unbindGame() {
        txtName.textProperty().unbindBidirectional(gameDto.name);
        chbTimeLimit.selectedProperty().unbindBidirectional(gameDto.isTime);
        rbtDuelMode.selectedProperty().unbindBidirectional(gameDto.isDuel);
        cmbDifficuity.textProperty().unbindBidirectional(gameDto.difficulty);
        cmbNumberPlayer.textProperty().unbindBidirectional(gameDto.numberplayer);
        cmbTimeLimit.textProperty().unbindBidirectional(gameDto.time);
    }

    private void loadPlayerTable() {
        playersService playerService = new playersService();
        Respuesta answer = playerService.loadAllPlayer();
        if (answer.getEstado()) {
            playerDtoObservableList = FXCollections.observableArrayList((List<TrivPlayersDto>) answer.getResultado("ListaJugadores"));
            tbvPlayers.getItems().clear();
            tbvPlayers.getItems().addAll(playerDtoObservableList);
            tbvPlayers.refresh();
        }
    }

    private void initializeView() {
        initializeComboBox();
        colPlayer.setCellValueFactory(cd -> cd.getValue().name);
        loadPlayerTable();
        txtName.delegateSetTextFormatter(Formato.getInstance().letrasFormat(30));
        newGame();
        indicateRequired();
        cmbTimeLimit.setDisable(true);
    }

    private void initializeComboBox() {
        ObservableList<String> numberPlayer = FXCollections.observableArrayList("2", "3", "4", "5", "6");
        cmbNumberPlayer.setItems(numberPlayer);
        ObservableList<String> difficuity = FXCollections.observableArrayList("Facil", "Intermedio", "Dificil");
        cmbDifficuity.setItems(difficuity);
        ObservableList<String> timeLimit = FXCollections.observableArrayList("10", "20", "30");
        cmbTimeLimit.setItems(timeLimit);

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
