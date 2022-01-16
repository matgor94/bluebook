package model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "osoba", schema = "bluebook", catalog = "")
public class OsobaEntity {
    private int idOsoba;
    private int idKodPocztowy;
    private int idRola;
    private int idUprawnienia;
    private String pesel;
    private String nazwisko;
    private String imie;
    private String ulica;
    private String nrDomu;
    private String nrMieszkania;
    private String email;
    private String haslo;
    private Date dataRejestracji;
    private String sumaKontrolna;

    @Id
    @Column(name = "id_osoba")
    public int getIdOsoba() {
        return idOsoba;
    }

    public void setIdOsoba(int idOsoba) {
        this.idOsoba = idOsoba;
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
    @Column(name = "id_rola")
    public int getIdRola() {
        return idRola;
    }

    public void setIdRola(int idRola) {
        this.idRola = idRola;
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
    @Column(name = "PESEL")
    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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
    @Column(name = "haslo")
    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Basic
    @Column(name = "data_rejestracji")
    public Date getDataRejestracji() {
        return dataRejestracji;
    }

    public void setDataRejestracji(Date dataRejestracji) {
        this.dataRejestracji = dataRejestracji;
    }

    @Basic
    @Column(name = "suma_kontrolna")
    public String getSumaKontrolna() {
        return sumaKontrolna;
    }

    public void setSumaKontrolna(String sumaKontrolna) {
        this.sumaKontrolna = sumaKontrolna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OsobaEntity that = (OsobaEntity) o;

        if (idOsoba != that.idOsoba) return false;
        if (idKodPocztowy != that.idKodPocztowy) return false;
        if (idRola != that.idRola) return false;
        if (idUprawnienia != that.idUprawnienia) return false;
        if (pesel != null ? !pesel.equals(that.pesel) : that.pesel != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (ulica != null ? !ulica.equals(that.ulica) : that.ulica != null) return false;
        if (nrDomu != null ? !nrDomu.equals(that.nrDomu) : that.nrDomu != null) return false;
        if (nrMieszkania != null ? !nrMieszkania.equals(that.nrMieszkania) : that.nrMieszkania != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (haslo != null ? !haslo.equals(that.haslo) : that.haslo != null) return false;
        if (dataRejestracji != null ? !dataRejestracji.equals(that.dataRejestracji) : that.dataRejestracji != null)
            return false;
        if (sumaKontrolna != null ? !sumaKontrolna.equals(that.sumaKontrolna) : that.sumaKontrolna != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOsoba;
        result = 31 * result + idKodPocztowy;
        result = 31 * result + idRola;
        result = 31 * result + idUprawnienia;
        result = 31 * result + (pesel != null ? pesel.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (nrDomu != null ? nrDomu.hashCode() : 0);
        result = 31 * result + (nrMieszkania != null ? nrMieszkania.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (haslo != null ? haslo.hashCode() : 0);
        result = 31 * result + (dataRejestracji != null ? dataRejestracji.hashCode() : 0);
        result = 31 * result + (sumaKontrolna != null ? sumaKontrolna.hashCode() : 0);
        return result;
    }
}
