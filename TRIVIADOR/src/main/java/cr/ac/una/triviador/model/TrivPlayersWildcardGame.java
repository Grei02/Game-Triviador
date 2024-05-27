/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_PLAYERS_WILDCARD_GAME", catalog = "", schema = "TRI")
@NamedQueries({
    @NamedQuery(name = "TrivPlayersWildcardGame.findAll", query = "SELECT t FROM TrivPlayersWildcardGame t"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgId", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.pxwxgId = :pxwxgId"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgIsUsed", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.pxwxgIsUsed = :pxwxgIsUsed"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgVersion", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.pxwxgVersion = :pxwxgVersion")})
public class TrivPlayersWildcardGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PXWXG_ID")
    private BigDecimal pxwxgId;
    @Basic(optional = false)
    @Column(name = "PXWXG_IS_USED")
    private String pxwxgIsUsed;
    @Basic(optional = false)
    @Column(name = "PXWXG_VERSION")
    private BigInteger pxwxgVersion;
    @JoinColumn(name = "PXWXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame pxwxgGamId;
    @JoinColumn(name = "PXWXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers pxwxgPlaId;
    @JoinColumn(name = "PXWXG_WILD_ID", referencedColumnName = "WILD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivWildcard pxwxgWildId;

    public TrivPlayersWildcardGame() {
    }

    public TrivPlayersWildcardGame(BigDecimal pxwxgId) {
        this.pxwxgId = pxwxgId;
    }

    public TrivPlayersWildcardGame(BigDecimal pxwxgId, String pxwxgIsUsed, BigInteger pxwxgVersion) {
        this.pxwxgId = pxwxgId;
        this.pxwxgIsUsed = pxwxgIsUsed;
        this.pxwxgVersion = pxwxgVersion;
    }

    public BigDecimal getPxwxgId() {
        return pxwxgId;
    }

    public void setPxwxgId(BigDecimal pxwxgId) {
        this.pxwxgId = pxwxgId;
    }

    public String getPxwxgIsUsed() {
        return pxwxgIsUsed;
    }

    public void setPxwxgIsUsed(String pxwxgIsUsed) {
        this.pxwxgIsUsed = pxwxgIsUsed;
    }

    public BigInteger getPxwxgVersion() {
        return pxwxgVersion;
    }

    public void setPxwxgVersion(BigInteger pxwxgVersion) {
        this.pxwxgVersion = pxwxgVersion;
    }

    public TrivGame getPxwxgGamId() {
        return pxwxgGamId;
    }

    public void setPxwxgGamId(TrivGame pxwxgGamId) {
        this.pxwxgGamId = pxwxgGamId;
    }

    public TrivPlayers getPxwxgPlaId() {
        return pxwxgPlaId;
    }

    public void setPxwxgPlaId(TrivPlayers pxwxgPlaId) {
        this.pxwxgPlaId = pxwxgPlaId;
    }

    public TrivWildcard getPxwxgWildId() {
        return pxwxgWildId;
    }

    public void setPxwxgWildId(TrivWildcard pxwxgWildId) {
        this.pxwxgWildId = pxwxgWildId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pxwxgId != null ? pxwxgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayersWildcardGame)) {
            return false;
        }
        TrivPlayersWildcardGame other = (TrivPlayersWildcardGame) object;
        if ((this.pxwxgId == null && other.pxwxgId != null) || (this.pxwxgId != null && !this.pxwxgId.equals(other.pxwxgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersWildcardGame[ pxwxgId=" + pxwxgId + " ]";
    }
    
}
