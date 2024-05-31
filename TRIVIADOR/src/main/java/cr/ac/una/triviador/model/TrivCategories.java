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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_CATEGORIES", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "TrivCategories.findAll", query = "SELECT t FROM TrivCategories t"),
    @NamedQuery(name = "TrivCategories.findByCatId", query = "SELECT t FROM TrivCategories t WHERE t.catId = :catId"),
    @NamedQuery(name = "TrivCategories.findByCatName", query = "SELECT t FROM TrivCategories t WHERE t.name = :name"),
    @NamedQuery(name = "TrivCategories.findByCatNameimage", query = "SELECT t FROM TrivCategories t WHERE t.nameimage = :nameimage"),
    @NamedQuery(name = "TrivCategories.findByCatVersion", query = "SELECT t FROM TrivCategories t WHERE t.version = :version")*/})
public class TrivCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_CATEGORIES_CAT_ID_CATEGORIES", sequenceName = "tri.TRIV_CATEGORIES_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_CATEGORIES_CAT_ID_CATEGORIES")
    @Basic(optional = false)
    @Column(name = "CAT_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CAT_NAME")
    private String name;
    @Column(name = "CAT_NAMEIMAGE")
    private String nameimage;
    @Basic(optional = false)
    @Column(name = "CAT_VERSION")
    private Long version;
    @OneToMany(mappedBy = "catId", fetch = FetchType.LAZY)
    private List<TrivQuestions> questionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pxcxgCatId", fetch = FetchType.LAZY)
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    @OneToMany(mappedBy = "qcatCatId", fetch = FetchType.LAZY)
    private List<TrivQuestionsCategories> questionsCategoriesList;

    public TrivCategories() {
    }

    public TrivCategories(Long id) {
        this.id = id;
    }

    public TrivCategories(TrivCategoriesDto categoriesDto) {
        this.id = categoriesDto.getId();
        update(categoriesDto);
    }
    
    public void update(TrivCategoriesDto categoriesDto) {
        this.name = categoriesDto.getName();
        this.nameimage = categoriesDto.getNameimage();
        this.version = categoriesDto.getVersion();
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

    public String getNameimage() {
        return nameimage;
    }

    public void setNameimage(String nameimage) {
        this.nameimage = nameimage;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<TrivQuestions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<TrivQuestions> questionsList) {
        this.questionsList = questionsList;
    }

    public List<TrivPlayersCategoriesGame> getPlayersCategoriesGameList() {
        return playersCategoriesGameList;
    }

    public void setPlayersCategoriesGameList(List<TrivPlayersCategoriesGame> playersCategoriesGameList) {
        this.playersCategoriesGameList = playersCategoriesGameList;
    }

    public List<TrivQuestionsCategories> getQuestionsCategoriesList() {
        return questionsCategoriesList;
    }

    public void setQuestionsCategoriesList(List<TrivQuestionsCategories> questionsCategoriesList) {
        this.questionsCategoriesList = questionsCategoriesList;
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
        if (!(object instanceof TrivCategories)) {
            return false;
        }
        TrivCategories other = (TrivCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivCategories[ id=" + id + " ]";
    }
    
}
