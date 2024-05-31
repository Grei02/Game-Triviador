package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_PLAYERS_CATEGORIES_GAME", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "TrivPlayersCategoriesGame.findAll", query = "SELECT t FROM TrivPlayersCategoriesGame t"),
    @NamedQuery(name = "TrivPlayersCategoriesGame.findByPxcxgId", query = "SELECT t FROM TrivPlayersCategoriesGame t WHERE t.pxcxgId = :pxcxgId"),
    @NamedQuery(name = "TrivPlayersCategoriesGame.findByPxcxgVersion", query = "SELECT t FROM TrivPlayersCategoriesGame t WHERE t.pxcxgVersion = :pxcxgVersion")*/})
public class TrivPlayersCategoriesGame implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TRI_PLAYERS_CATEGORIES_GAME_PXCXG_ID_PLAYERS_CATEGORIES_GAME", sequenceName = "tri.TRIV_PLAYERS_CATEGORIES_GAME_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_PLAYERS_CATEGORIES_GAME_PXCXG_ID_PLAYERS_CATEGORIES_GAME")
    @Basic(optional = false)
    @Column(name = "PXCXG_ID")
    private Long id;
    @Version
    @Column(name=  "PXCXG_VERSION")
    private Long version;
    @JoinColumn(name = "PXCXG_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivCategories categories;
    @JoinColumn(name = "PXCXG_GAM_ID", referencedColumnName = "GAM_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivGame game;
    @JoinColumn(name = "PXCXG_PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TrivPlayers player;

    public TrivPlayersCategoriesGame() {
    }

    public TrivPlayersCategoriesGame(TrivPlayersCategoriesGameDto playersCategoriesGameDto) {
        this.id = playersCategoriesGameDto.getId();
        update(playersCategoriesGameDto);
    }

    public void update(TrivPlayersCategoriesGameDto playersCategoriesGameDto) {
        this.version = playersCategoriesGameDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivCategories getCategories() {
        return categories;
    }

    public void setCategories(TrivCategories categories) {
        this.categories = categories;
    }

    public TrivGame getGame() {
        return game;
    }

    public void setGame(TrivGame game) {
        this.game = game;
    }

    public TrivPlayers getPlayer() {
        return player;
    }

    public void setPlayer(TrivPlayers player) {
        this.player = player;
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
        if (!(object instanceof TrivPlayersCategoriesGame)) {
            return false;
        }
        TrivPlayersCategoriesGame other = (TrivPlayersCategoriesGame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivPlayersCategoriesGame[ id=" + id + " ]";
    }
    
}