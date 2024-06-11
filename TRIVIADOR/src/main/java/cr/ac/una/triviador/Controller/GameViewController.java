package cr.ac.una.triviador.Controller;

import java.time.Duration;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import static javafx.util.Duration.seconds;

public class GameViewController extends Controller implements Initializable {
    
    private Integer TotalRotationAngleRouletteImage = 0;
    private boolean isRuletaGirando=false;
    
    @FXML
    private ImageView imgRuleta;
    @FXML
    private ImageView imgGirar;
    @FXML
    private Canvas canvasTrapezoids;
    @FXML
    private ImageView imgCategoria;

    @FXML
    private void onMouseClickedGirar(MouseEvent event) {
      if (!isRuletaGirando) { // Agrega una bandera para evitar múltiples clics
        isRuletaGirando = true; // Define esta variable en tu clase (boolean isRuletaGirando = false;)
        imgCategoria.setVisible(false);
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
         Image categoryImage = null;
        System.out.println("total:" + TotalRotationAngleRouletteImage);
        Integer auxTotalRotationAngleRouletteImage = TotalRotationAngleRouletteImage;
        while (auxTotalRotationAngleRouletteImage >= 360) {
            auxTotalRotationAngleRouletteImage -= 360;
        }
        if ((auxTotalRotationAngleRouletteImage >= 0) && (auxTotalRotationAngleRouletteImage <= 360 / 7)) {
            System.out.println("Historia");
             categoryImage = new Image("../resources/historiaFrente.png");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 2)) {
            System.out.println("Ciencia");
            categoryImage = new Image("../resources/cienciaFrente.png");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 3)) {
            System.out.println("Geografia");
            categoryImage = new Image("../resources/geografiaFrente.png");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 4)) {
            System.out.println("Corona");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 5)) {
            System.out.println("Entretenimiento");
            categoryImage = new Image("../resources/entretenimientoFrente.png");
        } else if (auxTotalRotationAngleRouletteImage <= ((360 / 7) * 6)) {
            System.out.println("Arte");
            categoryImage = new Image("../resources/arteFrente.png");
        } else if (auxTotalRotationAngleRouletteImage <= 360) {
            System.out.println("Deporte");
            categoryImage = new Image("../resources/deporteFrente.png");
        }
        System.out.println("total:" + TotalRotationAngleRouletteImage);
        imgCategoria.setImage(categoryImage);
        imgCategoria.setVisible(true); // Mostrar la imagen de la categoría
    }
    
   private void drawTrapezoids(int numberOfPlayers) {
        GraphicsContext gc = canvasTrapezoids.getGraphicsContext2D();
        double centerX = canvasTrapezoids.getWidth() / 2;
        double centerY = canvasTrapezoids.getHeight() / 2;
        double mainCircleRadius = 150;

        gc.setFill(Color.LIGHTGRAY);
        gc.fillOval(centerX - mainCircleRadius, centerY - mainCircleRadius, 2 * mainCircleRadius, 2 * mainCircleRadius);

        double innerRadius = mainCircleRadius;
        double outerRadius = mainCircleRadius + 50;
        int casillasPorJugador = 4;
        int totalCasillas = numberOfPlayers * casillasPorJugador;
        double angleStep = 2 * Math.PI / totalCasillas;
        Color[] playerColors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PURPLE};

        for (int i = 0; i < totalCasillas; i++) {
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

            gc.setFill(playerColors[i / casillasPorJugador]);
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
   int numberOfPlayers = 5; // Cambiar según el número de jugadores (2-6)
        drawTrapezoids(numberOfPlayers);
    }

    @Override
    public void initialize() {
    }
}
