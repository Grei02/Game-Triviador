 package cr.ac.una.triviador.Controller;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.controls.legacy.MFXLegacyTableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class CreateGameController extends Controller implements Initializable {

    @FXML
    private MFXButton btnPlayerRegistration;

    @FXML
    private MFXButton btnReturnBeginning;

    @FXML
    private MFXCheckbox chbTimeLimit;

    @FXML
    private MFXComboBox<?> cmbNumberPlayer;

    @FXML
    private MFXRadioButton rbtDuelMode;

    @FXML
    private MFXLegacyTableView<?> tbvDifficulty;

    @FXML
    private MFXLegacyTableView<?> tbvPlayers;

    @FXML
    private MFXLegacyTableView<?> tbvTimeLimit;

    @FXML
    private MFXTextField txtName;

    @FXML
    void onActionBtnPlayerRegistration(ActionEvent event) {

    }

    @FXML
    void onActionBtnReturnBeginning(ActionEvent event) {

    }

    @FXML
    void onActionChbTimeLimit(ActionEvent event) {

    }

    @FXML
    void onActionCmbNumberPlayer(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @Override
    public void initialize() {
    }
    
}
