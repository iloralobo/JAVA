package utilidades;

import modelos.Factura;
import modelos.LineaFactura;

import java.time.LocalDate;
import java.util.List;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura){
    if (factura.getFechaVencimiento().equals(LocalDate.now()) || factura.getFechaVencimiento().isAfter(LocalDate.now())) {
        return true;
        }else{
        return false;
        }
    }

    public double calcularBaseFactura(Factura factura){

        double importeBase = 0.0;

        for (LineaFactura lineaFactura: factura.getLineaFactura()){
            double precioProducto = lineaFactura.getProducto().getPrecio();
            int cantidad = lineaFactura.getCantidad();
            importeBase += precioProducto * cantidad;
        }
            return importeBase;
    }

    public double calcularTotalAPagar(Factura factura){

        double totalAPagar = 0.0;
        totalAPagar += (calcularBaseFactura(factura)-factura.getDescuento())*factura.getIva();

        return totalAPagar;
    }

}
