
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;

public class TrivPlayersDto implements Serializable {

    private static final long serialVersionUID = 1L;
    public SimpleStringProperty id;
    public SimpleStringProperty name;
    public SimpleStringProperty description;
    public SimpleStringProperty countergamewin;
    public SimpleStringProperty countergamelose;
    public SimpleStringProperty counterconsecutivequestion;
    public SimpleStringProperty favoritecategory;
    private Long version;
    public List<TrivAchievementsDto> achievementDtoList;
    public List<TrivPlayersCategoriesGameDto> playerCategoryGameDtoList;
//    private List<TrivPlayersGameDto> playerGameDtoList; cometada
    public List<TrivPlayersWildcardGameDto> playerWildcardGameDtoList;
    public List<TrivQuestionsCategoriesDto> questionCategoryDtoList;

    public TrivPlayersDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.description = new SimpleStringProperty("");
        this.countergamewin = new SimpleStringProperty("");
        this.countergamelose = new SimpleStringProperty("");
        this.counterconsecutivequestion = new SimpleStringProperty("");
        this.favoritecategory = new SimpleStringProperty("");
        this.achievementDtoList=FXCollections.observableArrayList();
        this.playerCategoryGameDtoList=FXCollections.observableArrayList();
        this.playerWildcardGameDtoList=FXCollections.observableArrayList();
        this.questionCategoryDtoList=FXCollections.observableArrayList();
    }

    public TrivPlayersDto(Players players) {
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
          if (this.countergamewin.get() != null & !this.countergamewin.get().isBlank()) {
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

    public List<TrivAchievementsDto> getAchievementsList() {
        return achievementDtoList;
    }

    public void setAchievementsList(List<TrivAchievementsDto> achievementDtoList) {
        this.achievementDtoList = achievementDtoList;
    }

    public List<TrivPlayersCategoriesGameDto> getPlayersCategoriesGameList() {
        return playerCategoryGameDtoList;
    }

    public void setPlayersCategoriesGameList(List<TrivPlayersCategoriesGameDto> playerCategoryGameDtoList) {
        this.playerCategoryGameDtoList = playerCategoryGameDtoList;
    }

//    public List<TrivPlayersGameDto> getPlayersGameList() {
//        return playerGameDtoList;
//    }
//
//    public void setPlayersGameList(List<TrivPlayersGameDto> playerGameDtoList) {
//        this.playerGameDtoList = playerGameDtoList;
//    }

    public List<TrivPlayersWildcardGameDto> getPlayersWildcardGameList() {
        return playerWildcardGameDtoList;
    }

    public void setPlayersWildcardGameList(List<TrivPlayersWildcardGameDto> playerWildcardGameDtoList) {
        this.playerWildcardGameDtoList = playerWildcardGameDtoList;
    }

    public List<TrivQuestionsCategoriesDto> getQuestionsCategoriesList() {
        return questionCategoryDtoList;
    }

    public void setQuestionsCategoriesList(List<TrivQuestionsCategoriesDto> questionCategoryDtoList) {
        this.questionCategoryDtoList = questionCategoryDtoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
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
