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
@Table(name = "klasyfikacja", schema = "bluebook", catalog = "")
public class KlasyfikacjaEntity {
    private int idKlasyfikacja;
    private String opis;

    @Id
    @Column(name = "id_klasyfikacja")
    public int getIdKlasyfikacja() {
        return idKlasyfikacja;
    }

    public void setIdKlasyfikacja(int idKlasyfikacja) {
        this.idKlasyfikacja = idKlasyfikacja;
    }

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

        KlasyfikacjaEntity that = (KlasyfikacjaEntity) o;

        if (idKlasyfikacja != that.idKlasyfikacja) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idKlasyfikacja;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
