package model;

import javax.persistence.*;

@Entity
@Table(name = "kod_pocztowy", schema = "bluebook", catalog = "")
public class KodPocztowyEntity {
    private int idKodPocztowy;
    private String kod;
    private String wojewodztwo;
    private String miasto;
    private String powiat;

    @Id
    @Column(name = "id_kod_pocztowy")
    public int getIdKodPocztowy() {
        return idKodPocztowy;
    }

    public void setIdKodPocztowy(int idKodPocztowy) {
        this.idKodPocztowy = idKodPocztowy;
    }

    @Basic
    @Column(name = "kod")
    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Basic
    @Column(name = "wojewodztwo")
    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    @Basic
    @Column(name = "miasto")
    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    @Basic
    @Column(name = "powiat")
    public String getPowiat() {
        return powiat;
    }

    public void setPowiat(String powiat) {
        this.powiat = powiat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KodPocztowyEntity that = (KodPocztowyEntity) o;

        if (idKodPocztowy != that.idKodPocztowy) return false;
        if (kod != null ? !kod.equals(that.kod) : that.kod != null) return false;
        if (wojewodztwo != null ? !wojewodztwo.equals(that.wojewodztwo) : that.wojewodztwo != null) return false;
        if (miasto != null ? !miasto.equals(that.miasto) : that.miasto != null) return false;
        if (powiat != null ? !powiat.equals(that.powiat) : that.powiat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idKodPocztowy;
        result = 31 * result + (kod != null ? kod.hashCode() : 0);
        result = 31 * result + (wojewodztwo != null ? wojewodztwo.hashCode() : 0);
        result = 31 * result + (miasto != null ? miasto.hashCode() : 0);
        result = 31 * result + (powiat != null ? powiat.hashCode() : 0);
        return result;
    }
}
