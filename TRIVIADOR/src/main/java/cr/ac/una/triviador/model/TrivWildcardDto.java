
package cr.ac.una.triviador.model;

import java.io.Serializable;
import java.util.List;
import javafx.beans.property.SimpleStringProperty;

public class TrivWildcardDto implements Serializable {

    private static final long serialVersionUID = 1L;

    public SimpleStringProperty id;
    public SimpleStringProperty name;
    private Long version;
   // private List<TrivPlayersWildcardGameDto> playersWildcardGameDtoList;

    public TrivWildcardDto() {
        this.id = new SimpleStringProperty("");
        this.name = new SimpleStringProperty("");
    }

    public TrivWildcardDto(Wildcard wildcard) {
        this();
        this.id.set(wildcard.getId().toString());
        this.name.set(wildcard.getName());
        this.version = wildcard.getVersion();
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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

//    public List<TrivPlayersWildcardGameDto> getPlayersWildcardGameDtoList() {
//        return playersWildcardGameDtoList;
//    }
//
//    public void setPlayersWildcardGameDtoList(List<TrivPlayersWildcardGameDto> playersWildcardGameDtoList) {
//        this.playersWildcardGameDtoList = playersWildcardGameDtoList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TrivWildcardDto)) {
            return false;
        }
        TrivWildcardDto other = (TrivWildcardDto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cr.ac.una.triviador.model.TrivWildcard[ id=" + id + " ]";
    }

}
