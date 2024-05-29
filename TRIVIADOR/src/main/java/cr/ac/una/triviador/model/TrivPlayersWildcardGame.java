/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "TRIV_PLAYERS_WILDCARD_GAME", catalog = "", schema = "TRI")
@NamedQueries({ /*@NamedQuery(name = "TrivPlayersWildcardGame.findAll", query = "SELECT t FROM TrivPlayersWildcardGame t"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgId", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.id = :id"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgIsUsed", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.isUsed = :isUsed"),
    @NamedQuery(name = "TrivPlayersWildcardGame.findByPxwxgVersion", query = "SELECT t FROM TrivPlayersWildcardGame t WHERE t.version = :version")*/})
public class TrivPlayersWildcardGame implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_PLAYERS_WILDCARD_GAME_PXWXG_ID_PLAYERS_WILDCARD_GAME", sequenceName = "tri.TRIV_PLAYERS_WILDCARD_GAME_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_PLAYERS_WILDCARD_GAME_PXWXG_ID_PLAYERS_WILDCARD_GAME")
    @Basic(optional = false)
    @Column(name = "PXWXG_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "PXWXG_IS_USED")
    private String isUsed;
    @Version
    @Column(name = "PXWXG_VERSION")
    private Long version;
    @JoinColumn(name = "PXWXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame gamId;
    @JoinColumn(name = "PXWXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers plaId;
    @JoinColumn(name = "PXWXG_WILD_ID", referencedColumnName = "WILD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivWildcard wildId;

    public TrivPlayersWildcardGame() {
    }

    public TrivPlayersWildcardGame(Long id) {
        this.id = id;
    }

    public TrivPlayersWildcardGame(TrivPlayersWildcardGameDto playersWildcardGameDto) {
        this.id = playersWildcardGameDto.getId();
        update(playersWildcardGameDto);
    }

    public void update(TrivPlayersWildcardGameDto playersWildcardGameDto) {
        this.isUsed = playersWildcardGameDto.getIsUsed();
        this.version = playersWildcardGameDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
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

    public TrivWildcard getWildId() {
        return wildId;
    }

    public void setWildId(TrivWildcard wildId) {
        this.wildId = wildId;
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
        if (!(object instanceof TrivPlayersWildcardGame)) {
            return false;
        }
        TrivPlayersWildcardGame other = (TrivPlayersWildcardGame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersWildcardGame[ id=" + id + " ]";
    }

}
