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
@Table(name = "TRIV_ANSWERS", catalog = "", schema = "TRI")
@NamedQueries({
    @NamedQuery(name = "TrivAnswers.findAll", query = "SELECT t FROM TrivAnswers t"),
    @NamedQuery(name = "TrivAnswers.findByAnsId", query = "SELECT t FROM TrivAnswers t WHERE t.ansId = :ansId"),
    @NamedQuery(name = "TrivAnswers.findByAnsVersion", query = "SELECT t FROM TrivAnswers t WHERE t.ansVersion = :ansVersion"),
    @NamedQuery(name = "TrivAnswers.findByAnsAnswers", query = "SELECT t FROM TrivAnswers t WHERE t.ansAnswers = :ansAnswers"),
    @NamedQuery(name = "TrivAnswers.findByAnsIsCorrect", query = "SELECT t FROM TrivAnswers t WHERE t.ansIsCorrect = :ansIsCorrect"),
    @NamedQuery(name = "TrivAnswers.findByAnsSelectednumber", query = "SELECT t FROM TrivAnswers t WHERE t.ansSelectednumber = :ansSelectednumber")})
public class TrivAnswers implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ANS_ID")
    private BigDecimal ansId;
    @Basic(optional = false)
    @Column(name = "ANS_VERSION")
    private BigInteger ansVersion;
    @Basic(optional = false)
    @Column(name = "ANS_ANSWERS")
    private String ansAnswers;
    @Basic(optional = false)
    @Column(name = "ANS_IS_CORRECT")
    private String ansIsCorrect;
    @Column(name = "ANS_SELECTEDNUMBER")
    private BigInteger ansSelectednumber;
    @JoinColumn(name = "QUE_ID", referencedColumnName = "QUE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivQuestions queId;

    public TrivAnswers() {
    }

    public TrivAnswers(BigDecimal ansId) {
        this.ansId = ansId;
    }

    public TrivAnswers(BigDecimal ansId, BigInteger ansVersion, String ansAnswers, String ansIsCorrect) {
        this.ansId = ansId;
        this.ansVersion = ansVersion;
        this.ansAnswers = ansAnswers;
        this.ansIsCorrect = ansIsCorrect;
    }

    public BigDecimal getAnsId() {
        return ansId;
    }

    public void setAnsId(BigDecimal ansId) {
        this.ansId = ansId;
    }

    public BigInteger getAnsVersion() {
        return ansVersion;
    }

    public void setAnsVersion(BigInteger ansVersion) {
        this.ansVersion = ansVersion;
    }

    public String getAnsAnswers() {
        return ansAnswers;
    }

    public void setAnsAnswers(String ansAnswers) {
        this.ansAnswers = ansAnswers;
    }

    public String getAnsIsCorrect() {
        return ansIsCorrect;
    }

    public void setAnsIsCorrect(String ansIsCorrect) {
        this.ansIsCorrect = ansIsCorrect;
    }

    public BigInteger getAnsSelectednumber() {
        return ansSelectednumber;
    }

    public void setAnsSelectednumber(BigInteger ansSelectednumber) {
        this.ansSelectednumber = ansSelectednumber;
    }

    public TrivQuestions getQueId() {
        return queId;
    }

    public void setQueId(TrivQuestions queId) {
        this.queId = queId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ansId != null ? ansId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivAnswers)) {
            return false;
        }
        TrivAnswers other = (TrivAnswers) object;
        if ((this.ansId == null && other.ansId != null) || (this.ansId != null && !this.ansId.equals(other.ansId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivAnswers[ ansId=" + ansId + " ]";
    }
    
}
