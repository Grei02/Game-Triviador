package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.util.FlowController;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoadGameController extends Controller implements Initializable {

    @FXML
    private MFXLegacyTableView<?> tabAvailableGames;

    @FXML
    private MFXLegacyTableView<?> tabGamePlayer;

    @FXML
    private ImageView imgSalir;


    void onActionBtnAdd(ActionEvent event) {

    }

    void onActionBtnCancel(ActionEvent event) {

    }

    void onActionBtnChangeName(ActionEvent event) {

    }

    void onActionBtnEliminate(ActionEvent event) {

    }

    void onActionBtnSave(ActionEvent event) {

    }

    void onActionTxtName(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @Override
    public void initialize() {
    }

    @FXML
    private void onMouseClickedSalir(MouseEvent event) {
     FlowController.getInstance().goViewInStage("principalView", getStage());
    }
    
}
