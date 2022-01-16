package matgor94.ahe.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "obserwacja", schema = "bluebook", catalog = "")
public class ObserwacjaEntity {
    private int idObserwacja;
    private int idUprawnienia;
    private Timestamp data;
    private String lokalizacja;
    private String katalog;
    private String opis;

    @Id
    @Column(name = "id_obserwacja")
    public int getIdObserwacja() {
        return idObserwacja;
    }

    public void setIdObserwacja(int idObserwacja) {
        this.idObserwacja = idObserwacja;
    }

    @Basic
    @Column(name = "id_uprawnienia")
    public int getIdUprawnienia() {
        return idUprawnienia;
    }

    public void setIdUprawnienia(int idUprawnienia) {
        this.idUprawnienia = idUprawnienia;
    }

    @Basic
    @Column(name = "data")
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "lokalizacja")
    public String getLokalizacja() {
        return lokalizacja;
    }

    public void setLokalizacja(String lokalizacja) {
        this.lokalizacja = lokalizacja;
    }

    @Basic
    @Column(name = "katalog")
    public String getKatalog() {
        return katalog;
    }

    public void setKatalog(String katalog) {
        this.katalog = katalog;
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

        ObserwacjaEntity that = (ObserwacjaEntity) o;

        if (idObserwacja != that.idObserwacja) return false;
        if (idUprawnienia != that.idUprawnienia) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (lokalizacja != null ? !lokalizacja.equals(that.lokalizacja) : that.lokalizacja != null) return false;
        if (katalog != null ? !katalog.equals(that.katalog) : that.katalog != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idObserwacja;
        result = 31 * result + idUprawnienia;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (lokalizacja != null ? lokalizacja.hashCode() : 0);
        result = 31 * result + (katalog != null ? katalog.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
