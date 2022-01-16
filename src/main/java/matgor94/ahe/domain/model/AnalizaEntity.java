package matgor94.ahe.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "analiza", schema = "bluebook", catalog = "")
public class AnalizaEntity {
    private int idAnaliza;
    private Date data;
    private String opis;
    private String wnioski;
    private int idZdarzenia;
    private int idKlasyfikacji;
    private int idOsoby;
    private int idObserwacji;

    @Id
    @Column(name = "id_analiza")
    public int getIdAnaliza() {
        return idAnaliza;
    }

    public void setIdAnaliza(int idAnaliza) {
        this.idAnaliza = idAnaliza;
    }

    @Basic
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
    @Column(name = "wnioski")
    public String getWnioski() {
        return wnioski;
    }

    public void setWnioski(String wnioski) {
        this.wnioski = wnioski;
    }

    @Basic
    @Column(name = "id_zdarzenia")
    public int getIdZdarzenia() {
        return idZdarzenia;
    }

    public void setIdZdarzenia(int idZdarzenia) {
        this.idZdarzenia = idZdarzenia;
    }

    @Basic
    @Column(name = "id_klasyfikacji")
    public int getIdKlasyfikacji() {
        return idKlasyfikacji;
    }

    public void setIdKlasyfikacji(int idKlasyfikacji) {
        this.idKlasyfikacji = idKlasyfikacji;
    }

    @Basic
    @Column(name = "id_osoby")
    public int getIdOsoby() {
        return idOsoby;
    }

    public void setIdOsoby(int idOsoby) {
        this.idOsoby = idOsoby;
    }

    @Basic
    @Column(name = "id_obserwacji")
    public int getIdObserwacji() {
        return idObserwacji;
    }

    public void setIdObserwacji(int idObserwacji) {
        this.idObserwacji = idObserwacji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnalizaEntity that = (AnalizaEntity) o;

        if (idAnaliza != that.idAnaliza) return false;
        if (idZdarzenia != that.idZdarzenia) return false;
        if (idKlasyfikacji != that.idKlasyfikacji) return false;
        if (idOsoby != that.idOsoby) return false;
        if (idObserwacji != that.idObserwacji) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;
        if (wnioski != null ? !wnioski.equals(that.wnioski) : that.wnioski != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAnaliza;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        result = 31 * result + (wnioski != null ? wnioski.hashCode() : 0);
        result = 31 * result + idZdarzenia;
        result = 31 * result + idKlasyfikacji;
        result = 31 * result + idOsoby;
        result = 31 * result + idObserwacji;
        return result;
    }
}
