/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_WILDCARD", catalog = "", schema = "TRI")
@NamedQueries({
    @NamedQuery(name = "TrivWildcard.findAll", query = "SELECT t FROM TrivWildcard t"),
    @NamedQuery(name = "TrivWildcard.findByWildId", query = "SELECT t FROM TrivWildcard t WHERE t.wildId = :wildId"),
    @NamedQuery(name = "TrivWildcard.findByWildName", query = "SELECT t FROM TrivWildcard t WHERE t.wildName = :wildName"),
    @NamedQuery(name = "TrivWildcard.findByWildVersion", query = "SELECT t FROM TrivWildcard t WHERE t.wildVersion = :wildVersion")})
public class TrivWildcard implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "WILD_ID")
    private BigDecimal wildId;
    @Basic(optional = false)
    @Column(name = "WILD_NAME")
    private String wildName;
    @Basic(optional = false)
    @Column(name = "WILD_VERSION")
    private BigInteger wildVersion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxwxgWildId", fetch = FetchType.LAZY)
    private List<TrivPlayersWildcardGame> trivPlayersWildcardGameList;

    public TrivWildcard() {
    }

    public TrivWildcard(BigDecimal wildId) {
        this.wildId = wildId;
    }

    public TrivWildcard(BigDecimal wildId, String wildName, BigInteger wildVersion) {
        this.wildId = wildId;
        this.wildName = wildName;
        this.wildVersion = wildVersion;
    }

    public BigDecimal getWildId() {
        return wildId;
    }

    public void setWildId(BigDecimal wildId) {
        this.wildId = wildId;
    }

    public String getWildName() {
        return wildName;
    }

    public void setWildName(String wildName) {
        this.wildName = wildName;
    }

    public BigInteger getWildVersion() {
        return wildVersion;
    }

    public void setWildVersion(BigInteger wildVersion) {
        this.wildVersion = wildVersion;
    }

    public List<TrivPlayersWildcardGame> getTrivPlayersWildcardGameList() {
        return trivPlayersWildcardGameList;
    }

    public void setTrivPlayersWildcardGameList(List<TrivPlayersWildcardGame> trivPlayersWildcardGameList) {
        this.trivPlayersWildcardGameList = trivPlayersWildcardGameList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wildId != null ? wildId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivWildcard)) {
            return false;
        }
        TrivWildcard other = (TrivWildcard) object;
        if ((this.wildId == null && other.wildId != null) || (this.wildId != null && !this.wildId.equals(other.wildId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivWildcard[ wildId=" + wildId + " ]";
    }
    
}
