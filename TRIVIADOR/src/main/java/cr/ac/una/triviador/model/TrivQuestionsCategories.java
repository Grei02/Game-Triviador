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
@Table(name = "TRIV_QUESTIONS_CATEGORIES")
@NamedQueries({
    @NamedQuery(name = "TrivQuestionsCategories.findAll", query = "SELECT t FROM TrivQuestionsCategories t"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatId", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.qcatId = :qcatId"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatCountanswer", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.qcatCountanswer = :qcatCountanswer"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatCounthit", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.qcatCounthit = :qcatCounthit"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatVersion", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.qcatVersion = :qcatVersion")})
public class TrivQuestionsCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "QCAT_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal qcatId;
    @Column(name = "QCAT_COUNTANSWER")
    private BigInteger qcatCountanswer;
    @Column(name = "QCAT_COUNTHIT")
    private BigInteger qcatCounthit;
    @Basic(optional = false)
    @Column(name = "QCAT_VERSION", nullable = false)
    private BigInteger qcatVersion;
    @JoinColumn(name = "QCAT_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivCategories qcatCatId;
    @JoinColumn(name = "PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivPlayers plaId;

    public TrivQuestionsCategories() {
    }

    public TrivQuestionsCategories(BigDecimal qcatId) {
        this.qcatId = qcatId;
    }

    public TrivQuestionsCategories(BigDecimal qcatId, BigInteger qcatVersion) {
        this.qcatId = qcatId;
        this.qcatVersion = qcatVersion;
    }

    public BigDecimal getQcatId() {
        return qcatId;
    }

    public void setQcatId(BigDecimal qcatId) {
        this.qcatId = qcatId;
    }

    public BigInteger getQcatCountanswer() {
        return qcatCountanswer;
    }

    public void setQcatCountanswer(BigInteger qcatCountanswer) {
        this.qcatCountanswer = qcatCountanswer;
    }

    public BigInteger getQcatCounthit() {
        return qcatCounthit;
    }

    public void setQcatCounthit(BigInteger qcatCounthit) {
        this.qcatCounthit = qcatCounthit;
    }

    public BigInteger getQcatVersion() {
        return qcatVersion;
    }

    public void setQcatVersion(BigInteger qcatVersion) {
        this.qcatVersion = qcatVersion;
    }

    public TrivCategories getQcatCatId() {
        return qcatCatId;
    }

    public void setQcatCatId(TrivCategories qcatCatId) {
        this.qcatCatId = qcatCatId;
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
        hash += (qcatId != null ? qcatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivQuestionsCategories)) {
            return false;
        }
        TrivQuestionsCategories other = (TrivQuestionsCategories) object;
        if ((this.qcatId == null && other.qcatId != null) || (this.qcatId != null && !this.qcatId.equals(other.qcatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivQuestionsCategories[ qcatId=" + qcatId + " ]";
    }
    
}
