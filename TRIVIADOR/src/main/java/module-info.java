module cr.ac.una.triviador {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.fxml;
    requires MaterialFX;
    requires VirtualizedFX;
    requires mfx.core;
    requires mfx.localization;
    requires mfx.effects;
    requires mfx.resources;
    requires com.oracle.database.jdbc;
    //requires eclipselink;
    requires jakarta.persistence;
   requires jakarta.xml.bind;
    requires com.sun.tools.xjc;
    requires com.sun.xml.bind.core;
    requires org.eclipse.persistence.core;
    requires org.eclipse.persistence.asm;
    requires eclipselink.antlr;
    requires org.eclipse.persistence.jpa;
    requires org.eclipse.persistence.jpa.jpql;
    requires org.eclipse.persistence.moxy;
    requires java.persistence;
    requires org.eclipse.persistence.jpa.modelgen.processor;
    requires java.logging;
    
    opens cr.ac.una.triviador to javafx.fxml;
    opens cr.ac.una.triviador.controller to javafx.fxml;
    //opens cr.ac.una.triviador.entities to jakarta.persistence, org.eclipse.persistence.core;
    
    exports cr.ac.una.triviador;
    requires java.base;
}
