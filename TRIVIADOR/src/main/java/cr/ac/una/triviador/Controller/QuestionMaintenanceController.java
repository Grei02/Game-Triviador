
package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.model.TrivCategoriesDto;
import cr.ac.una.triviador.model.TrivQuestionsDto;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXRadioButton;
import io.github.palexdev.materialfx.controls.MFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class QuestionMaintenanceController implements Initializable {

    @FXML
    private MFXTextField txtQuestion;
    @FXML
    private MFXTextField txtAnswer1;
    @FXML
    private MFXTextField txtAnswer2;
    @FXML
    private MFXTextField txtAnswer3;
    @FXML
    private MFXTextField txtAnswer4;
    @FXML
    private MFXRadioButton btrActiveQuestion;
    @FXML
    private MFXComboBox<TrivQuestionsDto> cmbCorrectQuestion;
    @FXML
    private MFXComboBox<TrivCategoriesDto> cmbCategoryQuestion;
    @FXML
    private MFXButton btnCancel;
    @FXML
    private MFXButton btnSaveQuestion;
    @FXML
    private MFXButton btnDeleteQuestion;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void onActionBtnCancel(ActionEvent event) {
    }

    @FXML
    private void onActionBtnSaveQuestion(ActionEvent event) {
    }

    @FXML
    private void onActionBtnDeleteQuestion(ActionEvent event) {
    }
    
}
