package utilidades;

import com.github.javafaker.Faker;
import modelos.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenerarDatos {

    private static Faker faker = new Faker();

    public static List<Almacen> generarAlmacen(int numAlmacenes) {

        List<Almacen> almacenList = new ArrayList<>();
        for (int i = 0; i < numAlmacenes; i++) {

            Almacen almacen = new Almacen();
            almacen.setIdentificador(faker.number().numberBetween(1, 50));
            almacen.setNombre(faker.funnyName().name());
            almacen.setCapacidad(faker.number().numberBetween(2500, 50000));
            almacenList.add(almacen);
        }
        return almacenList;
    }

    public static List<Cliente> generarCliente(int numClientes) {

        List<Cliente> clienteList = new ArrayList<>();
        for (int i = 0; i < numClientes; i++) {

            Cliente cliente = new Cliente();
            cliente.setIdentificador(faker.number().numberBetween(100, 999));
            cliente.setDni(faker.idNumber().invalid());
            cliente.setNombre(faker.name().firstName());
            cliente.setApellidos(faker.name().fullName());
            cliente.setDireccion(faker.address().cityName());
            cliente.setTipo(TipoCliente.values()[faker.number().numberBetween(0, 2)]);
            clienteList.add(cliente);
        }
        return clienteList;
    }

    public static List<Contrato> generarContrato(int numContratos) {

        List<Contrato> contratoList = new ArrayList<>();
        for (int i = 0; i < numContratos; i++) {

            Contrato contrato = new Contrato();
            contrato.setIdentificador(faker.number().numberBetween(1000, 9999));
            contrato.setSalarioBase(faker.number().randomDouble(2, 500, 3880));
            contrato.setTipoContrato((TipoContrato.values()[faker.number().numberBetween(0, 4)]));
            contratoList.add(contrato);
        }
        return contratoList;
    }

//    public static List<Producto> generarProducto(int numProductos) {
//
//        List<Producto> productoList = new ArrayList<>();
//        for (int i = 0; i < numProductos; i++) {
//
//            Producto producto = new Producto();
//            producto.setIdentificador(faker.number().numberBetween(1000, 9999));
//            producto.setCodigo(faker.beer().name());
//            producto.setDescripcion(faker.chuckNorris().fact());
//            producto.setFechaCaducidad(faker.date().between(LocalDate.of(2023,1,1),(2026,1,31));
//            producto.setTipo((TipoProducto.values()[faker.number().numberBetween(0, 3)]));
//            producto.setAlmacen(generarAlmacen(1).get(0));
//            producto.setPrecio(faker.number().randomDouble(0, 1, 60));
//            productoList.add(producto);
//        }
//        return productoList;
//    }
//
//    public static List<LineaFactura> generarLineaFactura(int numLineaFactura) {
//
//        List<LineaFactura> lineaFacturaListList = new ArrayList<>();
//        for (int i = 0; i < numLineaFactura; i++) {
//
//            LineaFactura lineaFactura = new LineaFactura();
//            lineaFactura.setIdentificador(faker.number().numberBetween(1000, 9999));
//            lineaFactura.setFactura();
//            lineaFactura.setProducto(generarProducto(1).get(0));
//            lineaFactura.setCantidad(faker.number().numberBetween(1, 99));
//            lineaFacturaListList.add(lineaFactura);
//        }
//        return lineaFacturaListList;
//    }


}
