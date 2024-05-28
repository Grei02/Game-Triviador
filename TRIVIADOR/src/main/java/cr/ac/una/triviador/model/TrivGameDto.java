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
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Sofia Bejarano Mora
 */
public class TrivGameDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty time;
    private SimpleBooleanProperty isTime;
    private SimpleStringProperty difficulty;
    private SimpleStringProperty numberplayer;
    private SimpleBooleanProperty isDuel;
    private SimpleStringProperty turn;
    private SimpleStringProperty counterround;
    private Long version;
    private List<TrivQuestions> questionsList;
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    private List<TrivPlayersGame> playersGameList;
    private List<TrivPlayersWildcardGame> playersWildcardGameList;

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

    public TrivGameDto(TrivGame game) {
        this();
        this.id.set(game.getId().toString());
        this.name.set(game.getName());
        this.time.set(game.getTime().toString());
        this.isTime.set(game.getIsTime().equals("0"));
        this.difficulty.set(game.getDifficulty());
        this.numberplayer.set(game.getNumberplayer().toString());
        this.isDuel.set(game.getIsDuel().equals("0"));
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
        return isTime.get()?"0":"1";
    }

    public void setIsTime(String isTime) {
        this.isTime.set(isTime.equalsIgnoreCase("0"));
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
        return isDuel.get()?"0":"1";
    }

    public void setIsDuel(String isDuel) {
        this.isDuel.set(isDuel.equalsIgnoreCase("0"));
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

    public List<TrivQuestions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<TrivQuestions> questionsList) {
        this.questionsList = questionsList;
    }

    public List<TrivPlayersCategoriesGame> getPlayersCategoriesGameList() {
        return playersCategoriesGameList;
    }

    public void setPlayersCategoriesGameList(List<TrivPlayersCategoriesGame> playersCategoriesGameList) {
        this.playersCategoriesGameList = playersCategoriesGameList;
    }

    public List<TrivPlayersGame> getPlayersGameList() {
        return playersGameList;
    }

    public void setPlayersGameList(List<TrivPlayersGame> playersGameList) {
        this.playersGameList = playersGameList;
    }

    public List<TrivPlayersWildcardGame> getPlayersWildcardGameList() {
        return playersWildcardGameList;
    }

    public void setPlayersWildcardGameList(List<TrivPlayersWildcardGame> playersWildcardGameList) {
        this.playersWildcardGameList = playersWildcardGameList;
    }

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
