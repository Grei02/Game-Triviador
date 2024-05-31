/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class TrivQuestionsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private SimpleStringProperty id;
    private SimpleStringProperty questions;
    private SimpleBooleanProperty isEnabled;
    private Long version;
    //oprivate List<TrivGameDto> gameDtoList;
    private TrivCategoriesDto categoryDto;
    private List<TrivAnswersDto> answersDtoList;

    public TrivQuestionsDto() {
        this.id = new SimpleStringProperty("");
        this.questions = new SimpleStringProperty("");
        this.isEnabled = new SimpleBooleanProperty(true);
    }

    public TrivQuestionsDto(TrivQuestions question) {
        this();
        this.id.set(question.getId().toString());
        this.questions.set(question.getQuestions());
        this.isEnabled.set(question.getIsEnabled().equals("1"));
        this.version = question.getVersion();
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

    public String getQuestions() {
        return questions.get();
    }

    public void setQuestions(String questions) {
        this.questions.set(questions);
    }

    public String getIsEnabled() {
        return isEnabled.get() ? "1" : "0";
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled.set(isEnabled.equals("1"));
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

//    public List<TrivGameDto> getGameDtoList() {
//        return gameDtoList;
//    }
//
//    public void setGameDtoList(List<TrivGameDto> gameDtoList) {
//        this.gameDtoList = gameDtoList;
//    }

    public TrivCategoriesDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(TrivCategoriesDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public List<TrivAnswersDto> getAnswersDtoList() {
        return answersDtoList;
    }

    public void setAnswersDtoList(List<TrivAnswersDto> answersDtoList) {
        this.answersDtoList = answersDtoList;
    }
    
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
