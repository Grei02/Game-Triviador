package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.math.BigInteger;

@Entity
@Table(name = "TRIV_ACHIEVEMENTS", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "Achievements.findAll", query = "SELECT t FROM Achievements t"),
    @NamedQuery(name = "Achievements.findByAchId", query = "SELECT t FROM Achievements t WHERE t.id = :id"),
    @NamedQuery(name = "Achievements.findByAchName", query = "SELECT t FROM Achievements t WHERE t.name = :name"),
    @NamedQuery(name = "Achievements.findByAchType", query = "SELECT t FROM Achievements t WHERE t.type = :type"),
    @NamedQuery(name = "Achievements.findByAchAmount", query = "SELECT t FROM Achievements t WHERE t.amount = :amount"),
    @NamedQuery(name = "Achievements.findByAchDescription", query = "SELECT t FROM Achievements t WHERE t.description = :description"),
    @NamedQuery(name = "Achievements.findByAchVersion", query = "SELECT t FROM Achievements t WHERE t.version = :version")*/})
public class Achievements implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_ACHIEVEMENTS_ACH_ID_ACHIEVEMENTS", sequenceName = "tri.TRIV_ACHIEVEMENTS_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_ACHIEVEMENTS_ACH_ID_ACHIEVEMENTS")
    @Basic(optional = false)
    @Column(name = "ACH_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACH_NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "ACH_TYPE")
    private String type;
    @Column(name = "ACH_DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ACH_AMOUNT")
    private Long amount;
    @Version
    @Column(name = "ACH_VERSION")
    private Long version;
    @Column(name = "ACH_NAMEIMAGE")
    private String nameImage;
    @ManyToMany(mappedBy = "achievementsList", fetch = FetchType.LAZY)
    private List<Players> playersList;

    public Achievements() {
    }

    public Achievements(Long id) {
        this.id = id;
    }

    public Achievements(TrivAchievementsDto achievementsDto) {
        this.id = achievementsDto.getId();
        update(achievementsDto);
    }

    public void update(TrivAchievementsDto achievementsDto) {
        this.name = achievementsDto.getName();
        this.type = achievementsDto.getType();
        this.description = achievementsDto.getDescription();
        this.nameImage = achievementsDto.getNameImage();
        this.amount = achievementsDto.getAmount();
        this.version = achievementsDto.getVersion();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
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
        if (!(object instanceof Achievements)) {
            return false;
        }
        Achievements other = (Achievements) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivAchievements[ id=" + id + " ]";
    }
}
