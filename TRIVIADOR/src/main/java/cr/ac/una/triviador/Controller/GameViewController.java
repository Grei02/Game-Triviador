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
import java.util.Random;
import java.util.ResourceBundle;

public class GameViewController extends Controller implements Initializable {

    @FXML
    private ImageView imgRuleta;
    @FXML
    private ImageView imgGirar;

    private Integer TotalRotationAngleRouletteImage = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @Override
    public void initialize() {

    }

    @FXML
    private void onMouseClickedGirar(MouseEvent event) {
        rouletteMechanism();
    }

    private void rouletteMechanism() {
        Random rand = new Random();
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(imgRuleta);
        Integer AngleRouletteImage = rand.nextInt(1080) + 360;
        //  rotateTransition.setDuration(Duration.ofSeconds(2)); // Duración de la animación
        rotateTransition.setByAngle(AngleRouletteImage); // Ángulo de rotación
        rotateTransition.setCycleCount(1); // Número de veces que se repite la animación
        rotateTransition.setAutoReverse(false); // No revertir la animación
        TotalRotationAngleRouletteImage += AngleRouletteImage;
        rotateTransition.play();
        identifyCategoryAngle();
    }

    private void identifyCategoryAngle() {
        double angle = 360 / 7;
        System.out.println("total:" + TotalRotationAngleRouletteImage);
        Integer auxTotalRotationAngleRouletteImage = TotalRotationAngleRouletteImage;
        while (auxTotalRotationAngleRouletteImage >= 360) {
            auxTotalRotationAngleRouletteImage -= 360;
        }

        if ((auxTotalRotationAngleRouletteImage >= 0) && (auxTotalRotationAngleRouletteImage <= angle)) {
            System.out.println("Historia");
        } else if (auxTotalRotationAngleRouletteImage <= (angle * 2)) {
            System.out.println("Ciencia");
        } else if (auxTotalRotationAngleRouletteImage <= (angle * 3)) {
            System.out.println("Geografia");
        } else if (auxTotalRotationAngleRouletteImage <= (angle * 4)) {
            System.out.println("Corona");
        } else if (auxTotalRotationAngleRouletteImage <= (angle * 5)) {
            System.out.println("Entretenimiento");
        } else if (auxTotalRotationAngleRouletteImage <= (angle * 6)) {
            System.out.println("Arte");
        } else if (auxTotalRotationAngleRouletteImage <= 360) {
            System.out.println("Deporte");
        }
        System.out.println("total:" + TotalRotationAngleRouletteImage);
    }
}
