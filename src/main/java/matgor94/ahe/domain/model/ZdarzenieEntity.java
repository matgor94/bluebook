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
@Table(name = "zdarzenie", schema = "bluebook", catalog = "")
public class ZdarzenieEntity {
    private int idZdarzenia;
    private String opis;
    private int idObserwator;
    private int idObserwacja;

    @Id
    @Column(name = "id_zdarzenia")
    public int getIdZdarzenia() {
        return idZdarzenia;
    }

    public void setIdZdarzenia(int idZdarzenia) {
        this.idZdarzenia = idZdarzenia;
    }

    @Basic
    @Column(name = "opis")
    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Basic
    @Column(name = "id_obserwator")
    public int getIdObserwator() {
        return idObserwator;
    }

    public void setIdObserwator(int idObserwator) {
        this.idObserwator = idObserwator;
    }

    @Basic
    @Column(name = "id_obserwacja")
    public int getIdObserwacja() {
        return idObserwacja;
    }

    public void setIdObserwacja(int idObserwacja) {
        this.idObserwacja = idObserwacja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZdarzenieEntity that = (ZdarzenieEntity) o;

        if (idZdarzenia != that.idZdarzenia) return false;
        if (idObserwator != that.idObserwator) return false;
        if (idObserwacja != that.idObserwacja) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idZdarzenia;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + idObserwator;
        result = 31 * result + idObserwacja;
        return result;
    }
}
