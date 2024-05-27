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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_QUESTIONS")
@NamedQueries({
    @NamedQuery(name = "TrivQuestions.findAll", query = "SELECT t FROM TrivQuestions t"),
    @NamedQuery(name = "TrivQuestions.findByQueId", query = "SELECT t FROM TrivQuestions t WHERE t.queId = :queId"),
    @NamedQuery(name = "TrivQuestions.findByQueQuestions", query = "SELECT t FROM TrivQuestions t WHERE t.queQuestions = :queQuestions"),
    @NamedQuery(name = "TrivQuestions.findByQueIsEnabled", query = "SELECT t FROM TrivQuestions t WHERE t.queIsEnabled = :queIsEnabled"),
    @NamedQuery(name = "TrivQuestions.findByQueVersion", query = "SELECT t FROM TrivQuestions t WHERE t.queVersion = :queVersion")})
public class TrivQuestions implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "QUE_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal queId;
    @Basic(optional = false)
    @Column(name = "QUE_QUESTIONS", nullable = false, length = 300)
    private String queQuestions;
    @Basic(optional = false)
    @Column(name = "QUE_IS_ENABLED", nullable = false, length = 1)
    private String queIsEnabled;
    @Basic(optional = false)
    @Column(name = "QUE_VERSION", nullable = false)
    private BigInteger queVersion;
    @ManyToMany(mappedBy = "trivQuestionsCollection", fetch = FetchType.LAZY)
    private Collection<TrivGame> trivGameCollection;
    @JoinColumn(name = "CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivCategories catId;
    @OneToMany(mappedBy = "queId", fetch = FetchType.LAZY)
    private Collection<TrivAnswers> trivAnswersCollection;

    public TrivQuestions() {
    }

    public TrivQuestions(BigDecimal queId) {
        this.queId = queId;
    }

    public TrivQuestions(BigDecimal queId, String queQuestions, String queIsEnabled, BigInteger queVersion) {
        this.queId = queId;
        this.queQuestions = queQuestions;
        this.queIsEnabled = queIsEnabled;
        this.queVersion = queVersion;
    }

    public BigDecimal getQueId() {
        return queId;
    }

    public void setQueId(BigDecimal queId) {
        this.queId = queId;
    }

    public String getQueQuestions() {
        return queQuestions;
    }

    public void setQueQuestions(String queQuestions) {
        this.queQuestions = queQuestions;
    }

    public String getQueIsEnabled() {
        return queIsEnabled;
    }

    public void setQueIsEnabled(String queIsEnabled) {
        this.queIsEnabled = queIsEnabled;
    }

    public BigInteger getQueVersion() {
        return queVersion;
    }

    public void setQueVersion(BigInteger queVersion) {
        this.queVersion = queVersion;
    }

    public Collection<TrivGame> getTrivGameCollection() {
        return trivGameCollection;
    }

    public void setTrivGameCollection(Collection<TrivGame> trivGameCollection) {
        this.trivGameCollection = trivGameCollection;
    }

    public TrivCategories getCatId() {
        return catId;
    }

    public void setCatId(TrivCategories catId) {
        this.catId = catId;
    }

    public Collection<TrivAnswers> getTrivAnswersCollection() {
        return trivAnswersCollection;
    }

    public void setTrivAnswersCollection(Collection<TrivAnswers> trivAnswersCollection) {
        this.trivAnswersCollection = trivAnswersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (queId != null ? queId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivQuestions)) {
            return false;
        }
        TrivQuestions other = (TrivQuestions) object;
        if ((this.queId == null && other.queId != null) || (this.queId != null && !this.queId.equals(other.queId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivQuestions[ queId=" + queId + " ]";
    }
    
}
