/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.triviador.model;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;

public class TrivCategoriesDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public SimpleStringProperty id;
    public SimpleStringProperty name;
    public SimpleStringProperty nameimage;
    private Long version;
//    private List<TrivQuestionsDto> questionsDtoList;
//    private List<TrivPlayersCategoriesGameDto> playersCategoriesGameDtoList;
//    private List<TrivQuestionsCategoriesDto> questionsCategoriesDtoList;

    public TrivCategoriesDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
        this.nameimage = new SimpleStringProperty("");
    }

    public TrivCategoriesDto(Categories categories) {
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

//    public List<TrivQuestionsDto> getQuestionsDtoList() {
//        return questionsDtoList;
//    }
//
//    public void setQuestionsDtoList(List<TrivQuestionsDto> questionsDtoList) {
//        this.questionsDtoList = questionsDtoList;
//    }
//
//    public List<TrivPlayersCategoriesGameDto> getPlayersCategoriesGameDtoList() {
//        return playersCategoriesGameDtoList;
//    }
//
//    public void setPlayersCategoriesGameDtoList(List<TrivPlayersCategoriesGameDto> playersCategoriesGameDtoList) {
//        this.playersCategoriesGameDtoList = playersCategoriesGameDtoList;
//    }
//
//    public List<TrivQuestionsCategoriesDto> getQuestionsCategoriesDtoList() {
//        return questionsCategoriesDtoList;
//    }
//
//    public void setQuestionsCategoriesDtoList(List<TrivQuestionsCategoriesDto> questionsCategoriesDtoList) {
//        this.questionsCategoriesDtoList = questionsCategoriesDtoList;
//    }

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
