package modelos;

import ProyectoJava4_Herencias.Persona;

import java.util.Objects;

public class Cliente extends Persona {

    // ATRIBUTOS
    private TipoCliente tipo;

    //CONSTRUCTORES
    //VACIO

    public Cliente (){
    }

    //COMPLETO

    public Cliente(Integer identificador, String dni, String nombre, String apellidos, String direccion, TipoCliente tipo) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return tipo == cliente.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                "tipo=" + tipo +
                '}';
    }
}
