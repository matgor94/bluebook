package matgor94.ahe.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "uprawnienia", schema = "bluebook", catalog = "")
public class UprawnieniaEntity {
    private int idUprawnienia;
    private Enum uprawnienie;
    private String opis;

    @Id
    @Column(name = "id_uprawnienia")
    public int getIdUprawnienia() {
        return idUprawnienia;
    }

    public void setIdUprawnienia(int idUprawnienia) {
        this.idUprawnienia = idUprawnienia;
    }

//    @Basic
//    @Column(name = "uprawnienie")
//    public Object getUprawnienie() {
//        return uprawnienie;
//    }
//
//    public void setUprawnienie(Object uprawnienie) {
//        this.uprawnienie = uprawnienie;
//    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UprawnieniaEntity that = (UprawnieniaEntity) o;

        if (idUprawnienia != that.idUprawnienia) return false;
        if (uprawnienie != null ? !uprawnienie.equals(that.uprawnienie) : that.uprawnienie != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUprawnienia;
        result = 31 * result + (uprawnienie != null ? uprawnienie.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
