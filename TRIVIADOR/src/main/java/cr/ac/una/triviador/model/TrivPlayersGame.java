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
@Table(name = "TRIV_PLAYERS_GAME", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "TrivPlayersGame.findAll", query = "SELECT t FROM TrivPlayersGame t"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgId", query = "SELECT t FROM TrivPlayersGame t WHERE t.id = :id"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgNameworker", query = "SELECT t FROM TrivPlayersGame t WHERE t.nameworker = :nameworker"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgPosboard", query = "SELECT t FROM TrivPlayersGame t WHERE t.posboard = :posboard"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgCounterconsecutivequestion", query = "SELECT t FROM TrivPlayersGame t WHERE t.counterconsecutivequestion = :counterconsecutivequestion"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgNumberturn", query = "SELECT t FROM TrivPlayersGame t WHERE t.numberturn = :numberturn"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgIsCurrent", query = "SELECT t FROM TrivPlayersGame t WHERE t.isCurrent = :isCurrent"),
    @NamedQuery(name = "TrivPlayersGame.findByPxgVersion", query = "SELECT t FROM TrivPlayersGame t WHERE t.version = :version")*/})
public class TrivPlayersGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PXG_ID")
    private Long id;
    @Column(name = "PXG_NAMEWORKER")
    private String nameworker;
    @Basic(optional = false)
    @Column(name = "PXG_POSBOARD")
    private Long posboard;
    @Column(name = "PXG_COUNTERCONSECUTIVEQUESTION")
    private Long counterconsecutivequestion;
    @Column(name = "PXG_NUMBERTURN")
    private Long numberturn;
    @Basic(optional = false)
    @Column(name = "PXG_IS_CURRENT")
    private String isCurrent;
    @Basic(optional = false)
    @Column(name = "PXG_VERSION")
    private Long version;
    @JoinColumn(name = "PXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame gamId;
    @JoinColumn(name = "PXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers plaId;

    public TrivPlayersGame() {
    }

    public TrivPlayersGame(Long id) {
        this.id = id;
    }
    
    public TrivPlayersGame(TrivPlayersGameDto playersGameDto) {
        this.id = playersGameDto.getId();
        update(playersGameDto);
    }

    public void update (TrivPlayersGameDto playersGameDto) {
        this.posboard = playersGameDto.getPosboard();
        this.isCurrent = playersGameDto.getIsCurrent();
        this.version = playersGameDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameworker() {
        return nameworker;
    }

    public void setNameworker(String nameworker) {
        this.nameworker = nameworker;
    }

    public Long getPosboard() {
        return posboard;
    }

    public void setPosboard(Long posboard) {
        this.posboard = posboard;
    }

    public Long getCounterconsecutivequestion() {
        return counterconsecutivequestion;
    }

    public void setCounterconsecutivequestion(Long counterconsecutivequestion) {
        this.counterconsecutivequestion = counterconsecutivequestion;
    }

    public Long getNumberturn() {
        return numberturn;
    }

    public void setNumberturn(Long numberturn) {
        this.numberturn = numberturn;
    }

    public String getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(String isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivGame getGamId() {
        return gamId;
    }

    public void setGamId(TrivGame gamId) {
        this.gamId = gamId;
    }

    public TrivPlayers getPlaId() {
        return plaId;
    }

    public void setPlaId(TrivPlayers plaId) {
        this.plaId = plaId;
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
        if (!(object instanceof TrivPlayersGame)) {
            return false;
        }
        TrivPlayersGame other = (TrivPlayersGame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersGame[ id=" + id + " ]";
    }
    
}
