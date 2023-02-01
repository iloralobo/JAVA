package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;

import java.util.*;

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
            pagados.addAll(empresa.getEmpleados());
        }
        pagados.sort(Comparator.comparing(e -> e.getContrato().getSalarioBase()));
        mejorPagado = pagados.get(0);
        return mejorPagado;
    }

//    public Map<TipoContrato, List<Empleado>>
//    getEmpleadosPorTipoContrato(Empresa empresas){
//
//        Map<TipoContrato, List<Empleado>> empleadosPorContrato = new HashMap<>();
//        empleadosPorContrato.put(TipoContrato.PRACTICAS, new ArrayList<>());
//        empleadosPorContrato.put(TipoContrato.TEMPORAL, new ArrayList<>());
//        empleadosPorContrato.put(TipoContrato.OBRAYSERVICIO, new ArrayList<>());
//        empleadosPorContrato.put(TipoContrato.INDEFINIDO, new ArrayList<>());
//
//        for(Empleado empleado : empresas.getEmpleados()){
//            switch (empleado.getContrato()){
//                case PRACTICAS -> empleadosPorContrato.get(TipoContrato.PRACTICAS).add(empleado);
//
//
//            }
//        }
//
//
//
////        for(TipoContrato tipoContrato: empresas.getEmpleados()){
////
////            empleadosPorContrato.put(tipoContrato, new ArrayList<>());
////        }
////
////        for()
//
//
//        return empleadosPorContrato;
//    }


}

