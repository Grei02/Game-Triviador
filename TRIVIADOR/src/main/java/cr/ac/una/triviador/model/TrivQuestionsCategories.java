package cr.ac.una.triviador.model;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "TRIV_QUESTIONS_CATEGORIES", catalog = "", schema = "TRI")
@NamedQueries({
    /*@NamedQuery(name = "TrivQuestionsCategories.findAll", query = "SELECT t FROM TrivQuestionsCategories t"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatId", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.id = :id"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatCountanswer", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.countanswer = :countanswer"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatCounthit", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.counthit = :counthit"),
    @NamedQuery(name = "TrivQuestionsCategories.findByQcatVersion", query = "SELECT t FROM TrivQuestionsCategories t WHERE t.version = :version")*/})
public class TrivQuestionsCategories implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_QUESTIONS_CATEGORIES_QXC_ID_QUESTIONS_CATEGORIES", sequenceName = "tri.TRIV_QUESTIONS_CATEGORIES_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_QUESTIONS_CATEGORIES_QXC_ID_QUESTIONS_CATEGORIES")
    @Basic(optional = false)
    @Column(name = "QCAT_ID")
    private Long id;
    @Column(name = "QCAT_COUNTANSWER")
    private Long countanswer;
    @Column(name = "QCAT_COUNTHIT")
    private Long counthit;
    @Version
    @Column(name = "QCAT_VERSION")
    private Long version;
    @JoinColumn(name = "QCAT_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivCategories category;
    @JoinColumn(name = "PLA_ID", referencedColumnName = "PLA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivPlayers player;

    public TrivQuestionsCategories() {
        
    }

    public TrivQuestionsCategories(Long id) {
        this.id = id;
    }

    public TrivQuestionsCategories(TrivQuestionsCategoriesDto questionsCategoriesDto) {
        this.id = questionsCategoriesDto.getId();
        update(questionsCategoriesDto);
    }
    
        public void update(TrivQuestionsCategoriesDto questionsCategoriesDto) {
        this.countanswer = questionsCategoriesDto.getCountanswer(); 
        this.counthit = questionsCategoriesDto.getCounthit();
        this.version = questionsCategoriesDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCountanswer() {
        return countanswer;
    }

    public void setCountanswer(Long countanswer) {
        this.countanswer = countanswer;
    }

    public Long getCounthit() {
        return counthit;
    }

    public void setCounthit(Long counthit) {
        this.counthit = counthit;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivCategories getCategory() {
        return category;
    }

    public void setCategory(TrivCategories category) {
        this.category = category;
    }

    public TrivPlayers getPlayer() {
        return player;
    }

    public void setPlayer(TrivPlayers player) {
        this.player = player;
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
        if (!(object instanceof TrivQuestionsCategories)) {
            return false;
        }
        TrivQuestionsCategories other = (TrivQuestionsCategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivQuestionsCategories[ id=" + id + " ]";
    }
    
}