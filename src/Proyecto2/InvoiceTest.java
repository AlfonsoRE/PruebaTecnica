package Proyecto2;

/**
 *
 * @author AlfonsoRE
 */

//TAMBIEN REALICE LA CLASE DE PRUEBA CON JUNIT EN LA CARPETA DE TEST
public class InvoiceTest {

    public static void main(String[] args) {
        System.out.println("getTotalFactura1");
        Factura instance1 = new Factura();
        double result = instance1.getTotalFactura();
        System.out.println(result + "");

        System.out.println("getTotalFactura2");
        Factura instance2 = new Factura();
        instance2.setCantidad(3);
        instance2.setPrecio(150);
        result = instance2.getTotalFactura();
        System.out.println(result + "");

        System.out.println("getTotalFactura3");
        Factura instance3 = new Factura();
        instance3.setCantidad(3);
        instance3.setPrecio(-20);
        result = instance3.getTotalFactura();
        System.out.println(result + "");

        System.out.println("getTotalFactura4");
        Factura instance4 = new Factura();
        instance4.setCantidad(20);
        instance4.setPrecio(30);
        result = instance4.getTotalFactura();
        System.out.println(result + "");
    }

}
