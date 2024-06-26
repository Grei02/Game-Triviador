/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TrivAnswersDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public SimpleStringProperty id;
    private Long version;
    public SimpleStringProperty answers;
    public SimpleBooleanProperty isCorrect;
    public SimpleStringProperty selectednumber;
    public TrivQuestionsDto questionsDto;

    public TrivAnswersDto() {
        this.id = new SimpleStringProperty("");
        this.answers = new SimpleStringProperty("");
        this.isCorrect = new SimpleBooleanProperty(false);
        this.selectednumber=new SimpleStringProperty("");
    }

    public TrivAnswersDto(Answers trivAnswers) {
        this();
        this.id.set(trivAnswers.getId().toString());
        this.answers.set(trivAnswers.getAnswers());
        this.selectednumber.set(trivAnswers.getSelectednumber().toString());
        this.isCorrect.set(trivAnswers.getIsCorrect().equals("1"));
        this.version = trivAnswers.getVersion();
    }

    public Long getId() {
        if (this.id.get() != null & !this.id.get().isBlank()) {
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getAnswers() {
        return answers.get();
    }

    public void setAnswers(String answers) {
        this.answers.set(answers);
    }

    public String getIsCorrect() {
        return isCorrect.get()?"1":"0";
    }

    public void setIsCorrect(String isCorrect) {
        this.isCorrect.set(isCorrect.equals("1"));
    }

    public Long getSelectednumber() {
        if (this.selectednumber.get() != null & !this.selectednumber.get().isBlank()) {
            return Long.valueOf(selectednumber.get());
        }
        return null;
    }

    public void setSelectednumber(Long selectednumber) {
        this.selectednumber.set(selectednumber.toString());
    }

    public TrivQuestionsDto getQuestionsDto() {
        return questionsDto;
    }

    public void setQuestionsDto(TrivQuestionsDto questionsDto) {
        this.questionsDto = questionsDto;
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
        if (!(object instanceof TrivAnswersDto)) {
            return false;
        }
        TrivAnswersDto other = (TrivAnswersDto) object;
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
