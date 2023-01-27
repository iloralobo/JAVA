import modelos.*;
import utilidades.GenerarDatos;

import java.time.LocalDate;
import java.util.List;

public class PruebaV1 {

    public static void main(String[] args) {

        //CREACION DE OBJETOS
        Almacen almacen1 = new Almacen(41015, "Almacén Extremeño", 500000);
        Producto producto1 = new Producto( 1, "CD000001", "Pringá Ibérica", LocalDate.of(2024,1,13), TipoProducto.ALIMENTACION, almacen1);
        Cliente cliente1 = new Cliente(1123123, "77235499J", "Juan Ramón", "Baeza Borrego", "C/ Montaña 22 BJ C", TipoCliente.PARTICULAR);

//        System.out.println(almacen1 + "\n" + cliente1 + "\n" + producto1);

        List<Cliente> clienteList = GenerarDatos.generarCliente(20);

        clienteList.forEach(System.out::println);
    }
}
