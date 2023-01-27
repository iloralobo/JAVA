package utilidades;

import modelos.Almacen;
import modelos.Producto;
import modelos.TipoProducto;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesProducto {

    public List<Producto> getPorTipo(List<Producto> productos, TipoProducto tipo){

       List<Producto> listaProductos = new ArrayList<>();
       for (Producto productoX : productos){
           if (productoX.getTipo().equals(tipo)){
               listaProductos.add(productoX);
           }
       }
        return listaProductos;
    }

    public List<Producto> getPorAlmacen(List<Producto> productos, Almacen almacen){

        List<Producto> listaProductosAlmacen = new ArrayList<>();
        for (Producto productoA : productos){
            if (productoA.getAlmacen().equals(almacen)){
                listaProductosAlmacen.add(productoA);
            }
        }
        return listaProductosAlmacen;
    }
}
