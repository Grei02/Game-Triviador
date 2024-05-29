/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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


@Entity
@Table(name = "TRIV_ACHIEVEMENTS", catalog = "", schema = "TRI")
@NamedQueries({
   /* @NamedQuery(name = "TrivAchievements.findAll", query = "SELECT t FROM TrivAchievements t"),
    @NamedQuery(name = "TrivAchievements.findByAchId", query = "SELECT t FROM TrivAchievements t WHERE t.id = :id"),
    @NamedQuery(name = "TrivAchievements.findByAchName", query = "SELECT t FROM TrivAchievements t WHERE t.name = :name"),
    @NamedQuery(name = "TrivAchievements.findByAchType", query = "SELECT t FROM TrivAchievements t WHERE t.type = :type"),
    @NamedQuery(name = "TrivAchievements.findByAchAmount", query = "SELECT t FROM TrivAchievements t WHERE t.amount = :amount"),
    @NamedQuery(name = "TrivAchievements.findByAchDescription", query = "SELECT t FROM TrivAchievements t WHERE t.description = :description"),
    @NamedQuery(name = "TrivAchievements.findByAchVersion", query = "SELECT t FROM TrivAchievements t WHERE t.version = :version")*/})
public class TrivAchievements implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "ACH_AMOUNT")
    private Long amount;
    @Column(name = "ACH_DESCRIPTION")
    private String description;
    @Version
    @Column(name = "ACH_VERSION")
    private Long version;
    @ManyToMany(mappedBy = "trivAchievementsList", fetch = FetchType.LAZY)
    private List<TrivPlayers> playersList;

    public TrivAchievements() {
    }

    public TrivAchievements(Long id) {
        this.id = id;
    }
    
    public TrivAchievements(TrivAchievementsDto achievementsDto) {
        this.id = achievementsDto.getId();
        update(achievementsDto);
    }

    public void update(TrivAchievementsDto achievementsDto) {
        this.name = achievementsDto.getName();
        this.type = achievementsDto.getType();
        this.description=achievementsDto.getDescription();
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<TrivPlayers> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<TrivPlayers> playersList) {
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
        if (!(object instanceof TrivAchievements)) {
            return false;
        }
        TrivAchievements other = (TrivAchievements) object;
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
