/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_GAME")
@NamedQueries({
    @NamedQuery(name = "TrivGame.findAll", query = "SELECT t FROM TrivGame t"),
    @NamedQuery(name = "TrivGame.findByGamId", query = "SELECT t FROM TrivGame t WHERE t.gamId = :gamId"),
    @NamedQuery(name = "TrivGame.findByGamName", query = "SELECT t FROM TrivGame t WHERE t.gamName = :gamName"),
    @NamedQuery(name = "TrivGame.findByGamTime", query = "SELECT t FROM TrivGame t WHERE t.gamTime = :gamTime"),
    @NamedQuery(name = "TrivGame.findByGamIsTime", query = "SELECT t FROM TrivGame t WHERE t.gamIsTime = :gamIsTime"),
    @NamedQuery(name = "TrivGame.findByGamDifficulty", query = "SELECT t FROM TrivGame t WHERE t.gamDifficulty = :gamDifficulty"),
    @NamedQuery(name = "TrivGame.findByGamNumberplayer", query = "SELECT t FROM TrivGame t WHERE t.gamNumberplayer = :gamNumberplayer"),
    @NamedQuery(name = "TrivGame.findByGamIsDuel", query = "SELECT t FROM TrivGame t WHERE t.gamIsDuel = :gamIsDuel"),
    @NamedQuery(name = "TrivGame.findByGamTurn", query = "SELECT t FROM TrivGame t WHERE t.gamTurn = :gamTurn"),
    @NamedQuery(name = "TrivGame.findByGamCounterround", query = "SELECT t FROM TrivGame t WHERE t.gamCounterround = :gamCounterround"),
    @NamedQuery(name = "TrivGame.findByGamVersion", query = "SELECT t FROM TrivGame t WHERE t.gamVersion = :gamVersion")})
public class TrivGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GAM_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal gamId;
    @Basic(optional = false)
    @Column(name = "GAM_NAME", nullable = false, length = 30)
    private String gamName;
    @Column(name = "GAM_TIME")
    private BigInteger gamTime;
    @Basic(optional = false)
    @Column(name = "GAM_IS_TIME", nullable = false, length = 1)
    private String gamIsTime;
    @Basic(optional = false)
    @Column(name = "GAM_DIFFICULTY", nullable = false, length = 20)
    private String gamDifficulty;
    @Basic(optional = false)
    @Column(name = "GAM_NUMBERPLAYER", nullable = false)
    private BigInteger gamNumberplayer;
    @Basic(optional = false)
    @Column(name = "GAM_IS_DUEL", nullable = false, length = 1)
    private String gamIsDuel;
    @Basic(optional = false)
    @Column(name = "GAM_TURN", nullable = false)
    private BigInteger gamTurn;
    @Column(name = "GAM_COUNTERROUND")
    private BigInteger gamCounterround;
    @Basic(optional = false)
    @Column(name = "GAM_VERSION", nullable = false)
    private BigInteger gamVersion;
    @JoinTable(name = "TRIV_GAME_QUESTIONS", joinColumns = {
        @JoinColumn(name = "GXQ_GAM_ID", referencedColumnName = "GAM_ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "GXQ_QUE_ID", referencedColumnName = "QUE_ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<TrivQuestions> trivQuestionsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgGamId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersCategoriesGame> trivPlayersCategoriesGameCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxgGamId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersGame> trivPlayersGameCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgGamId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersWildcardGame> trivPlayersWildcardGameCollection;

    public TrivGame() {
    }

    public TrivGame(BigDecimal gamId) {
        this.gamId = gamId;
    }

    public TrivGame(BigDecimal gamId, String gamName, String gamIsTime, String gamDifficulty, BigInteger gamNumberplayer, String gamIsDuel, BigInteger gamTurn, BigInteger gamVersion) {
        this.gamId = gamId;
        this.gamName = gamName;
        this.gamIsTime = gamIsTime;
        this.gamDifficulty = gamDifficulty;
        this.gamNumberplayer = gamNumberplayer;
        this.gamIsDuel = gamIsDuel;
        this.gamTurn = gamTurn;
        this.gamVersion = gamVersion;
    }

    public BigDecimal getGamId() {
        return gamId;
    }

    public void setGamId(BigDecimal gamId) {
        this.gamId = gamId;
    }

    public String getGamName() {
        return gamName;
    }

    public void setGamName(String gamName) {
        this.gamName = gamName;
    }

    public BigInteger getGamTime() {
        return gamTime;
    }

    public void setGamTime(BigInteger gamTime) {
        this.gamTime = gamTime;
    }

    public String getGamIsTime() {
        return gamIsTime;
    }

    public void setGamIsTime(String gamIsTime) {
        this.gamIsTime = gamIsTime;
    }

    public String getGamDifficulty() {
        return gamDifficulty;
    }

    public void setGamDifficulty(String gamDifficulty) {
        this.gamDifficulty = gamDifficulty;
    }

    public BigInteger getGamNumberplayer() {
        return gamNumberplayer;
    }

    public void setGamNumberplayer(BigInteger gamNumberplayer) {
        this.gamNumberplayer = gamNumberplayer;
    }

    public String getGamIsDuel() {
        return gamIsDuel;
    }

    public void setGamIsDuel(String gamIsDuel) {
        this.gamIsDuel = gamIsDuel;
    }

    public BigInteger getGamTurn() {
        return gamTurn;
    }

    public void setGamTurn(BigInteger gamTurn) {
        this.gamTurn = gamTurn;
    }

    public BigInteger getGamCounterround() {
        return gamCounterround;
    }

    public void setGamCounterround(BigInteger gamCounterround) {
        this.gamCounterround = gamCounterround;
    }

    public BigInteger getGamVersion() {
        return gamVersion;
    }

    public void setGamVersion(BigInteger gamVersion) {
        this.gamVersion = gamVersion;
    }

    public Collection<TrivQuestions> getTrivQuestionsCollection() {
        return trivQuestionsCollection;
    }

    public void setTrivQuestionsCollection(Collection<TrivQuestions> trivQuestionsCollection) {
        this.trivQuestionsCollection = trivQuestionsCollection;
    }

    public Collection<TrivPlayersCategoriesGame> getTrivPlayersCategoriesGameCollection() {
        return trivPlayersCategoriesGameCollection;
    }

    public void setTrivPlayersCategoriesGameCollection(Collection<TrivPlayersCategoriesGame> trivPlayersCategoriesGameCollection) {
        this.trivPlayersCategoriesGameCollection = trivPlayersCategoriesGameCollection;
    }

    public Collection<TrivPlayersGame> getTrivPlayersGameCollection() {
        return trivPlayersGameCollection;
    }

    public void setTrivPlayersGameCollection(Collection<TrivPlayersGame> trivPlayersGameCollection) {
        this.trivPlayersGameCollection = trivPlayersGameCollection;
    }

    public Collection<TrivPlayersWildcardGame> getTrivPlayersWildcardGameCollection() {
        return trivPlayersWildcardGameCollection;
    }

    public void setTrivPlayersWildcardGameCollection(Collection<TrivPlayersWildcardGame> trivPlayersWildcardGameCollection) {
        this.trivPlayersWildcardGameCollection = trivPlayersWildcardGameCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gamId != null ? gamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivGame)) {
            return false;
        }
        TrivGame other = (TrivGame) object;
        if ((this.gamId == null && other.gamId != null) || (this.gamId != null && !this.gamId.equals(other.gamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivGame[ gamId=" + gamId + " ]";
    }
    
}
