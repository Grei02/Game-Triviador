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
@Table(name = "TRIV_PLAYERS")
@NamedQueries({
    @NamedQuery(name = "TrivPlayers.findAll", query = "SELECT t FROM TrivPlayers t"),
    @NamedQuery(name = "TrivPlayers.findByPlaId", query = "SELECT t FROM TrivPlayers t WHERE t.plaId = :plaId"),
    @NamedQuery(name = "TrivPlayers.findByPlaName", query = "SELECT t FROM TrivPlayers t WHERE t.plaName = :plaName"),
    @NamedQuery(name = "TrivPlayers.findByPlaDescription", query = "SELECT t FROM TrivPlayers t WHERE t.plaDescription = :plaDescription"),
    @NamedQuery(name = "TrivPlayers.findByPlaCountergamewin", query = "SELECT t FROM TrivPlayers t WHERE t.plaCountergamewin = :plaCountergamewin"),
    @NamedQuery(name = "TrivPlayers.findByPlaCountergamelose", query = "SELECT t FROM TrivPlayers t WHERE t.plaCountergamelose = :plaCountergamelose"),
    @NamedQuery(name = "TrivPlayers.findByPlaCounterconsecutivequestion", query = "SELECT t FROM TrivPlayers t WHERE t.plaCounterconsecutivequestion = :plaCounterconsecutivequestion"),
    @NamedQuery(name = "TrivPlayers.findByPlaFavoritecategory", query = "SELECT t FROM TrivPlayers t WHERE t.plaFavoritecategory = :plaFavoritecategory"),
    @NamedQuery(name = "TrivPlayers.findByPlaVersion", query = "SELECT t FROM TrivPlayers t WHERE t.plaVersion = :plaVersion")})
public class TrivPlayers implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PLA_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal plaId;
    @Basic(optional = false)
    @Column(name = "PLA_NAME", nullable = false, length = 20)
    private String plaName;
    @Column(name = "PLA_DESCRIPTION", length = 100)
    private String plaDescription;
    @Column(name = "PLA_COUNTERGAMEWIN")
    private BigInteger plaCountergamewin;
    @Column(name = "PLA_COUNTERGAMELOSE")
    private BigInteger plaCountergamelose;
    @Column(name = "PLA_COUNTERCONSECUTIVEQUESTION")
    private BigInteger plaCounterconsecutivequestion;
    @Column(name = "PLA_FAVORITECATEGORY", length = 20)
    private String plaFavoritecategory;
    @Basic(optional = false)
    @Column(name = "PLA_VERSION", nullable = false)
    private BigInteger plaVersion;
    @JoinTable(name = "TRIV_PLAYERS_ACHIEVEMENTS", joinColumns = {
        @JoinColumn(name = "PXA_PLA_ID", referencedColumnName = "PLA_ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "PXA_ACH_ID", referencedColumnName = "ACH_ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<TrivAchievements> trivAchievementsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgPlaId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersCategoriesGame> trivPlayersCategoriesGameCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxgPlaId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersGame> trivPlayersGameCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgPlaId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersWildcardGame> trivPlayersWildcardGameCollection;
    @OneToMany(mappedBy = "plaId", fetch = FetchType.LAZY)
    private Collection<TrivQuestionsCategories> trivQuestionsCategoriesCollection;

    public TrivPlayers() {
    }

    public TrivPlayers(BigDecimal plaId) {
        this.plaId = plaId;
    }

    public TrivPlayers(BigDecimal plaId, String plaName, BigInteger plaVersion) {
        this.plaId = plaId;
        this.plaName = plaName;
        this.plaVersion = plaVersion;
    }

    public BigDecimal getPlaId() {
        return plaId;
    }

    public void setPlaId(BigDecimal plaId) {
        this.plaId = plaId;
    }

    public String getPlaName() {
        return plaName;
    }

    public void setPlaName(String plaName) {
        this.plaName = plaName;
    }

    public String getPlaDescription() {
        return plaDescription;
    }

    public void setPlaDescription(String plaDescription) {
        this.plaDescription = plaDescription;
    }

    public BigInteger getPlaCountergamewin() {
        return plaCountergamewin;
    }

    public void setPlaCountergamewin(BigInteger plaCountergamewin) {
        this.plaCountergamewin = plaCountergamewin;
    }

    public BigInteger getPlaCountergamelose() {
        return plaCountergamelose;
    }

    public void setPlaCountergamelose(BigInteger plaCountergamelose) {
        this.plaCountergamelose = plaCountergamelose;
    }

    public BigInteger getPlaCounterconsecutivequestion() {
        return plaCounterconsecutivequestion;
    }

    public void setPlaCounterconsecutivequestion(BigInteger plaCounterconsecutivequestion) {
        this.plaCounterconsecutivequestion = plaCounterconsecutivequestion;
    }

    public String getPlaFavoritecategory() {
        return plaFavoritecategory;
    }

    public void setPlaFavoritecategory(String plaFavoritecategory) {
        this.plaFavoritecategory = plaFavoritecategory;
    }

    public BigInteger getPlaVersion() {
        return plaVersion;
    }

    public void setPlaVersion(BigInteger plaVersion) {
        this.plaVersion = plaVersion;
    }

    public Collection<TrivAchievements> getTrivAchievementsCollection() {
        return trivAchievementsCollection;
    }

    public void setTrivAchievementsCollection(Collection<TrivAchievements> trivAchievementsCollection) {
        this.trivAchievementsCollection = trivAchievementsCollection;
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

    public Collection<TrivQuestionsCategories> getTrivQuestionsCategoriesCollection() {
        return trivQuestionsCategoriesCollection;
    }

    public void setTrivQuestionsCategoriesCollection(Collection<TrivQuestionsCategories> trivQuestionsCategoriesCollection) {
        this.trivQuestionsCategoriesCollection = trivQuestionsCategoriesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plaId != null ? plaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayers)) {
            return false;
        }
        TrivPlayers other = (TrivPlayers) object;
        if ((this.plaId == null && other.plaId != null) || (this.plaId != null && !this.plaId.equals(other.plaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayers[ plaId=" + plaId + " ]";
    }
    
}
