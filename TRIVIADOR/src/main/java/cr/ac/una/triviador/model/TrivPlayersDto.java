/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Sofia Bejarano Mora
 */
public class TrivPlayersDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private SimpleStringProperty countergamewin;
    private SimpleStringProperty countergamelose;
    private SimpleStringProperty counterconsecutivequestion;
    private SimpleStringProperty favoritecategory;
    private Long version;
    private List<TrivAchievements> achievementsList;
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    private List<TrivPlayersGame> trivPp;
    private List<TrivPlayersWildcardGame> playersWildcardGameList;
    private List<TrivQuestionsCategories> questionsCategoriesList;

    public TrivPlayersDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.description = new SimpleStringProperty("");
        this.countergamewin = new SimpleStringProperty("");
        this.countergamelose = new SimpleStringProperty("");
        this.counterconsecutivequestion = new SimpleStringProperty("");
        this.favoritecategory = new SimpleStringProperty("");
    }
    
        public TrivPlayersDto(TrivPlayers players) {
        this();
        this.id.set(players.getId().toString());
        this.name.set(players.getName());
        this.description.set(players.getDescription());
        this.countergamewin.set(players.getCountergamewin().toString());
        this.countergamelose.set(players.getCountergamelose().toString());
        this.counterconsecutivequestion.set(players.getCounterconsecutivequestion().toString());
        this.favoritecategory.set(players.getFavoritecategory());
        this.version = players.getVersion();
    }

    public Long getId() {
        if (this.id.get() != null & !this.id.get().isBlank()) {
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long plaId) {
        this.id.set(id.toString());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Long getCountergamewin() {
                if(this.countergamewin.get()!=null & !this.countergamewin.get().isBlank()){
            return Long.valueOf(countergamewin.get());
        }
        return null;
    }

    public void setCountergamewin(Long countergamewin) {
        this.countergamewin.set(countergamewin.toString());
    }

    public Long getCountergamelose() {
                if(this.countergamelose.get()!=null & !this.countergamelose.get().isBlank()){
            return Long.valueOf(countergamelose.get());
        }
        return null;
    }

    public void setCountergamelose(Long countergamelose) {
        this.countergamelose.set(countergamelose.toString());
    }

    public Long getCounterconsecutivequestion() {
                if(this.counterconsecutivequestion.get()!=null & !this.counterconsecutivequestion.get().isBlank()){
            return Long.valueOf(counterconsecutivequestion.get());
        }
        return null;
    }

    public void setCounterconsecutivequestion(Long counterconsecutivequestion) {
        this.counterconsecutivequestion.set(counterconsecutivequestion.toString());
    }

    public String getFavoritecategory() {
        return favoritecategory.get();
    }

    public void setFavoritecategory(String favoritecategory) {
        this.favoritecategory.set(favoritecategory);
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long plaVersion) {
        this.version = plaVersion;
    }

    public List<TrivAchievements> getAchievementsList() {
        return achievementsList;
    }

    public void setAchievementsList(List<TrivAchievements> achievementsList) {
        this.achievementsList = achievementsList;
    }

    public List<TrivPlayersCategoriesGame> getPlayersCategoriesGameList() {
        return playersCategoriesGameList;
    }

    public void setPlayersCategoriesGameList(List<TrivPlayersCategoriesGame> playersCategoriesGameList) {
        this.playersCategoriesGameList = playersCategoriesGameList;
    }

    public List<TrivPlayersGame> getTrivPp() {
        return trivPp;
    }

    public void setTrivPp(List<TrivPlayersGame> trivPp) {
        this.trivPp = trivPp;
    }

    public List<TrivPlayersWildcardGame> getPlayersWildcardGameList() {
        return playersWildcardGameList;
    }

    public void setPlayersWildcardGameList(List<TrivPlayersWildcardGame> playersWildcardGameList) {
        this.playersWildcardGameList = playersWildcardGameList;
    }

    public List<TrivQuestionsCategories> getQuestionsCategoriesList() {
        return questionsCategoriesList;
    }

    public void setQuestionsCategoriesList(List<TrivQuestionsCategories> questionsCategoriesList) {
        this.questionsCategoriesList = questionsCategoriesList;
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
        if (!(object instanceof TrivPlayersDto)) {
            return false;
        }
        TrivPlayersDto other = (TrivPlayersDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayers[ id=" + id + " ]";
    }
    
}
