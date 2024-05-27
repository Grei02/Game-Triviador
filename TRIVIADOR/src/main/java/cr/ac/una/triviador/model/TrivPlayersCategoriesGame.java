/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_PLAYERS_CATEGORIES_GAME", catalog = "", schema = "TRI")
@NamedQueries({
    @NamedQuery(name = "TrivPlayersCategoriesGame.findAll", query = "SELECT t FROM TrivPlayersCategoriesGame t"),
    @NamedQuery(name = "TrivPlayersCategoriesGame.findByPxcxgId", query = "SELECT t FROM TrivPlayersCategoriesGame t WHERE t.pxcxgId = :pxcxgId"),
    @NamedQuery(name = "TrivPlayersCategoriesGame.findByPxcxgVersion", query = "SELECT t FROM TrivPlayersCategoriesGame t WHERE t.pxcxgVersion = :pxcxgVersion")})
public class TrivPlayersCategoriesGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PXCXG_ID")
    private BigDecimal pxcxgId;
    @Basic(optional = false)
    @Column(name = "PXCXG_VERSION")
    private BigInteger pxcxgVersion;
    @JoinColumn(name = "PXCXG_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivCategories pxcxgCatId;
    @JoinColumn(name = "PXCXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame pxcxgGamId;
    @JoinColumn(name = "PXCXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers pxcxgPlaId;

    public TrivPlayersCategoriesGame() {
    }

    public TrivPlayersCategoriesGame(BigDecimal pxcxgId) {
        this.pxcxgId = pxcxgId;
    }

    public TrivPlayersCategoriesGame(BigDecimal pxcxgId, BigInteger pxcxgVersion) {
        this.pxcxgId = pxcxgId;
        this.pxcxgVersion = pxcxgVersion;
    }

    public BigDecimal getPxcxgId() {
        return pxcxgId;
    }

    public void setPxcxgId(BigDecimal pxcxgId) {
        this.pxcxgId = pxcxgId;
    }

    public BigInteger getPxcxgVersion() {
        return pxcxgVersion;
    }

    public void setPxcxgVersion(BigInteger pxcxgVersion) {
        this.pxcxgVersion = pxcxgVersion;
    }

    public TrivCategories getPxcxgCatId() {
        return pxcxgCatId;
    }

    public void setPxcxgCatId(TrivCategories pxcxgCatId) {
        this.pxcxgCatId = pxcxgCatId;
    }

    public TrivGame getPxcxgGamId() {
        return pxcxgGamId;
    }

    public void setPxcxgGamId(TrivGame pxcxgGamId) {
        this.pxcxgGamId = pxcxgGamId;
    }

    public TrivPlayers getPxcxgPlaId() {
        return pxcxgPlaId;
    }

    public void setPxcxgPlaId(TrivPlayers pxcxgPlaId) {
        this.pxcxgPlaId = pxcxgPlaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pxcxgId != null ? pxcxgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayersCategoriesGame)) {
            return false;
        }
        TrivPlayersCategoriesGame other = (TrivPlayersCategoriesGame) object;
        if ((this.pxcxgId == null && other.pxcxgId != null) || (this.pxcxgId != null && !this.pxcxgId.equals(other.pxcxgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersCategoriesGame[ pxcxgId=" + pxcxgId + " ]";
    }
    
}
