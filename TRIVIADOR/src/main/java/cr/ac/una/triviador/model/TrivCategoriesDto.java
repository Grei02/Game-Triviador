/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Sofia Bejarano Mora
 */
public class TrivCategoriesDto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty nameimage;
    private Long version;
    private List<TrivQuestions> questionsList;
    private List<TrivPlayersCategoriesGame> playersCategoriesGameList;
    private List<TrivQuestionsCategories> questionsCategoriesList;

    public TrivCategoriesDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.nameimage = new SimpleStringProperty("");
    }

    public TrivCategoriesDto(TrivCategories categories) {
        this();
        this.id.set(categories.getId().toString());
        this.name.set(categories.getName());
        this.nameimage.set(categories.getNameimage());
        this.version = categories.getVersion();
    }
    
    public Long getId() {
        if(this.id.get()!=null & !this.id.get().isBlank()){
            return Long.valueOf(id.get());
        }
        return null;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getNameimage() {
        return nameimage.get();
    }

    public void setNameimage(String nameimage) {
        this.nameimage.set(nameimage);
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
        if (!(object instanceof TrivCategoriesDto)) {
            return false;
        }
        TrivCategoriesDto other = (TrivCategoriesDto) object;
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
