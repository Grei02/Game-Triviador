package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.service.playersService;
import cr.ac.una.triviador.util.FlowController;
import cr.ac.una.triviador.util.Formato;
import cr.ac.una.triviador.util.Mensaje;
import cr.ac.una.triviador.util.Respuesta;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Window;

public class PlayerRegistrationController extends Controller implements Initializable {

    private TrivPlayersDto playerDto;
    private ObservableList<TrivPlayersDto> playerDtolist=FXCollections.observableArrayList();

    @FXML
    private MFXButton btnAdd;

    @FXML
    private MFXButton btnCancel;

    @FXML
    private MFXButton btnChangeName;

    @FXML
    private MFXButton btnEliminate;

    @FXML
    private MFXButton btnSave;

    @FXML
    private MFXLegacyTableView<TrivPlayersDto> tabRegistered;

    @FXML
    private MFXTextField txtName;
    @FXML
    private TableColumn<TrivPlayersDto, String> colNamePlayers;
    @FXML
    private ImageView imgSalir;

    @FXML
    void onActionBtnAdd(ActionEvent event) {
        savePlayer();
        txtName.clear();
        loadPlayerTable();
    }

    @FXML
    void onActionBtnCancel(ActionEvent event) {
        txtName.clear();
        enableButtonsChangePlayerName(false);
    }

    @FXML
    void onActionBtnChangeName(ActionEvent event) {
        playerDto = tabRegistered.getSelectionModel().getSelectedItem();
        if (playerDto != null) {
            enableButtonsChangePlayerName(true);
            txtName.setText(playerDto.getName());
            tabRegistered.getSelectionModel().clearSelection();
        } else {
            new Mensaje().showModal(Alert.AlertType.ERROR, "Cambiar Nombre", getStage(), "No se ha seleccionado ningún jugador");
        }
    }

    @FXML
    void onActionBtnEliminate(ActionEvent event) {
        try {
            Window window = btnEliminate.getScene().getWindow();
            playerDto = tabRegistered.getSelectionModel().getSelectedItem();
            if (playerDto != null) {
                if (new Mensaje().showConfirmation("Eliminar Jugador", window, "¿Estás seguro de que deseas eliminar al jugador "+playerDto.getName()+" ?")) {
                    playersService playerService = new playersService();
                    Respuesta answer = playerService.deletePlayer(this.playerDto);
                    if (answer.getEstado()) {
                        newPlayer();
                        new Mensaje().showModal(Alert.AlertType.CONFIRMATION, "Eliminar Jugador", getStage(), "Jugador Eliminado");
                        loadPlayerTable();
                        tabRegistered.getSelectionModel().clearSelection();
                    } else {
                        new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Jugador", getStage(), answer.getMensaje());
                    }
                }
            } else {
                new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Jugador", getStage(), "No se ha seleccionado ningún jugador");
            }
        } catch (Exception ex) {
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error Eliminar el jugador ", ex);
            new Mensaje().showModal(Alert.AlertType.ERROR, "Eliminar Jugador", getStage(), "Ocurrio un error al Eliminar el jugador.");
        }
    }

    @FXML
    void onActionBtnSave(ActionEvent event) {
        savePlayer();
        txtName.clear();
        tabRegistered.getSelectionModel().clearSelection();
        enableButtonsChangePlayerName(false);
    }

    private void savePlayer() {
        try {
            String name = txtName.getText();
            if (name.isBlank()) {
                new Mensaje().showModal(Alert.AlertType.ERROR, "Guardar Jugador", getStage(), "Se encuentra un espacio vacio");
            } else {
                playersService playerService = new playersService();
                Respuesta answer = playerService.savePlayer(this.playerDto);
                if (answer.getEstado()) {
                    unbindPlayer();
                    this.playerDto = (TrivPlayersDto) answer.getResultado("Jugador");
                    bindPlayer();
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Guardar Jugador", getStage(), "Jugador Guardado");
                    txtName.clear();
                } else {
                    new Mensaje().showModal(Alert.AlertType.INFORMATION, "Guardar Jugador", getStage(), answer.getMensaje());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(playersService.class.getName()).log(Level.SEVERE, "Error guardar el jugador ", ex);
            new Mensaje().showModal(Alert.AlertType.ERROR, "Guardar Jugador", getStage(), "Ocurrio un error al guardar el jugador.");
        }
    }

    private void loadPlayerTable() {
        playersService playerService = new playersService();
        Respuesta answer = playerService.loadAllPlayer();
        if (answer.getEstado()) {
            playerDtolist = FXCollections.observableArrayList((List<TrivPlayersDto>) answer.getResultado("ListaJugadores"));
            tabRegistered.getItems().clear();
            tabRegistered.getItems().addAll(playerDtolist);
            tabRegistered.refresh();
        }
    }

    private void newPlayer() {
        playerDto = new TrivPlayersDto();
        unbindPlayer();
        bindPlayer();
        txtName.clear();
        txtName.requestFocus();
    }

    private void bindPlayer() {
        if (playerDto != null) {
            txtName.textProperty().bindBidirectional(playerDto.name);
        }
    }

    private void unbindPlayer() {
        if (playerDto != null) {
            txtName.textProperty().unbindBidirectional(playerDto.name);
        }
    }

    private void enableButtonsChangePlayerName(Boolean enable) {
        //enable=true
        btnCancel.setDisable(!enable);//habilitado
        btnSave.setDisable(!enable);//habilitado

        btnEliminate.setDisable(enable);//deshabilitado
        btnChangeName.setDisable(enable);//deshabilitado
        btnAdd.setDisable(enable);//deshabilitado
        btnAdd.setVisible(!enable);//no visible
        btnAdd.setManaged(!enable);//no consume espacio
//        button.setManaged(false); // Deshabilitar la administración del botón por su contenedor
//        button.setVisible(false); // Oculta el botón
//        button.setDisable(true); // Desactiva el botón
    }
    
    private void initializeView() {
        txtName.delegateSetTextFormatter(Formato.getInstance().letrasFormat(20));
        newPlayer();
        colNamePlayers.setCellValueFactory(cd -> cd.getValue().name);
        loadPlayerTable();
        enableButtonsChangePlayerName(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeView();
    }

    @Override
    public void initialize() {
        initializeView();
    }

    @FXML
    private void onMouseClickedSalir(MouseEvent event) {
     FlowController.getInstance().goViewInStage("principalView", getStage());
    }

}
