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
@Table(name = "rola", schema = "bluebook", catalog = "")
public class RolaEntity {
    private int idRola;
    private String rola;
    private String opis;

    @Id
    @Column(name = "id_rola")
    public int getIdRola() {
        return idRola;
    }

    public void setIdRola(int idRola) {
        this.idRola = idRola;
    }

    @Basic
    @Column(name = "rola")
    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
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

        RolaEntity that = (RolaEntity) o;

        if (idRola != that.idRola) return false;
        if (rola != null ? !rola.equals(that.rola) : that.rola != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRola;
        result = 31 * result + (rola != null ? rola.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
