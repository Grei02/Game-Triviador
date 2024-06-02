package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.math.BigInteger;

@Entity
@Table(name = "TRIV_QUESTIONS", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "Questions.findAll", query = "SELECT t FROM Questions t"),
    @NamedQuery(name = "Questions.findByQueId", query = "SELECT t FROM Questions t WHERE t.id = :id"),
    @NamedQuery(name = "Questions.findByQueQuestions", query = "SELECT t FROM Questions t WHERE t.questions = :questions"),
    @NamedQuery(name = "Questions.findByQueIsEnabled", query = "SELECT t FROM Questions t WHERE t.isEnabled = :isEnabled"),
    @NamedQuery(name = "Questions.findByQueVersion", query = "SELECT t FROM Questions t WHERE t.queVersion = :queVersion")*/})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "TRI_QUESTIONS_QUE_ID_GENERATOR", sequenceName = "tri.TRIV_QUESTIONS_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_QUESTIONS_QUE_ID_GENERATOR")
    @Basic(optional = false)
    @Column(name = "QUE_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "QUE_QUESTIONS")
    private String questions;
    @Basic(optional = false)
    @Column(name = "QUE_IS_ENABLED")
    private String isEnabled;
    @ManyToMany(mappedBy = "questionsList", fetch = FetchType.LAZY)
    private List<Game> gameList;
    @OneToMany(mappedBy = "questions", fetch = FetchType.LAZY)
    private List<Answers> answersList;
    @Version
    @Column(name = "QUE_VERSION")
    private Long version;
    @JoinColumn(name = "CXQ_CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Categories category;

    public Questions() {
    }

    public Questions(Long id) {
        this.id = id;
    }
    
    public Questions (TrivQuestionsDto questionsDto) {
        this.id = questionsDto.getId();
        update(questionsDto);
    }
    
    public void update(TrivQuestionsDto questionsDto) {
        this.questions = questionsDto.getQuestions();
        this.isEnabled = questionsDto.getIsEnabled();
        this.version = questionsDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public List<Answers> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answers> answersList) {
        this.answersList = answersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivQuestions[ id=" + id + " ]";
    }
}