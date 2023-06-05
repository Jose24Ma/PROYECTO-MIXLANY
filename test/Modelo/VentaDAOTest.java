/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MI
 */
public class VentaDAOTest {
    
    public VentaDAOTest() {
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
     * Test of GenerarSerie method, of class VentaDAO.
     */
    @Test
    public void testGenerarSerie() {
        System.out.println("GenerarSerie");
        VentaDAO instance = new VentaDAO();
        String expResult = "";
        String result = instance.GenerarSerie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IdVentas method, of class VentaDAO.
     */
    @Test
    public void testIdVentas() {
        System.out.println("IdVentas");
        VentaDAO instance = new VentaDAO();
        String expResult = "";
        String result = instance.IdVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarVenta method, of class VentaDAO.
     */
    @Test
    public void testGuardarVenta() {
        System.out.println("guardarVenta");
        Venta ve = null;
        VentaDAO instance = new VentaDAO();
        int expResult = 0;
        int result = instance.guardarVenta(ve);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarDetalleventas method, of class VentaDAO.
     */
    @Test
    public void testGuardarDetalleventas() {
        System.out.println("guardarDetalleventas");
        Venta venta = null;
        VentaDAO instance = new VentaDAO();
        int expResult = 0;
        int result = instance.guardarDetalleventas(venta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
