package modelos;

import java.util.Objects;

public class Almacen {

    // ATRIBUTOS
    private Integer identificador;
    private String nombre;
    private Integer capacidad;

    //CONSTRUCTORES
    //VACIO
    public Almacen(){}

    //COMPLETO
    public Almacen(Integer identificador, String nombre, Integer capacidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    //GETTERS & SETTERS
    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    //EQUALS && HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen almacen = (Almacen) o;
        return Objects.equals(identificador, almacen.identificador) && Objects.equals(nombre, almacen.nombre) && Objects.equals(capacidad, almacen.capacidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, nombre, capacidad);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Almacen-> " + identificador +
                ", " + nombre +
                ", " + capacidad;
    }
}
