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
@Table(name = "TRIV_CATEGORIES")
@NamedQueries({
    @NamedQuery(name = "TrivCategories.findAll", query = "SELECT t FROM TrivCategories t"),
    @NamedQuery(name = "TrivCategories.findByCatId", query = "SELECT t FROM TrivCategories t WHERE t.catId = :catId"),
    @NamedQuery(name = "TrivCategories.findByCatName", query = "SELECT t FROM TrivCategories t WHERE t.catName = :catName"),
    @NamedQuery(name = "TrivCategories.findByCatNameimage", query = "SELECT t FROM TrivCategories t WHERE t.catNameimage = :catNameimage"),
    @NamedQuery(name = "TrivCategories.findByCatVersion", query = "SELECT t FROM TrivCategories t WHERE t.catVersion = :catVersion")})
public class TrivCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CAT_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal catId;
    @Basic(optional = false)
    @Column(name = "CAT_NAME", nullable = false, length = 20)
    private String catName;
    @Column(name = "CAT_NAMEIMAGE", length = 30)
    private String catNameimage;
    @Basic(optional = false)
    @Column(name = "CAT_VERSION", nullable = false)
    private BigInteger catVersion;
    @OneToMany(mappedBy = "catId", fetch = FetchType.LAZY)
    private Collection<TrivQuestions> trivQuestionsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgCatId", fetch = FetchType.LAZY)
    private Collection<TrivPlayersCategoriesGame> trivPlayersCategoriesGameCollection;
    @OneToMany(mappedBy = "qcatCatId", fetch = FetchType.LAZY)
    private Collection<TrivQuestionsCategories> trivQuestionsCategoriesCollection;

    public TrivCategories() {
    }

    public TrivCategories(BigDecimal catId) {
        this.catId = catId;
    }

    public TrivCategories(BigDecimal catId, String catName, BigInteger catVersion) {
        this.catId = catId;
        this.catName = catName;
        this.catVersion = catVersion;
    }

    public BigDecimal getCatId() {
        return catId;
    }

    public void setCatId(BigDecimal catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatNameimage() {
        return catNameimage;
    }

    public void setCatNameimage(String catNameimage) {
        this.catNameimage = catNameimage;
    }

    public BigInteger getCatVersion() {
        return catVersion;
    }

    public void setCatVersion(BigInteger catVersion) {
        this.catVersion = catVersion;
    }

    public Collection<TrivQuestions> getTrivQuestionsCollection() {
        return trivQuestionsCollection;
    }

    public void setTrivQuestionsCollection(Collection<TrivQuestions> trivQuestionsCollection) {
        this.trivQuestionsCollection = trivQuestionsCollection;
    }

    public Collection<TrivPlayersCategoriesGame> getTrivPlayersCategoriesGameCollection() {
        return trivPlayersCategoriesGameCollection;
    }

    public void setTrivPlayersCategoriesGameCollection(Collection<TrivPlayersCategoriesGame> trivPlayersCategoriesGameCollection) {
        this.trivPlayersCategoriesGameCollection = trivPlayersCategoriesGameCollection;
    }

    public Collection<TrivQuestionsCategories> getTrivQuestionsCategoriesCollection() {
        return trivQuestionsCategoriesCollection;
    }

    public void setTrivQuestionsCategoriesCollection(Collection<TrivQuestionsCategories> trivQuestionsCategoriesCollection) {
        this.trivQuestionsCategoriesCollection = trivQuestionsCategoriesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catId != null ? catId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivCategories)) {
            return false;
        }
        TrivCategories other = (TrivCategories) object;
        if ((this.catId == null && other.catId != null) || (this.catId != null && !this.catId.equals(other.catId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivCategories[ catId=" + catId + " ]";
    }
    
}
