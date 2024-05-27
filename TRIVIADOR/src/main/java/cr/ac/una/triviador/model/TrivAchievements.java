/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_ACHIEVEMENTS")
@NamedQueries({
    @NamedQuery(name = "TrivAchievements.findAll", query = "SELECT t FROM TrivAchievements t"),
    @NamedQuery(name = "TrivAchievements.findByAchId", query = "SELECT t FROM TrivAchievements t WHERE t.achId = :achId"),
    @NamedQuery(name = "TrivAchievements.findByAchName", query = "SELECT t FROM TrivAchievements t WHERE t.achName = :achName"),
    @NamedQuery(name = "TrivAchievements.findByAchType", query = "SELECT t FROM TrivAchievements t WHERE t.achType = :achType"),
    @NamedQuery(name = "TrivAchievements.findByAchAmount", query = "SELECT t FROM TrivAchievements t WHERE t.achAmount = :achAmount"),
    @NamedQuery(name = "TrivAchievements.findByAchDescription", query = "SELECT t FROM TrivAchievements t WHERE t.achDescription = :achDescription"),
    @NamedQuery(name = "TrivAchievements.findByAchVersion", query = "SELECT t FROM TrivAchievements t WHERE t.achVersion = :achVersion")})
public class TrivAchievements implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ACH_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal achId;
    @Basic(optional = false)
    @Column(name = "ACH_NAME", nullable = false, length = 35)
    private String achName;
    @Basic(optional = false)
    @Column(name = "ACH_TYPE", nullable = false, length = 30)
    private String achType;
    @Basic(optional = false)
    @Column(name = "ACH_AMOUNT", nullable = false)
    private BigInteger achAmount;
    @Column(name = "ACH_DESCRIPTION", length = 100)
    private String achDescription;
    @Basic(optional = false)
    @Column(name = "ACH_VERSION", nullable = false)
    private BigInteger achVersion;
    @ManyToMany(mappedBy = "trivAchievementsCollection", fetch = FetchType.LAZY)
    private Collection<TrivPlayers> trivPlayersCollection;

    public TrivAchievements() {
    }

    public TrivAchievements(BigDecimal achId) {
        this.achId = achId;
    }

    public TrivAchievements(BigDecimal achId, String achName, String achType, BigInteger achAmount, BigInteger achVersion) {
        this.achId = achId;
        this.achName = achName;
        this.achType = achType;
        this.achAmount = achAmount;
        this.achVersion = achVersion;
    }

    public BigDecimal getAchId() {
        return achId;
    }

    public void setAchId(BigDecimal achId) {
        this.achId = achId;
    }

    public String getAchName() {
        return achName;
    }

    public void setAchName(String achName) {
        this.achName = achName;
    }

    public String getAchType() {
        return achType;
    }

    public void setAchType(String achType) {
        this.achType = achType;
    }

    public BigInteger getAchAmount() {
        return achAmount;
    }

    public void setAchAmount(BigInteger achAmount) {
        this.achAmount = achAmount;
    }

    public String getAchDescription() {
        return achDescription;
    }

    public void setAchDescription(String achDescription) {
        this.achDescription = achDescription;
    }

    public BigInteger getAchVersion() {
        return achVersion;
    }

    public void setAchVersion(BigInteger achVersion) {
        this.achVersion = achVersion;
    }

    public Collection<TrivPlayers> getTrivPlayersCollection() {
        return trivPlayersCollection;
    }

    public void setTrivPlayersCollection(Collection<TrivPlayers> trivPlayersCollection) {
        this.trivPlayersCollection = trivPlayersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (achId != null ? achId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivAchievements)) {
            return false;
        }
        TrivAchievements other = (TrivAchievements) object;
        if ((this.achId == null && other.achId != null) || (this.achId != null && !this.achId.equals(other.achId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivAchievements[ achId=" + achId + " ]";
    }
    
}
