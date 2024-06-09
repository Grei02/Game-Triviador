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
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.util.Duration.seconds;

public class GameViewController extends Controller implements Initializable {

    private static final Duration ROTATION_DURATION = Duration.ofSeconds(2);

    private Integer TotalRotationAngleRouletteImage = 0;
    private boolean isRuletaGirando=false;
    
    @FXML
    private ImageView imgRuleta;
    @FXML
    private ImageView imgGirar;
    @FXML
    private Canvas canvasTrapezoids;

    @FXML
    private void onMouseClickedGirar(MouseEvent event) {
      if (!isRuletaGirando) { // Agrega una bandera para evitar múltiples clics
        isRuletaGirando = true; // Define esta variable en tu clase (boolean isRuletaGirando = false;)
        rouletteMechanism();
        identifyCategoryAngle(); 
    }
    }

    private void rouletteMechanism() {
        Random rand = new Random();
        RotateTransition rotateTransition = new RotateTransition(seconds(2.5), imgRuleta);
        Integer AngleRouletteImage = rand.nextInt(1080) + 360;
        rotateTransition.setByAngle(AngleRouletteImage); // Ángulo de rotación
        rotateTransition.setCycleCount(0); // Número de veces que se repite la animación
        rotateTransition.setAutoReverse(false); // No revertir la animación
        TotalRotationAngleRouletteImage += AngleRouletteImage;
        rotateTransition.play();
        identifyCategoryAngle();
         isRuletaGirando = false; 
    }

    private void identifyCategoryAngle() {
        System.out.println("total:" + TotalRotationAngleRouletteImage);
        Integer auxTotalRotationAngleRouletteImage = TotalRotationAngleRouletteImage;
        while (auxTotalRotationAngleRouletteImage >= 360) {
            auxTotalRotationAngleRouletteImage -= 360;
        }
        if ((auxTotalRotationAngleRouletteImage >= 0) && (auxTotalRotationAngleRouletteImage <= 360 / 7)) {
            System.out.println("Historia");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 2)) {
            System.out.println("Ciencia");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 3)) {
            System.out.println("Geografia");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 4)) {
            System.out.println("Corona");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 5)) {
            System.out.println("Entretenimiento");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 6)) {
            System.out.println("Arte");
        } else if (auxTotalRotationAngleRouletteImage <= 360) {
            System.out.println("Deporte");
        }
        System.out.println("total:" + TotalRotationAngleRouletteImage);
    }
    private void drawTrapezoids() {
        GraphicsContext gc = canvasTrapezoids.getGraphicsContext2D();
        gc.clearRect(0, 0, canvasTrapezoids.getWidth(), canvasTrapezoids.getHeight());

        double centerX = canvasTrapezoids.getWidth() / 2;
        double centerY = canvasTrapezoids.getHeight() / 2;
        double mainCircleRadius = 150;

        // Dibujar el círculo principal
        gc.setFill(Color.LIGHTGRAY);
        gc.fillOval(centerX - mainCircleRadius, centerY - mainCircleRadius, 2 * mainCircleRadius, 2 * mainCircleRadius);

        // Dibujar trapecios alrededor del círculo
        double innerRadius = mainCircleRadius;
        double outerRadius = mainCircleRadius + 50;
        int numTrapezoids = 16;
        double angleStep = 2 * Math.PI / numTrapezoids;
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};

        for (int i = 0; i < numTrapezoids; i++) {
            double angle1 = i * angleStep;
            double angle2 = (i + 1) * angleStep;

            double x1Inner = centerX + innerRadius * Math.cos(angle1);
            double y1Inner = centerY + innerRadius * Math.sin(angle1);
            double x2Inner = centerX + innerRadius * Math.cos(angle2);
            double y2Inner = centerY + innerRadius * Math.sin(angle2);

            double x1Outer = centerX + outerRadius * Math.cos(angle1);
            double y1Outer = centerY + outerRadius * Math.sin(angle1);
            double x2Outer = centerX + outerRadius * Math.cos(angle2);
            double y2Outer = centerY + outerRadius * Math.sin(angle2);

            gc.setFill(colors[i / (numTrapezoids / 4)]);
            gc.beginPath();
            gc.moveTo(x1Inner, y1Inner);
            gc.lineTo(x2Inner, y2Inner);
            gc.lineTo(x2Outer, y2Outer);
            gc.lineTo(x1Outer, y1Outer);
            gc.closePath();
            gc.fill();
            gc.setStroke(Color.BLACK);
            gc.stroke();
        }
    }
       @Override
    public void initialize(URL url, ResourceBundle rb) {
drawTrapezoids() ;  
    }

    @Override
    public void initialize() {

    }
}
