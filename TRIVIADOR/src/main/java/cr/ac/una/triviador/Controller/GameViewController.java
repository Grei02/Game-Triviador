package cr.ac.una.triviador.Controller;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

import java.net.URL;
import java.util.ResourceBundle;

public class GameViewController extends Controller implements Initializable {

    @FXML
    private ImageView imgRuleta;
    @FXML
    private ImageView imgGirar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @Override
    public void initialize() {
        
    }

    @FXML
    private void onMouseClickedGirar(MouseEvent event) {
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(imgRuleta);
      //  rotateTransition.setDuration(Duration.ofSeconds(2)); // Duración de la animación
        rotateTransition.setByAngle(360); // Ángulo de rotación
        rotateTransition.setCycleCount(2); // Número de veces que se repite la animación
        rotateTransition.setAutoReverse(false); // No revertir la animación

        rotateTransition.play();
        
    }
    
}
