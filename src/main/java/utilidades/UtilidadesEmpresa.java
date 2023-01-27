package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilidadesEmpresa {

    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato) {

        List<Empleado> listatrabajadores = new ArrayList<>();
        for (Empleado trabajador : empresa.getEmpleados()) {
            trabajador.getContrato().getTipoContrato().equals(tipoContrato);
            listatrabajadores.add(trabajador);
        }
        return listatrabajadores;
    }

    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa) {

        List<Empleado> mileuristas = new ArrayList<>();
        for (Empleado mileurista : empresa.getEmpleados()) {
            if (mileurista.getContrato().getSalarioBase() >= 1000) {
                mileuristas.add(mileurista);
            }
        }
        mileuristas.sort(Comparator.comparing(e -> e.getContrato().getSalarioBase()));

        return mileuristas;
    }

    public double fondoSalarialEmpresa(Empresa empresa){

        Double sumaSalarios = 0.0;
        for (Empleado salario : empresa.getEmpleados()){
            sumaSalarios = salario.getContrato().getSalarioBase();
        }
        return sumaSalarios;
    }

    public Empleado getMejorPagado(List<Empresa>empresas){

        Empleado mejorPagado;
        List<Empleado> pagados = new ArrayList<>();
        for (Empresa empresa : empresas){
            for (Empleado empleado : empresa.getEmpleados()){
                pagados.add(empleado);
            }
        }
        pagados.sort(Comparator.comparing(e -> e.getContrato().getSalarioBase()));
        mejorPagado = pagados.get(0);
        return mejorPagado;
    }

}

