/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name = "TRIV_QUESTIONS", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "TrivQuestions.findAll", query = "SELECT t FROM TrivQuestions t"),
    @NamedQuery(name = "TrivQuestions.findByQueId", query = "SELECT t FROM TrivQuestions t WHERE t.id = :id"),
    @NamedQuery(name = "TrivQuestions.findByQueQuestions", query = "SELECT t FROM TrivQuestions t WHERE t.questions = :questions"),
    @NamedQuery(name = "TrivQuestions.findByQueIsEnabled", query = "SELECT t FROM TrivQuestions t WHERE t.isEnabled = :isEnabled"),
    @NamedQuery(name = "TrivQuestions.findByQueVersion", query = "SELECT t FROM TrivQuestions t WHERE t.queVersion = :queVersion")*/})
public class TrivQuestions implements Serializable {

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
    @Version
    @Column(name = "QUE_VERSION")
    private Long version;
    @ManyToMany(mappedBy = "trivQuestionsList", fetch = FetchType.LAZY)
    private List<TrivGame> gameList;
    @JoinColumn(name = "CAT_ID", referencedColumnName = "CAT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivCategories catId;
    @OneToMany(mappedBy = "queId", fetch = FetchType.LAZY)
    private List<TrivAnswers> answersList;

    public TrivQuestions() {
    }

    public TrivQuestions(Long id) {
        this.id = id;
    }
    
    public void TrivQuestions (TrivQuestionsDto questionsDto) {
        this.id = questionsDto.getId();
        update(questionsDto);
    }
    
    public void update(TrivQuestionsDto questionsDto) {
        this.id = questionsDto.getId();
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

    public List<TrivGame> getGameList() {
        return gameList;
    }

    public void setGameList(List<TrivGame> gameList) {
        this.gameList = gameList;
    }

    public TrivCategories getCatId() {
        return catId;
    }

    public void setCatId(TrivCategories catId) {
        this.catId = catId;
    }

    public List<TrivAnswers> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<TrivAnswers> answersList) {
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrivQuestions)) {
            return false;
        }
        TrivQuestions other = (TrivQuestions) object;
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
