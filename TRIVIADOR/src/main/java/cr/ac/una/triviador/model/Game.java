package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.math.BigInteger;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_GAME", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "Game.findAll", query = "SELECT t FROM Game t"),
    @NamedQuery(name = "Game.findByGamId", query = "SELECT t FROM Game t WHERE t.id = :id"),
    @NamedQuery(name = "Game.findByGamName", query = "SELECT t FROM Game t WHERE t.name = :name"),
    @NamedQuery(name = "Game.findByGamTime", query = "SELECT t FROM Game t WHERE t.time = :time"),
    @NamedQuery(name = "Game.findByGamIsTime", query = "SELECT t FROM Game t WHERE t.isTime = :isTime"),
    @NamedQuery(name = "Game.findByGamDifficulty", query = "SELECT t FROM Game t WHERE t.difficulty = :difficulty"),
    @NamedQuery(name = "Game.findByGamNumberplayer", query = "SELECT t FROM Game t WHERE t.numberplayer = :numberplayer"),
    @NamedQuery(name = "Game.findByGamIsDuel", query = "SELECT t FROM Game t WHERE t.isDuel = :isDuel"),
    @NamedQuery(name = "Game.findByGamTurn", query = "SELECT t FROM Game t WHERE t.turn = :turn"),
    @NamedQuery(name = "Game.findByGamCounterround", query = "SELECT t FROM Game t WHERE t.counterround = :counterround"),
    @NamedQuery(name = "Game.findByGamVersion", query = "SELECT t FROM Game t WHERE t.version = :version")*/})
public class Game implements Serializable {



    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_GAME_GAM_ID_GAME", sequenceName = "tri.TRIV_GAME_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_GAME_GAM_ID_GAME")
    @Basic(optional = false)
    @Column(name = "GAM_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "GAM_NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "GAM_IS_TIME")
    private String isTime;
    @Basic(optional = false)
    @Column(name = "GAM_DIFFICULTY")
    private String difficulty;
    @Basic(optional = false)
    @Column(name = "GAM_IS_DUEL")
    private String isDuel;
     @Column(name = "GAM_TIME")
    private Long time;
    @Basic(optional = false)
    @Column(name = "GAM_NUMBERPLAYER")
    private Long numberplayer;
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
    private List<Questions> questionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game", fetch = FetchType.LAZY)
    private List<PlayersCategoriesGame> playersCategoriesGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game", fetch = FetchType.LAZY)
    private List<PlayersGame> playersGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game", fetch = FetchType.LAZY)
    private List<PlayersWildcardGame> playersWildcardGameList;

    public Game() {
    }

    public Game(Long id) {
        this.id = id;
    }

    public Game(TrivGameDto gameDto) {
        this.id = gameDto.getId();
        update(gameDto);
    }

    public void update(TrivGameDto gameDto) {
        this.id = gameDto.getId();
        this.name = gameDto.getName();
        this.time = gameDto.getTime();
        this.isTime = gameDto.getIsTime();
        this.difficulty = gameDto.getDifficulty();
        this.numberplayer = gameDto.getNumberplayer();
        this.isDuel = gameDto.getIsDuel();
        this.turn = gameDto.getTurn();
        this.counterround = gameDto.getCounterround();
        this.version = gameDto.getVersion();
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

    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    public List<PlayersCategoriesGame> getPlayersCategoriesGameList() {
        return playersCategoriesGameList;
    }

    public void setPlayersCategoriesGameList(List<PlayersCategoriesGame> playersCategoriesGameList) {
        this.playersCategoriesGameList = playersCategoriesGameList;
    }

    public List<PlayersGame> getPlayersGameList() {
        return playersGameList;
    }

    public void setPlayersGameList(List<PlayersGame> playersGameList) {
        this.playersGameList = playersGameList;
    }

    public List<PlayersWildcardGame> getPlayersWildcardGameList() {
        return playersWildcardGameList;
    }

    public void setPlayersWildcardGameList(List<PlayersWildcardGame> playersWildcardGameList) {
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
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
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