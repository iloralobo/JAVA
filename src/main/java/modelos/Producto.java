package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

    // ATRIBUTOS
    private Integer identificador;
    private String codigo;
    private String descripcion;
    private LocalDate fechaCaducidad;
    private TipoProducto tipo;
    private Almacen almacen;

    private Double precio;


    //CONSTRUCTORES
    //VACIO
    public Producto(int i, String cd000001, String pringáIbérica, LocalDate of, TipoProducto alimentacion, Almacen almacen1){}

    //COMPLETO

    public Producto(Integer identificador, String codigo, String descripcion, LocalDate fechaCaducidad, TipoProducto tipo, Almacen almacen, Double precio) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        this.tipo = tipo;
        this.almacen = almacen;
        this.precio = precio;
    }

    //GETTERS & SETTERS
    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    //EQUALS && HASHCODE


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(identificador, producto.identificador) && Objects.equals(codigo, producto.codigo) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(fechaCaducidad, producto.fechaCaducidad) && tipo == producto.tipo && Objects.equals(almacen, producto.almacen) && Objects.equals(precio, producto.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigo, descripcion, fechaCaducidad, tipo, almacen, precio);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Producto -> " + identificador +
                ", " + codigo +
                ", " + descripcion +
                ", " + fechaCaducidad + ", " + tipo +
                ", " + almacen.getNombre() +
                ", " + precio;
    }
}

