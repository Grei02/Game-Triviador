/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

public class TrivPlayersCategoriesGameDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private SimpleStringProperty id;
    private Long version;
    private TrivCategoriesDto categoriesDto;
    private TrivGameDto gameDto;
    private TrivPlayersDto playerDto;
    
    public TrivPlayersCategoriesGameDto() {
        this.id = new SimpleStringProperty("");
    }

    public TrivPlayersCategoriesGameDto(TrivPlayersCategoriesGame playersCategoriesGame) {
        this();
        this.id.set(playersCategoriesGame.getCategories().toString());
        this.version=playersCategoriesGame.getVersion();
    }
    
    public Long getId() {
        if(this.id.get()!=null & !this.id.get().isBlank()){
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long id) {
       this.id.set(id.toString());
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivCategoriesDto getCategoriesDto() {
        return categoriesDto;
    }

    public void setCategoriesDto(TrivCategoriesDto categoriesDto) {
        this.categoriesDto = categoriesDto;
    }

    public TrivGameDto getGameDto() {
        return gameDto;
    }

    public void setGameDto(TrivGameDto gameDto) {
        this.gameDto = gameDto;
    }

    public TrivPlayersDto getPlayer() {
        return playerDto;
    }

    public void setPlayer(TrivPlayersDto playerDto) {
        this.playerDto = playerDto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayersCategoriesGameDto)) {
            return false;
        }
        TrivPlayersCategoriesGameDto other = (TrivPlayersCategoriesGameDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersCategoriesGame[ id=" + id + " ]";
    }
    
}
