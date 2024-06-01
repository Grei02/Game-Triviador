
package cr.ac.una.triviador.model;

import java.io.Serializable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TrivPlayersWildcardGameDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private SimpleStringProperty id;
    private SimpleBooleanProperty isUsed;
    private Long version;
    private TrivGameDto gameDto;
    private TrivPlayersDto player;
    private TrivWildcardDto WildcardDto;

    public TrivPlayersWildcardGameDto() {
        this.id = new SimpleStringProperty("");
        this.isUsed = new SimpleBooleanProperty(false);
    }

    public TrivPlayersWildcardGameDto(TrivPlayersWildcardGame playersWildcardGame) {
        this.id.set(playersWildcardGame.getId().toString());
        this.isUsed.set(playersWildcardGame.getIsUsed().equals("1"));
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
        return isUsed.get() ? "1" : "0";
    }

    public void setIsUsed(String isUsed) {
        this.isUsed.set(isUsed.equals("1"));
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivGameDto getGameDto() {
        return gameDto;
    }

    public void setGameDto(TrivGameDto gameDto) {
        this.gameDto = gameDto;
    }

    public TrivPlayersDto getPlaId() {
        return player;
    }

    public void setPlaId(TrivPlayersDto player) {
        this.player = player;
    }

    public TrivWildcardDto getWildcardDto() {
        return WildcardDto;
    }

    public void setWildcardDto(TrivWildcardDto WildcardDto) {
        this.WildcardDto = WildcardDto;
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
