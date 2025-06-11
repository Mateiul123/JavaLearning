package Iunie2024_1;

import java.util.*;
import java.util.stream.Collectors;

public class Carte {
    private String titlu;
    private String autor;
    private String editura;
    private int nrExemplare;
    private double pret;

    // Constructor
    public Carte(String titlu, String autor, String editura, int nrExemplare, double pret) {
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.nrExemplare = nrExemplare;
        this.pret = pret;
    }

    // Getters
    public String getTitlu() { return titlu; }
    public String getAutor() { return autor; }
    public String getEditura() { return editura; }
    public int getNrExemplare() { return nrExemplare; }
    public double getPret() { return pret; }

    // Setters
    public void setTitlu(String titlu) { this.titlu = titlu; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setEditura(String editura) { this.editura = editura; }
    public void setNrExemplare(int nrExemplare) { this.nrExemplare = nrExemplare; }
    public void setPret(double pret) { this.pret = pret; }

    // toString
    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", editura='" + editura + '\'' +
                ", nrExemplare=" + nrExemplare +
                ", pret=" + pret +
                '}';
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte)) return false;
        Carte carte = (Carte) o;
        return Objects.equals(titlu, carte.titlu) &&
                Objects.equals(autor, carte.autor) &&
                Objects.equals(editura, carte.editura);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(titlu, autor, editura);
    }
}

