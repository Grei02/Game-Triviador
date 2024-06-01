
module module {
    opens cr.ac.una.triviador.Controller to javafx.fxml;
    exports cr.ac.una.triviador.Controller;
    exports cr.ac.una.triviador;
    
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires MaterialFX;
    requires VirtualizedFX;
    requires mfx.core;
    requires mfx.localization;
    requires mfx.effects;
    requires mfx.resources;
    requires com.oracle.database.jdbc;
    requires eclipselink;
    requires jakarta.persistence;
    requires jakarta.xml.bind;
    requires com.sun.tools.xjc;
    requires com.sun.xml.bind.core;
    /*    requires org.eclipse.persistence.core;
    requires org.eclipse.persistence.asm;
    requires eclipselink.antlr;
    requires org.eclipse.persistence.jpa;
    requires org.eclipse.persistence.jpa.jpql;
    requires org.eclipse.persistence.moxy;
    requires java.persistence;
    requires org.eclipse.persistence.jpa.modelgen.processor;*/
    requires jakarta.activation;
    requires java.base;
}
