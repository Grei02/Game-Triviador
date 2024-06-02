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
import java.math.BigInteger;

@Entity
@Table(name = "TRIV_ANSWERS", catalog = "", schema = "TRI")
@NamedQueries({ /* @NamedQuery(name = "Answers.findAll", query = "SELECT t FROM Answers t"),
    @NamedQuery(name = "Answers.findByAnsId", query = "SELECT t FROM Answers t WHERE t.id = :id"),
    @NamedQuery(name = "Answers.findByAnsVersion", query = "SELECT t FROM Answers t WHERE t.version = :version"),
    @NamedQuery(name = "Answers.findByAnsAnswers", query = "SELECT t FROM Answers t WHERE t.answers = :answers"),
    @NamedQuery(name = "Answers.findByAnsIsCorrect", query = "SELECT t FROM Answers t WHERE t.isCorrect = :isCorrect"),
    @NamedQuery(name = "Answers.findByAnsSelectednumber", query = "SELECT t FROM Answers t WHERE t.selectednumber = :selectednumber")*/})
public class Answers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TRI_ANSWERS_ANS_ID_ANSWERS", sequenceName = "tri.TRIV_ANSWERS_SEQ01", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRI_ANSWERS_ANS_ID_ANSWERS")
    @Basic(optional = false)
    @Column(name = "ANS_ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ANS_ANSWERS")
    private String answers;
    @Basic(optional = false)
    @Column(name = "ANS_IS_CORRECT")
    private String isCorrect;
    @Version
    @Column(name = "ANS_VERSION")
    private Long version;
    @Column(name = "ANS_SELECTEDNUMBER")
    private Long selectednumber;
    @JoinColumn(name = "QXA_QUE_ID", referencedColumnName = "QUE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Questions questions;

    public Answers() {
    }

    public Answers(Long id) {
        this.id = id;
    }

    public Answers(TrivAnswersDto answersDto) {
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

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
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
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
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
