package model;

import javax.persistence.*;

@Entity
@Table(name = "obserwator", schema = "bluebook", catalog = "")
public class ObserwatorEntity {
    private int idObserwator;
    private int idKodPocztowy;
    private String nazwisko;
    private String imie;
    private String ulica;
    private String nrDomu;
    private String nrMieszkania;
    private String email;
    private String telefon;
    private String opis;

    @Id
    @Column(name = "id_obserwator")
    public int getIdObserwator() {
        return idObserwator;
    }

    public void setIdObserwator(int idObserwator) {
        this.idObserwator = idObserwator;
    }

    @Basic
    @Column(name = "id_kod_pocztowy")
    public int getIdKodPocztowy() {
        return idKodPocztowy;
    }

    public void setIdKodPocztowy(int idKodPocztowy) {
        this.idKodPocztowy = idKodPocztowy;
    }

    @Basic
    @Column(name = "nazwisko")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "imie")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "ulica")
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Basic
    @Column(name = "nr_domu")
    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    @Basic
    @Column(name = "nr_mieszkania")
    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telefon")
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
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

        ObserwatorEntity that = (ObserwatorEntity) o;

        if (idObserwator != that.idObserwator) return false;
        if (idKodPocztowy != that.idKodPocztowy) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (ulica != null ? !ulica.equals(that.ulica) : that.ulica != null) return false;
        if (nrDomu != null ? !nrDomu.equals(that.nrDomu) : that.nrDomu != null) return false;
        if (nrMieszkania != null ? !nrMieszkania.equals(that.nrMieszkania) : that.nrMieszkania != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (telefon != null ? !telefon.equals(that.telefon) : that.telefon != null) return false;
        if (opis != null ? !opis.equals(that.opis) : that.opis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idObserwator;
        result = 31 * result + idKodPocztowy;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (nrDomu != null ? nrDomu.hashCode() : 0);
        result = 31 * result + (nrMieszkania != null ? nrMieszkania.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (telefon != null ? telefon.hashCode() : 0);
        result = 31 * result + (opis != null ? opis.hashCode() : 0);
        return result;
    }
}
