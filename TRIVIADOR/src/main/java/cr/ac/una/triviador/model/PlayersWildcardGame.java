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
import java.math.BigInteger;

@Entity
@Table(name = "TRIV_PLAYERS_WILDCARD_GAME", catalog = "", schema = "TRI")
@NamedQueries({ /*@NamedQuery(name = "PlayersWildcardGame.findAll", query = "SELECT t FROM PlayersWildcardGame t"),
    @NamedQuery(name = "PlayersWildcardGame.findByPxwxgId", query = "SELECT t FROM PlayersWildcardGame t WHERE t.id = :id"),
    @NamedQuery(name = "PlayersWildcardGame.findByPxwxgIsUsed", query = "SELECT t FROM PlayersWildcardGame t WHERE t.isUsed = :isUsed"),
    @NamedQuery(name = "PlayersWildcardGame.findByPxwxgVersion", query = "SELECT t FROM PlayersWildcardGame t WHERE t.version = :version")*/})
public class PlayersWildcardGame implements Serializable {

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
    @JoinColumn(name = "PXWXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Game game;
    @JoinColumn(name = "PXWXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Players player;
    @JoinColumn(name = "PXWXG_WILD_ID", referencedColumnName = "WILD_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Wildcard wildcard;
    @Version
    @Column(name = "PXWXG_VERSION")
    private Long version;

    public PlayersWildcardGame() {
    }

    public PlayersWildcardGame(Long id) {
        this.id = id;
    }

    public PlayersWildcardGame(TrivPlayersWildcardGameDto playersWildcardGameDto) {
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

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    public Wildcard getWildcard() {
        return wildcard;
    }

    public void setWildcard(Wildcard wildcard) {
        this.wildcard = wildcard;
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
        if (!(object instanceof PlayersWildcardGame)) {
            return false;
        }
        PlayersWildcardGame other = (PlayersWildcardGame) object;
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
