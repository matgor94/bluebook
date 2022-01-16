package model;

import javax.persistence.*;

@Entity
@Table(name = "interpretacja", schema = "bluebook", catalog = "")
public class InterpretacjaEntity {
    private int idInterpretacja;
    private String opis;

    @Id
    @Column(name = "id_interpretacja")
    public int getIdInterpretacja() {
        return idInterpretacja;
    }

    public void setIdInterpretacja(int idInterpretacja) {
        this.idInterpretacja = idInterpretacja;
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

        InterpretacjaEntity that = (InterpretacjaEntity) o;

        if (idInterpretacja != that.idInterpretacja) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idInterpretacja;
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
