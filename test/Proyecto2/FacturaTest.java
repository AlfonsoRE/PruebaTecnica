
package Proyecto2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlfonsoRE
 */
public class FacturaTest {
    
    public FacturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalFactura method, of class Factura.
     */
    @Test
    public void testGetTotalFactura() {
        System.out.println("getTotalFactura1");
        Factura instance = new Factura();
        double expResult = 0.0;
        double result = instance.getTotalFactura();
        assertEquals(expResult, result, 0.0);  
    }
    
    @Test
    public void testGetTotalFactura2() {
        System.out.println("getTotalFactura2");
        Factura instance = new Factura();
        instance.setCantidad(3);
        instance.setPrecio(150);
        double expResult = 450;
        double result = instance.getTotalFactura();
        assertEquals(expResult, result, 0.0);  
    }
    
    @Test
    public void testGetTotalFactura3() {
        System.out.println("getTotalFactura3");
        Factura instance = new Factura();
         instance.setCantidad(3);
        instance.setPrecio(-20);
        double expResult = 0.0;
        double result = instance.getTotalFactura();
        assertEquals(expResult, result, 0.0);  
    }
    
    @Test
    public void testGetTotalFactura4() {
        System.out.println("getTotalFactura4");
        Factura instance = new Factura();
         instance.setCantidad(20);
        instance.setPrecio(30);
        double expResult = 600;
        double result = instance.getTotalFactura();
        assertEquals(expResult, result, 0.0);  
    }
    
}
