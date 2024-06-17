
package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HowToPlayController extends Controller implements Initializable {

    @FXML
    private AnchorPane imgTriviador;
    @FXML
    private AnchorPane imgTriviador2;
    @FXML
    private AnchorPane imgModalidages;
    @FXML
    private ImageView imgSalir;

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
