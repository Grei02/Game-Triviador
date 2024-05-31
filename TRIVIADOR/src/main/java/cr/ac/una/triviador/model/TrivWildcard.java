
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
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;


@Entity
@Table(name = "TRIV_WILDCARD", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "TrivWildcard.findAll", query = "SELECT t FROM TrivWildcard t"),
    @NamedQuery(name = "TrivWildcard.findByWildId", query = "SELECT t FROM TrivWildcard t WHERE t.wildId = :wildId"),
    @NamedQuery(name = "TrivWildcard.findByWildName", query = "SELECT t FROM TrivWildcard t WHERE t.wildName = :wildName"),
    @NamedQuery(name = "TrivWildcard.findByWildVersion", query = "SELECT t FROM TrivWildcard t WHERE t.wildVersion = :wildVersion")*/})
public class TrivWildcard implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TRI_WILDCARD_WIL_ID_WILDCARD", sequenceName = "tri.TRIV_WILDCARD_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_WILDCARD_WIL_ID_WILDCARD")
    @Basic(optional = false)
    @Column(name = "WILD_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "WILD_NAME")
    private String name;
    @Version
    @Column(name = "WILD_VERSION")
    private Long version;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgWildId", fetch = FetchType.LAZY)
    private List<TrivPlayersWildcardGame> playersWildcardGameList;

    public TrivWildcard() {
    }

    public TrivWildcard(Long id) {
        this.id = id;
    }

    public TrivWildcard(TrivWildcardDto wildcardDto) {
        this.id = wildcardDto.getId();
        update(wildcardDto);
    }

    public void update(TrivWildcardDto wildcardDto) {
        this.name = wildcardDto.getName();
        this.version = wildcardDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<TrivPlayersWildcardGame> getPlayersWildcardGameList() {
        return playersWildcardGameList;
    }

    public void setPlayersWildcardGameList(List<TrivPlayersWildcardGame> playersWildcardGameList) {
        this.playersWildcardGameList = playersWildcardGameList;
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
        if (!(object instanceof TrivWildcard)) {
            return false;
        }
        TrivWildcard other = (TrivWildcard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivWildcard[ id=" + id + " ]";
    }

}
