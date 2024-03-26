import jdk.internal.icu.impl.BMPSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites; // conjunto de satelites
    private TipoCuerpoCeleste tipoCuerpo;





    public enum TipoCuerpoCeleste{
        ESTRELLA,
        PLANETA,
        PLANETA_ENANO,
        LUNA,
        COMETA,
        ASTEROIDE
    }

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>(); // inicializa el conjunto de satélites como un HashSet vacío

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }


    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(TipoCuerpoCeleste tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return new HashSet<>(satelites); // devuelve la copia del conjunto de satelites
    }

    public void setSatelites(Set<CuerpoCeleste> satelites) {
        this.satelites = satelites;
    }


    public boolean addSatelite (CuerpoCeleste satelite){
        if (satelites.contains(satelite)){ // comprobar si satelite contiene satelite
            return false; // no se añade

        } else {
            satelites.add(satelite);
            return true; // se añadio con exito
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) obj;
        return Objects.equals(nombre, that.nombre) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipoCuerpo, 31); // El número 31 es simplemente un número primo arbitrario que se usa comúnmente en la generación del hash
    }


    @Override
    public String toString() {
        return nombre +  ": " + tipoCuerpo + ", " + periodoOrbital;
    }
}
