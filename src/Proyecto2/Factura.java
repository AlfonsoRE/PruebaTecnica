package Proyecto2;

/**
 *
 * @author AlfonsoRE
 */
public class Factura {

    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura() {

    }

    public double getTotalFactura() {
        double r = cantidad * precio;
        if (r >= 0) {
            return r;
        } else {
            return 0.0;
        }
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            precio = 0;
        }
        this.precio = precio;
    }

}
