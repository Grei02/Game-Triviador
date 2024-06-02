package cr.ac.una.triviador.Controller;

import cr.ac.una.triviador.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class PrincipalViewController extends Controller implements Initializable {

    @FXML
    private MenuItem itemLoadGame;
    @FXML
    private MenuItem itemStartGame;
    @FXML
    private MenuItem itemAbout;
    @FXML
    private MenuItem itemHowToPlay;
    @FXML
    private MenuItem itemSeeRanking;
    @FXML
    private MenuItem itemSeeProfile;
    @FXML
    private MenuItem itemManageQuestions;
    @FXML
    private ImageView imgPrincipal;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionItemLoadGame(ActionEvent event) {
   FlowController.getInstance().goViewInStage("LoadGameView", getStage());
    }

    @FXML
    private void onActioniIemStartGame(ActionEvent event) {
         FlowController.getInstance().goViewInStage("CreateGameView", getStage());
    }

    @FXML
    private void onActionItemAbout(ActionEvent event) {
        FlowController.getInstance().goViewInStage("aboutView", getStage());
    }

    @FXML
    private void onActionItemHowToPlay(ActionEvent event) {
        
    }

    @FXML
    private void onActionItemSeeRanking(ActionEvent event) {
    }

    @FXML
    private void onActionItemSeeProfile(ActionEvent event) {
    }

    @FXML
    private void onAxtionItemManageQuestions(ActionEvent event) {
    }
}
