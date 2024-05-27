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
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_CATEGORIES", catalog = "", schema = "TRI")
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
    @Column(name = "CAT_ID")
    private BigDecimal catId;
    @Basic(optional = false)
    @Column(name = "CAT_NAME")
    private String catName;
    @Column(name = "CAT_NAMEIMAGE")
    private String catNameimage;
    @Basic(optional = false)
    @Column(name = "CAT_VERSION")
    private BigInteger catVersion;
    @OneToMany(mappedBy = "catId", fetch = FetchType.LAZY)
    private List<TrivQuestions> trivQuestionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgCatId", fetch = FetchType.LAZY)
    private List<TrivPlayersCategoriesGame> trivPlayersCategoriesGameList;
    @OneToMany(mappedBy = "qcatCatId", fetch = FetchType.LAZY)
    private List<TrivQuestionsCategories> trivQuestionsCategoriesList;

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

    public List<TrivQuestions> getTrivQuestionsList() {
        return trivQuestionsList;
    }

    public void setTrivQuestionsList(List<TrivQuestions> trivQuestionsList) {
        this.trivQuestionsList = trivQuestionsList;
    }

    public List<TrivPlayersCategoriesGame> getTrivPlayersCategoriesGameList() {
        return trivPlayersCategoriesGameList;
    }

    public void setTrivPlayersCategoriesGameList(List<TrivPlayersCategoriesGame> trivPlayersCategoriesGameList) {
        this.trivPlayersCategoriesGameList = trivPlayersCategoriesGameList;
    }

    public List<TrivQuestionsCategories> getTrivQuestionsCategoriesList() {
        return trivQuestionsCategoriesList;
    }

    public void setTrivQuestionsCategoriesList(List<TrivQuestionsCategories> trivQuestionsCategoriesList) {
        this.trivQuestionsCategoriesList = trivQuestionsCategoriesList;
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
