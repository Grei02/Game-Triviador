module cr.ac.una.triviador {
    requires javafx.controls;
    requires java.logging;
    requires javafx.fxml;
    requires javafx.graphicsEmpty;

    opens cr.ac.una.triviador to javafx.fxml;
    exports cr.ac.una.triviador;
    requires MaterialFX;
    
}
