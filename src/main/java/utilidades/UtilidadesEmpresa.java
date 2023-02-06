package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.TipoContrato;
import modelos.TipoEmpresa;

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

    public Map<TipoContrato, List<Empleado>> getEmpleadosPorTipoContrato(Empresa empresas) {

        Map<TipoContrato, List<Empleado>> empleadosPorContrato = new HashMap<>();

        for (Empleado empleado : empresas.getEmpleados()){
            if (empleadosPorContrato.containsKey(empleado.getContrato().getTipoContrato())) {
                empleadosPorContrato.get(empleado.getContrato().getTipoContrato()).add(empleado);
            }else{
                empleadosPorContrato.put(empleado.getContrato().getTipoContrato(),new ArrayList<>());
                empleadosPorContrato.get(empleado.getContrato().getTipoContrato()).add(empleado);
            }
        }
        return empleadosPorContrato;
    }


    public Map<Empresa, Map<TipoContrato, List<Empleado>>> getEmpleadosPorTipoContrato (List<Empresa> empresas){

        Map<Empresa, Map<TipoContrato, List<Empleado>>> empleadosPorContrato = new HashMap<>();

        for (Empresa empresa : empresas) {
            empleadosPorContrato.put(empresa, getEmpleadosPorTipoContrato(empresa));
        }
        return empleadosPorContrato;
    }

    public List<Empleado> getEmpleadosPymePracticas(List<Empresa> empresas){

        List<Empleado> listaEmpleados = new ArrayList<>();
        for (Empresa empresa : empresas){
            if (empresa.getTipoEmpresa().equals(TipoEmpresa.PYME)){
                for (Empleado empleado : empresa.getEmpleados()){
                    if (empleado.getContrato().getTipoContrato().equals(TipoContrato.PRACTICAS)){
                        listaEmpleados.add(empleado);
                }
            }
            }
        }
        return listaEmpleados;

    }
    public Map<Empresa,Empleado> getLosMejorPagadosPorEmpresa (List<Empresa> empresas){
        Map<Empresa, Empleado> empleadoMejorPagado = new HashMap<>();
        for (Empresa empresa : empresas){
            for (Empleado empleado : empresa.getEmpleados()){
                empleadoMejorPagado.put(empresa, getMejorPagado(List.of(empresa)));
            }
        }
        return empleadoMejorPagado;
    }



}

