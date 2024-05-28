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

/**
 *
 * @author Sofia Bejarano Mora
 */
public class TrivPlayersWildcardGameDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private SimpleStringProperty id;
    private SimpleBooleanProperty isUsed;
    private Long version;
    private TrivGame gamId;
    private TrivPlayers plaId;
    private TrivWildcard wildId;

    public TrivPlayersWildcardGameDto() {
        this.id = new SimpleStringProperty("");
        this.isUsed = new SimpleBooleanProperty(false);
    }

    public TrivPlayersWildcardGameDto(TrivPlayersWildcardGame playersWildcardGame) {
        this.id.set(playersWildcardGame.getId().toString());
        this.isUsed.set(playersWildcardGame.getIsUsed().equals("0"));
        this.version = playersWildcardGame.getVersion();
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

    public String getIsUsed() {
        return isUsed.get() ? "0" : "1";
    }

    public void setIsUsed(String isUsed) {
        this.isUsed.set(isUsed.equalsIgnoreCase("0"));
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivGame getGamId() {
        return gamId;
    }

    public void setGamId(TrivGame gamId) {
        this.gamId = gamId;
    }

    public TrivPlayers getPlaId() {
        return plaId;
    }

    public void setPlaId(TrivPlayers plaId) {
        this.plaId = plaId;
    }

    public TrivWildcard getWildId() {
        return wildId;
    }

    public void setWildId(TrivWildcard wildId) {
        this.wildId = wildId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TrivPlayersWildcardGameDto)) {
            return false;
        }
        TrivPlayersWildcardGameDto other = (TrivPlayersWildcardGameDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersWildcardGame[ id=" + id + " ]";
    }

}
