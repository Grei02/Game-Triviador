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
@Table(name = "TRIV_ANSWERS", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "TrivAnswers.findAll", query = "SELECT t FROM TrivAnswers t"),
    @NamedQuery(name = "TrivAnswers.findByAnsId", query = "SELECT t FROM TrivAnswers t WHERE t.id = :id"),
    @NamedQuery(name = "TrivAnswers.findByAnsVersion", query = "SELECT t FROM TrivAnswers t WHERE t.version = :version"),
    @NamedQuery(name = "TrivAnswers.findByAnsAnswers", query = "SELECT t FROM TrivAnswers t WHERE t.answers = :answers"),
    @NamedQuery(name = "TrivAnswers.findByAnsIsCorrect", query = "SELECT t FROM TrivAnswers t WHERE t.isCorrect = :isCorrect"),
    @NamedQuery(name = "TrivAnswers.findByAnsSelectednumber", query = "SELECT t FROM TrivAnswers t WHERE t.selectednumber = :selectednumber")*/})
public class TrivAnswers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TRI_ANSWERS_ANS_ID_ANSWERS", sequenceName = "tri.TRIV_ANSWERS_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_ANSWERS_ANS_ID_ANSWERS")
    @Basic(optional = false)
    @Column(name = "ANS_ID")
    private Long id;
    @Version
    @Column(name = "ANS_VERSION")
    private Long version;
    @Basic(optional = false)
    @Column(name = "ANS_ANSWERS")
    private String answers;
    @Basic(optional = false)
    @Column(name = "ANS_IS_CORRECT")
    private String isCorrect;
    @Column(name = "ANS_SELECTEDNUMBER")
    private Long selectednumber;
    @JoinColumn(name = "QUE_ID", referencedColumnName = "QUE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TrivQuestions questions;

    public TrivAnswers() {
    }

    public TrivAnswers(Long id) {
        this.id = id;
    }

    public TrivAnswers(TrivAnswersDto answersDto) {
        this.id = answersDto.getId();
        update(answersDto);
    }

    public void update(TrivAnswersDto answersDto) {
        this.selectednumber = answersDto.getSelectednumber();
        this.answers = answersDto.getAnswers();
        this.isCorrect = answersDto.getIsCorrect();
        this.version = answersDto.getVersion();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(String isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Long getSelectednumber() {
        return selectednumber;
    }

    public void setSelectednumber(Long selectednumber) {
        this.selectednumber = selectednumber;
    }

    public TrivQuestions getQuestions() {
        return questions;
    }

    public void setQuestions(TrivQuestions questions) {
        this.questions = questions;
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
        if (!(object instanceof TrivAnswers)) {
            return false;
        }
        TrivAnswers other = (TrivAnswers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivAnswers[ id=" + id + " ]";
    }

}