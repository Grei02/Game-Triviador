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
@Table(name = "TRIV_PLAYERS_GAME")
@NamedQueries({
    @NamedQuery(name = "TrivPlayersGame.findAll", query = "SELECT t FROM TrivPlayersGame t"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgId", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgId = :pxgId"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgNameworker", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgNameworker = :pxgNameworker"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgPosboard", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgPosboard = :pxgPosboard"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgCounterconsecutivequestion", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgCounterconsecutivequestion = :pxgCounterconsecutivequestion"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgNumberturn", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgNumberturn = :pxgNumberturn"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgIsCurrent", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgIsCurrent = :pxgIsCurrent"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgVersion", query = "SELECT t FROM TrivPlayersGame t WHERE t.pxgVersion = :pxgVersion")})
public class TrivPlayersGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PXG_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal pxgId;
    @Column(name = "PXG_NAMEWORKER", length = 20)
    private String pxgNameworker;
    @Basic(optional = false)
    @Column(name = "PXG_POSBOARD", nullable = false)
    private BigInteger pxgPosboard;
    @Column(name = "PXG_COUNTERCONSECUTIVEQUESTION")
    private BigInteger pxgCounterconsecutivequestion;
    @Column(name = "PXG_NUMBERTURN")
    private BigInteger pxgNumberturn;
    @Basic(optional = false)
    @Column(name = "PXG_IS_CURRENT", nullable = false, length = 1)
    private String pxgIsCurrent;
    @Basic(optional = false)
    @Column(name = "PXG_VERSION", nullable = false)
    private BigInteger pxgVersion;
    @JoinColumn(name = "PXG_GAM_ID", referencedColumnName = "GAM_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame pxgGamId;
    @JoinColumn(name = "PXG_PLA_ID", referencedColumnName = "PLA_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers pxgPlaId;

    public TrivPlayersGame() {
    }

    public TrivPlayersGame(BigDecimal pxgId) {
        this.pxgId = pxgId;
    }

    public TrivPlayersGame(BigDecimal pxgId, BigInteger pxgPosboard, String pxgIsCurrent, BigInteger pxgVersion) {
        this.pxgId = pxgId;
        this.pxgPosboard = pxgPosboard;
        this.pxgIsCurrent = pxgIsCurrent;
        this.pxgVersion = pxgVersion;
    }

    public BigDecimal getPxgId() {
        return pxgId;
    }

    public void setPxgId(BigDecimal pxgId) {
        this.pxgId = pxgId;
    }

    public String getPxgNameworker() {
        return pxgNameworker;
    }

    public void setPxgNameworker(String pxgNameworker) {
        this.pxgNameworker = pxgNameworker;
    }

    public BigInteger getPxgPosboard() {
        return pxgPosboard;
    }

    public void setPxgPosboard(BigInteger pxgPosboard) {
        this.pxgPosboard = pxgPosboard;
    }

    public BigInteger getPxgCounterconsecutivequestion() {
        return pxgCounterconsecutivequestion;
    }

    public void setPxgCounterconsecutivequestion(BigInteger pxgCounterconsecutivequestion) {
        this.pxgCounterconsecutivequestion = pxgCounterconsecutivequestion;
    }

    public BigInteger getPxgNumberturn() {
        return pxgNumberturn;
    }

    public void setPxgNumberturn(BigInteger pxgNumberturn) {
        this.pxgNumberturn = pxgNumberturn;
    }

    public String getPxgIsCurrent() {
        return pxgIsCurrent;
    }

    public void setPxgIsCurrent(String pxgIsCurrent) {
        this.pxgIsCurrent = pxgIsCurrent;
    }

    public BigInteger getPxgVersion() {
        return pxgVersion;
    }

    public void setPxgVersion(BigInteger pxgVersion) {
        this.pxgVersion = pxgVersion;
    }

    public TrivGame getPxgGamId() {
        return pxgGamId;
    }

    public void setPxgGamId(TrivGame pxgGamId) {
        this.pxgGamId = pxgGamId;
    }

    public TrivPlayers getPxgPlaId() {
        return pxgPlaId;
    }

    public void setPxgPlaId(TrivPlayers pxgPlaId) {
        this.pxgPlaId = pxgPlaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pxgId != null ? pxgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivPlayersGame)) {
            return false;
        }
        TrivPlayersGame other = (TrivPlayersGame) object;
        if ((this.pxgId == null && other.pxgId != null) || (this.pxgId != null && !this.pxgId.equals(other.pxgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersGame[ pxgId=" + pxgId + " ]";
    }
    
}
