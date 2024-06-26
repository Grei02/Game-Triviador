/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;

public class TrivAchievementsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public  SimpleStringProperty id;
    public SimpleStringProperty name;
    public SimpleStringProperty type;
    public SimpleStringProperty amount;
    public SimpleStringProperty description;
    public SimpleStringProperty nameImage;
    private Long version;
    //private List<TrivPlayersDto> playersDtoList;

    public TrivAchievementsDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.description = new SimpleStringProperty("");
        this.type = new SimpleStringProperty("");
        this.nameImage = new SimpleStringProperty("");
        this.amount = new SimpleStringProperty("");
    }

    public TrivAchievementsDto(Achievements trivAchievements) {
        this();
        this.id.set(trivAchievements.getId().toString());
        this.name.set(trivAchievements.getName());
        this.description.set(trivAchievements.getDescription());
        this.type.set(trivAchievements.getType());
        this.nameImage.set(trivAchievements.getNameImage());
        this.amount.set(trivAchievements.getAmount().toString());
        this.version = trivAchievements.getVersion();
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

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }
    
    public String getNameImage() {
        return nameImage.get();
    }

    public void setNameImageString (String nameImage) {
        this.nameImage.set(nameImage);
    }

    public Long getAmount() {
        if (this.amount.get() != null & !this.amount.get().isBlank()) {
            return Long.valueOf(amount.get());
        }
        return null;
    }

    public void setAmount(Long amount) {
        this.amount.set(amount.toString());
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

//    public List<TrivPlayersDto> getPlayersDtoList() {
//        return playersDtoList;
//    }
//    public void setPlayersList(List<TrivPlayersDto> playersListDto) {
//        this.playersDtoList = playersListDto;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TrivAchievementsDto)) {
            return false;
        }
        TrivAchievementsDto other = (TrivAchievementsDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivAchievements[ id=" + id + " ]";
    }
}
