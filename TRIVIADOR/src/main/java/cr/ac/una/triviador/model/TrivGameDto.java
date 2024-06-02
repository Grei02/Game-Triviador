/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TrivGameDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public SimpleStringProperty id;
    public SimpleStringProperty name;
    public SimpleStringProperty time;
    public SimpleBooleanProperty isTime;
    public SimpleStringProperty difficulty;
    public SimpleStringProperty numberplayer;
    public SimpleBooleanProperty isDuel;
    public SimpleStringProperty turn;
    public SimpleStringProperty counterround;
    private Long version;
    public List<TrivQuestionsDto> questionsDtoList;
    //private List<TrivPlayersCategoriesGameDto> playersCategoriesGameDtoList;
    public List<TrivPlayersGameDto> playersGameDtoList;
   // private List<TrivPlayersWildcardGameDto> playersWildcardGameDtoList;

    public TrivGameDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.time = new SimpleStringProperty("");
        this.isTime = new SimpleBooleanProperty(false);
        this.difficulty = new SimpleStringProperty("");
        this.numberplayer = new SimpleStringProperty("");
        this.isDuel = new SimpleBooleanProperty(false);
        this.turn = new SimpleStringProperty("");
        this.counterround = new SimpleStringProperty("");
    }

    public TrivGameDto(Game game) {
        this();
        this.id.set(game.getId().toString());
        this.name.set(game.getName());
        this.time.set(game.getTime().toString());
        this.isTime.set(game.getIsTime().equals("1"));
        this.difficulty.set(game.getDifficulty());
        this.numberplayer.set(game.getNumberplayer().toString());
        this.isDuel.set(game.getIsDuel().equals("1"));
        this.turn.set(game.getTurn().toString());
        this.counterround.set(game.getCounterround().toString());
        this.version =game.getVersion();
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

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public Long getTime() {
        if (this.time.get() != null & !this.time.get().isBlank()) {
            return Long.valueOf(time.get());
        }
        return null;
    }

    public void setTime(Long time) {
       this.id.set(id.toString());
    }

    public String getIsTime() {
        return isTime.get()?"1":"0";
    }

    public void setIsTime(String isTime) {
        this.isTime.set(isTime.equals("1"));
    }

    public String getDifficulty() {
        return difficulty.get();
    }

    public void setDifficulty(String difficulty) {
        this.difficulty.set(difficulty);
    }

    public Long getNumberplayer() {
        if(this.numberplayer.get()!=null & !this.numberplayer.get().isBlank()){
            return Long.valueOf(numberplayer.get());
        }
        return null;
    }

    public void setNumberplayer(Long numberplayer) {
       this.numberplayer.set(numberplayer.toString());
    }

    public String getIsDuel() {
        return isDuel.get()?"1":"0";
    }

    public void setIsDuel(String isDuel) {
        this.isDuel.set(isDuel.equals("1"));
    }

    public Long getTurn() {
        if(this.turn.get()!=null & !this.turn.get().isBlank()){
            return Long.valueOf(turn.get());
        }
        return null;
    }

    public void setTurn(Long turn) {
       this.turn.set(turn.toString());
    }

    public Long getCounterround() {
        if(this.counterround.get()!=null & !this.counterround.get().isBlank()){
            return Long.valueOf(counterround.get());
        }
        return null;
    }

    public void setCounterround(Long counterround) {
       this.counterround.set(counterround.toString());
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<TrivQuestionsDto> getQuestionsList() {
        return questionsDtoList;
    }

    public void setQuestionsList(List<TrivQuestionsDto> questionsDtoList) {
        this.questionsDtoList = questionsDtoList;
    }

//    public List<TrivPlayersCategoriesGameDto> getPlayersCategoriesGameList() {
//        return playersCategoriesGameDtoList;
//    }
//
//    public void setPlayersCategoriesGameList(List<TrivPlayersCategoriesGameDto> playersCategoriesGameDtoList) {
//        this.playersCategoriesGameDtoList = playersCategoriesGameDtoList;
//    }

    public List<TrivPlayersGameDto> getPlayersGameList() {
        return playersGameDtoList;
    }

    public void setPlayersGameList(List<TrivPlayersGameDto> playersGameDtoList) {
        this.playersGameDtoList = playersGameDtoList;
    }

//    public List<TrivPlayersWildcardGameDto> getPlayersWildcardGameList() {
//        return playersWildcardGameDtoList;
//    }
//
//    public void setPlayersWildcardGameList(List<TrivPlayersWildcardGameDto> playersWildcardGameDtoList) {
//        this.playersWildcardGameDtoList = playersWildcardGameDtoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TrivGameDto)) {
            return false;
        }
        TrivGameDto other = (TrivGameDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivGame[ id=" + id + " ]";
    }
}
