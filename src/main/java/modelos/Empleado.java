package modelos;

import ProyectoJava4_Herencias.Persona;

import java.util.Objects;

public class Empleado extends Persona {

    private Empresa empresa;
    private Contrato contrato;

    public Empleado() {
    }

    public Empleado(Integer identificador, String dni, String nombre, String apellidos, String direccion, Empresa empresa, Contrato contrato) {
        super(identificador, dni, nombre, apellidos, direccion);
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(empresa, empleado.empresa) && Objects.equals(contrato, empleado.contrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), empresa, contrato);
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +
                "empresa=" + empresa +
                ", contrato=" + contrato +
                '}';
    }
}
