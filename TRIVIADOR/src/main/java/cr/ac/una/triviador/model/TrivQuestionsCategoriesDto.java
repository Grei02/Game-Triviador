
package cr.ac.una.triviador.model;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;


public class TrivQuestionsCategoriesDto implements Serializable  {

    private static final long serialVersionUID = 1L;
    private SimpleStringProperty id;
    private SimpleStringProperty countanswer;
    private SimpleStringProperty counthit;
    private Long version;
    private TrivCategoriesDto categoryDto;
    private TrivPlayersDto playerDto;

    public TrivQuestionsCategoriesDto() {
        this.id = new SimpleStringProperty("");
        this.countanswer = new SimpleStringProperty("");
        this.counthit = new SimpleStringProperty("");
    }

    public TrivQuestionsCategoriesDto(TrivQuestionsCategories questionsCategories) {
        this();
        this.id.set(questionsCategories.getId().toString());
        this.countanswer.set(questionsCategories.getCountanswer().toString());
        this.counthit.set(questionsCategories.getCounthit().toString());
        this.version = questionsCategories.getVersion();
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

    public Long getCountanswer() {
        if(this.countanswer.get()!=null & !this.countanswer.get().isBlank()){
            return Long.valueOf(countanswer.get());
        }
        return null;
    }

    public void setCountanswer(Long countanswer) {
       this.countanswer.set(countanswer.toString());
    }

    public Long getCounthit() {
        if(this.counthit.get()!=null & !this.counthit.get().isBlank()){
            return Long.valueOf(counthit.get());
        }
        return null;
    }

    public void setCounthit(Long counthit) {
       this.counthit.set(counthit.toString());
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public TrivCategoriesDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(TrivCategoriesDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public TrivPlayersDto getPlayerDto() {
        return playerDto;
    }

    public void setPlayerDto(TrivPlayersDto playerDto) {
        this.playerDto = playerDto;
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
        if (!(object instanceof TrivQuestionsCategoriesDto)) {
            return false;
        }
        TrivQuestionsCategoriesDto other = (TrivQuestionsCategoriesDto) object;
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
