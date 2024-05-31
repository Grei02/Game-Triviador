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
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_PLAYERS", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "TrivPlayers.findAll", query = "SELECT t FROM TrivPlayers t"),
    @NamedQuery(name = "TrivPlayers.findByPlaId", query = "SELECT t FROM TrivPlayers t WHERE t.plaId = :plaId"),
    @NamedQuery(name = "TrivPlayers.findByPlaName", query = "SELECT t FROM TrivPlayers t WHERE t.name = :name"),
    @NamedQuery(name = "TrivPlayers.findByPlaDescription", query = "SELECT t FROM TrivPlayers t WHERE t.description = :description"),
    @NamedQuery(name = "TrivPlayers.findByPlaCountergamewin", query = "SELECT t FROM TrivPlayers t WHERE t.plaCountergamewin = :plaCountergamewin"),
    @NamedQuery(name = "TrivPlayers.findByPlaCountergamelose", query = "SELECT t FROM TrivPlayers t WHERE t.plaCountergamelose = :plaCountergamelose"),
    @NamedQuery(name = "TrivPlayers.findByPlaCounterconsecutivequestion", query = "SELECT t FROM TrivPlayers t WHERE t.plaCounterconsecutivequestion = :plaCounterconsecutivequestion"),
    @NamedQuery(name = "TrivPlayers.findByPlaFavoritecategory", query = "SELECT t FROM TrivPlayers t WHERE t.favoritecategory = :favoritecategory"),
    @NamedQuery(name = "TrivPlayers.findByPlaVersion", query = "SELECT t FROM TrivPlayers t WHERE t.plaVersion = :plaVersion")*/})
public class TrivPlayers implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_PLAYERS_PLA_ID_PLAYERS", sequenceName = "tri.TRIV_PLAYERS_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_PLAYERS_PLA_ID_PLAYERS")
    @Basic(optional = false)
    @Column(name = "PLA_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "PLA_NAME")
    private String name;
    @Column(name = "PLA_DESCRIPTION")
    private String description;
    @Column(name = "PLA_COUNTERGAMEWIN")
    private Long countergamewin;
    @Column(name = "PLA_COUNTERGAMELOSE")
    private Long countergamelose;
    @Column(name = "PLA_COUNTERCONSECUTIVEQUESTION")
    private Long counterconsecutivequestion;
    @Column(name = "PLA_FAVORITECATEGORY")
    private String favoritecategory;
    @Version
    @Column(name = "PLA_VERSION")
    private Long version;
    @JoinTable(name = "TRIV_PLAYERS_ACHIEVEMENTS", joinColumns = {
        @JoinColumn(name = "PXA_PLA_ID", referencedColumnName = "PLA_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "PXA_ACH_ID", referencedColumnName = "ACH_ID")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<TrivAchievements> achievementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgPlaId", fetch = FetchType.LAZY)
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxgPlaId", fetch = FetchType.LAZY)
    private List<TrivPlayersGame> playersGameList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgPlaId", fetch = FetchType.LAZY)
    private List<TrivPlayersWildcardGame> playersWildcardGameList;
    @OneToMany(mappedBy = "plaId", fetch = FetchType.LAZY)
    private List<TrivQuestionsCategories> questionsCategoriesList;

    public TrivPlayers() {
    }

    public TrivPlayers(TrivPlayersDto playerDto) {
        this.id = playerDto.getId();
        update(playerDto);
    }

    public void update(TrivPlayersDto playerDto) {
        this.id =playerDto.getId();
        this.name = playerDto.getName();
        this.description = playerDto.getDescription();
        this.countergamewin = playerDto.getCountergamewin();
        this.countergamelose = playerDto.getCountergamelose();
        this.counterconsecutivequestion = playerDto.getCounterconsecutivequestion();
        this.favoritecategory = playerDto.getFavoritecategory();
        this.version = playerDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long plaId) {
        this.id = plaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCountergamewin() {
        return countergamewin;
    }

    public void setCountergamewin(Long plaCountergamewin) {
        this.countergamewin = plaCountergamewin;
    }

    public Long getCountergamelose() {
        return countergamelose;
    }

    public void setCountergamelose(Long plaCountergamelose) {
        this.countergamelose = plaCountergamelose;
    }

    public Long getCounterconsecutivequestion() {
        return counterconsecutivequestion;
    }

    public void setCounterconsecutivequestion(Long Counterconsecutivequestion) {
        this.counterconsecutivequestion = Counterconsecutivequestion;
    }

    public String getFavoritecategory() {
        return favoritecategory;
    }

    public void setFavoritecategory(String favoritecategory) {
        this.favoritecategory = favoritecategory;
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
        if (!(object instanceof TrivPlayers)) {
            return false;
        }
        TrivPlayers other = (TrivPlayers) object;
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