/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.List;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
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
     * Test of buscar method, of class ClienteDAO.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String dni = "";
        ClienteDAO instance = new ClienteDAO();
        Cliente expResult = null;
        Cliente result = instance.buscar(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ClienteDAO.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ClienteDAO instance = new ClienteDAO();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregar method, of class ClienteDAO.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Cliente cl = null;
        ClienteDAO instance = new ClienteDAO();
        int expResult = 0;
        int result = instance.agregar(cl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarId method, of class ClienteDAO.
     */
    @Test
    public void testListarId() {
        System.out.println("listarId");
        int id = 0;
        ClienteDAO instance = new ClienteDAO();
        Cliente expResult = null;
        Cliente result = instance.listarId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ClienteDAO.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Cliente em = null;
        ClienteDAO instance = new ClienteDAO();
        int expResult = 0;
        int result = instance.actualizar(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ClienteDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        ClienteDAO instance = new ClienteDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
