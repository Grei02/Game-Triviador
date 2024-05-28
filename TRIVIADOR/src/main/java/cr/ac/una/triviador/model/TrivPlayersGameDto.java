/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TrivPlayersGameDto implements Serializable {

    private SimpleStringProperty id;
    private SimpleStringProperty nameworker;
    private SimpleStringProperty posboard;
    private SimpleStringProperty counterconsecutivequestion;
    private SimpleStringProperty numberturn;
    private SimpleBooleanProperty isCurrent;
    private Long version;
    private TrivGame gamId;
    private TrivPlayers plaId;

    public TrivPlayersGameDto() {
        this.id = new SimpleStringProperty("");
        this.nameworker = new SimpleStringProperty("");
        this.posboard = new SimpleStringProperty("");
        this.counterconsecutivequestion = new SimpleStringProperty("");
        this.numberturn = new SimpleStringProperty("");
        this.isCurrent = new SimpleBooleanProperty(false);
        this.gamId = gamId;
        this.plaId = plaId; 
    }

    public TrivPlayersGameDto(TrivPlayersGame playersGame) {
        this();
        this.id.set(playersGame.getId().toString());
        this.nameworker.set(playersGame.getNameworker());
        this.posboard.set(playersGame.getPosboard().toString());
        this.counterconsecutivequestion.set(playersGame.getCounterconsecutivequestion().toString());
        this.numberturn.set(playersGame.getNumberturn().toString());
        this.isCurrent.set(playersGame.getIsCurrent().equals("0"));
        this.version= playersGame.getVersion();
    }

    public Long getId() {
        if (this.id.get() != null & !this.id.get().isBlank()) {
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public String getNameworker() {
        return nameworker.get();
    }

    public void setNameworker(String nameworker) {
        this.nameworker.set(nameworker);
    }

    public Long getPosboard() {
        if (this.posboard.get() != null & !this.posboard.get().isBlank()) {
            return Long.valueOf(posboard.get());
        }
        return null;
    }

    public void setPosboard(Long posboard) {
        this.posboard.set(posboard.toString());
    }

    public Long getCounterconsecutivequestion() {
        if (this.counterconsecutivequestion.get() != null & !this.counterconsecutivequestion.get().isBlank()) {
            return Long.valueOf(counterconsecutivequestion.get());
        }
        return null;
    }

    public void setCounterconsecutivequestion(Long counterconsecutivequestion) {
        this.counterconsecutivequestion.set(counterconsecutivequestion.toString());
    }

    public Long getNumberturn() {
        if (this.numberturn.get() != null & !this.numberturn.get().isBlank()) {
            return Long.valueOf(numberturn.get());
        }
        return null;
    }

    public void setNumberturn(Long numberturn) {
        this.numberturn.set(numberturn.toString());
    }

    public String getIsCurrent() {
        return isCurrent.get() ? "0" : "1";
    }

    public void setIsCurrent(String isCurrent) {
        this.isCurrent.set(isCurrent.equalsIgnoreCase("0"));
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

//    public TrivGame getGamId() {
//        return gamId;
//    }
//
//    public void setGamId(TrivGame gamId) {
//        this.gamId = gamId;
//    }
//
//    public TrivPlayers getPlaId() {
//        return plaId;
//    }
//
//    public void setPlaId(TrivPlayers plaId) {
//        this.plaId = plaId;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayersGameDto)) {
            return false;
        }
        TrivPlayersGameDto other = (TrivPlayersGameDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersGame[ id=" + id + " ]";
    }
}
