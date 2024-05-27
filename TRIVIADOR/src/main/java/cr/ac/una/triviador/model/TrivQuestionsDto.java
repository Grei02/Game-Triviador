/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import java.util.List;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Sofia Bejarano Mora
 */
public class TrivQuestionsDto {

    private static final long serialVersionUID = 1L;

    private SimpleStringProperty id;
    private SimpleStringProperty questions;
    private SimpleBooleanProperty isEnabled;
    private Long version;
    // private List<TrivGame> gameList;
    //  private TrivCategories catId;
    // private List<TrivAnswers> answersList;
    
     public TrivQuestionsDto(TrivQuestions question) {
         this();
         this.id.set(question.getId().toString());
         this.questions.set(question.getQuestions());
         this.isEnabled.set(question.getIsEnabled().equals("1"));
    }

    public TrivQuestionsDto() {
        this.id = new SimpleStringProperty("");
        this.questions = new SimpleStringProperty("");
        this.isEnabled = new SimpleBooleanProperty(true);
    }

//    public TrivQuestions(Long id) {
//        this.id = id;
//    }
//
//    public TrivQuestions(Long id, String questions, String isEnabled, Long version) {
//        this.id = id;
//        this.questions = questions;
//        this.isEnabled = isEnabled;
//        this.version = version;
//    }
    public Long getId() {
        if (this.id.get() != null & !this.id.get().isBlank()) {
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public String getQuestions() {
        return questions.get();
    }

    public void setQuestions(String questions) {
        this.questions.set(questions.toString());
    }

    public String getIsEnabled() {
        return isEnabled.get()?"0":"1";
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled.set(isEnabled.equalsIgnoreCase("1"));
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

//    public List<TrivGame> getGameList() {
//        return gameList;
//    }
//
//    public void setGameList(List<TrivGame> gameList) {
//        this.gameList = gameList;
//    }
//
//    public TrivCategories getCatId() {
//        return catId;
//    }
//
//    public void setCatId(TrivCategories catId) {
//        this.catId = catId;
//    }
//
//    public List<TrivAnswers> getAnswersList() {
//        return answersList;
//    }
//
//    public void setAnswersList(List<TrivAnswers> answersList) {
//        this.answersList = answersList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TrivQuestions)) {
            return false;
        }
        TrivQuestionsDto other = (TrivQuestionsDto) object;
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
