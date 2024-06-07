package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivPlayersDto;
import cr.ac.una.triviador.service.playersService;
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

public class PlayerRegistrationController extends Controller implements Initializable {

    private TrivPlayersDto playerDto;
    ObservableList <TrivPlayersDto> playerDtolist; 
    
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
    void onActionBtnAdd(ActionEvent event) {
        savePlayer();
        txtName.clear();
        loadPlayerTable();
    }

    @FXML
    void onActionBtnCancel(ActionEvent event) {

    }

    @FXML
    void onActionBtnChangeName(ActionEvent event) {

    }

    @FXML
    void onActionBtnEliminate(ActionEvent event) {

    }

    @FXML
    void onActionBtnSave(ActionEvent event) {

    }

    @FXML
    void onActionTxtName(ActionEvent event) {

    }

    private void savePlayer() {
        try {
            String name = txtName.getText();
            if (name.isBlank()) {
                new Mensaje().showModal(Alert.AlertType.ERROR, "Hay espacios que no pueden estar vacios", getStage(), name);
            } else {
                playerDto.setName(name);
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
    
    private void loadPlayerTable(){
        playersService playerService=new playersService();
        Respuesta answer = playerService.loadAllPlayer();
        if(answer.getEstado()){
            playerDtolist = FXCollections.observableArrayList((List<TrivPlayersDto>)answer.getResultado("ListaJugadores"));
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
        txtName.textProperty().bindBidirectional(playerDto.name);
    }

    private void unbindPlayer() {
        txtName.textProperty().unbindBidirectional(playerDto.name);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtName.delegateSetTextFormatter(Formato.getInstance().letrasFormat(20));
        newPlayer();
        colNamePlayers.setCellValueFactory(cd->cd.getValue().name);
        loadPlayerTable();
    }

    @Override
    public void initialize() {

    }

}
