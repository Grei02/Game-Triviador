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
import jakarta.persistence.Version;

/**
 *
 * @author Sofia Bejarano Mora
 */
@Entity
@Table(name = "TRIV_CATEGORIES", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "Categories.findAll", query = "SELECT t FROM Categories t"),
    @NamedQuery(name = "Categories.findByCatId", query = "SELECT t FROM Categories t WHERE t.catId = :catId"),
    @NamedQuery(name = "Categories.findByCatName", query = "SELECT t FROM Categories t WHERE t.name = :name"),
    @NamedQuery(name = "Categories.findByCatNameimage", query = "SELECT t FROM Categories t WHERE t.nameimage = :nameimage"),
    @NamedQuery(name = "Categories.findByCatVersion", query = "SELECT t FROM Categories t WHERE t.version = :version")*/})
public class Categories implements Serializable {

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
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Questions> questionsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category", fetch = FetchType.LAZY)
    private List<PlayersCategoriesGame> playersCategoriesGameList;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<QuestionsCategories> questionsCategoriesList;
    @Version
    @Column(name = "CAT_VERSION")
    private Long version;

    public Categories() {
    }

    public Categories(Long id) {
        this.id = id;
    }

    public Categories(TrivCategoriesDto categoriesDto) {
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

    public List<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(List<Questions> questionsList) {
        this.questionsList = questionsList;
    }

    public List<PlayersCategoriesGame> getPlayersCategoriesGameList() {
        return playersCategoriesGameList;
    }

    public void setPlayersCategoriesGameList(List<PlayersCategoriesGame> playersCategoriesGameList) {
        this.playersCategoriesGameList = playersCategoriesGameList;
    }

    public List<QuestionsCategories> getQuestionsCategoriesList() {
        return questionsCategoriesList;
    }

    public void setQuestionsCategoriesList(List<QuestionsCategories> questionsCategoriesList) {
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
        if (!(object instanceof Categories)) {
            return false;
        }
        Categories other = (Categories) object;
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