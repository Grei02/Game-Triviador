/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_GAME", catalog = "", schema = "TRI")
@NamedQueries({
   /* @NamedQuery(name = "TrivGame.findAll", query = "SELECT t FROM TrivGame t"),
    @NamedQuery(name = "TrivGame.findByGamId", query = "SELECT t FROM TrivGame t WHERE t.id = :id"),
    @NamedQuery(name = "TrivGame.findByGamName", query = "SELECT t FROM TrivGame t WHERE t.name = :name"),
    @NamedQuery(name = "TrivGame.findByGamTime", query = "SELECT t FROM TrivGame t WHERE t.time = :time"),
    @NamedQuery(name = "TrivGame.findByGamIsTime", query = "SELECT t FROM TrivGame t WHERE t.isTime = :isTime"),
    @NamedQuery(name = "TrivGame.findByGamDifficulty", query = "SELECT t FROM TrivGame t WHERE t.difficulty = :difficulty"),
    @NamedQuery(name = "TrivGame.findByGamNumberplayer", query = "SELECT t FROM TrivGame t WHERE t.numberplayer = :numberplayer"),
    @NamedQuery(name = "TrivGame.findByGamIsDuel", query = "SELECT t FROM TrivGame t WHERE t.isDuel = :isDuel"),
    @NamedQuery(name = "TrivGame.findByGamTurn", query = "SELECT t FROM TrivGame t WHERE t.turn = :turn"),
    @NamedQuery(name = "TrivGame.findByGamCounterround", query = "SELECT t FROM TrivGame t WHERE t.counterround = :counterround"),
    @NamedQuery(name = "TrivGame.findByGamVersion", query = "SELECT t FROM TrivGame t WHERE t.version = :version")*/})
public class TrivGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GAM_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GAM_NAME")
    private String name;
    @Column(name = "GAM_TIME")
    private Long time;
    @Basic(optional = false)
    @Column(name = "GAM_IS_TIME")
    private String isTime;
    @Basic(optional = false)
    @Column(name = "GAM_DIFFICULTY")
    private String difficulty;
    @Basic(optional = false)
    @Column(name = "GAM_NUMBERPLAYER")
    private Long numberplayer;
    @Basic(optional = false)
    @Column(name = "GAM_IS_DUEL")
    private String isDuel;
    @Basic(optional = false)
    @Column(name = "GAM_TURN")
    private Long turn;
    @Column(name = "GAM_COUNTERROUND")
    private Long counterround;
    @Basic(optional = false)
    @Column(name = "GAM_VERSION")
    private Long version;
    @JoinTable(name = "TRIV_GAME_QUESTIONS", joinColumns = {
        @JoinColumn(name = "GXQ_GAM_ID", referencedColumnName = "GAM_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "GXQ_QUE_ID", referencedColumnName = "QUE_ID")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<TrivQuestions> questionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgGamId", fetch = FetchType.LAZY)
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxgGamId", fetch = FetchType.LAZY)
    private List<TrivPlayersGame> playersGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgGamId", fetch = FetchType.LAZY)
    private List<TrivPlayersWildcardGame> playersWildcardGameList;

    public TrivGame() {
    }

    public TrivGame(Long id) {
        this.id = id;
    }

    public TrivGame(Long id, String name, String isTime, String difficulty, Long numberplayer, String isDuel, Long turn, Long version) {
        this.id = id;
        this.name = name;
        this.isTime = isTime;
        this.difficulty = difficulty;
        this.numberplayer = numberplayer;
        this.isDuel = isDuel;
        this.turn = turn;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getIsTime() {
        return isTime;
    }

    public void setIsTime(String isTime) {
        this.isTime = isTime;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Long getNumberplayer() {
        return numberplayer;
    }

    public void setNumberplayer(Long numberplayer) {
        this.numberplayer = numberplayer;
    }

    public String getIsDuel() {
        return isDuel;
    }

    public void setIsDuel(String isDuel) {
        this.isDuel = isDuel;
    }

    public Long getTurn() {
        return turn;
    }

    public void setTurn(Long turn) {
        this.turn = turn;
    }

    public Long getCounterround() {
        return counterround;
    }

    public void setCounterround(Long counterround) {
        this.counterround = counterround;
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
        if (!(object instanceof TrivGame)) {
            return false;
        }
        TrivGame other = (TrivGame) object;
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
