/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author byron
 */
public class picoPlacaTest {
    
    public picoPlacaTest() {
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
     * Test of getFechaHora method, of class picoPlaca.
     */
    @Test
    public void testGetFechaHora() {
        System.out.println("getFechaHora");
        picoPlaca instance = null;
        Date expResult = null;
        Date result = instance.getFechaHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaHora method, of class picoPlaca.
     */
    @Test
    public void testSetFechaHora() {
        System.out.println("setFechaHora");
        Date fechaHora = null;
        picoPlaca instance = null;
        instance.setFechaHora(fechaHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicencia method, of class picoPlaca.
     */
    @Test
    public void testGetLicencia() {
        System.out.println("getLicencia");
        picoPlaca instance = null;
        String expResult = "";
        String result = instance.getLicencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicencia method, of class picoPlaca.
     */
    @Test
    public void testSetLicencia() {
        System.out.println("setLicencia");
        String licencia = "";
        picoPlaca instance = null;
        instance.setLicencia(licencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverDiaSemana method, of class picoPlaca.
     */
    @Test
    public void testDevolverDiaSemana() {
        System.out.println("devolverDiaSemana");
        picoPlaca instance = null;
        int expResult = 0;
        int result = instance.devolverDiaSemana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ultimoDigito method, of class picoPlaca.
     */
    @Test
    public void testUltimoDigito() {
        System.out.println("ultimoDigito");
        picoPlaca instance = null;
        char expResult = ' ';
        char result = instance.ultimoDigito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarPicoyPlaca method, of class picoPlaca.
     */
    @Test
    public void testValidarPicoyPlaca() {
        System.out.println("validarPicoyPlaca");
        picoPlaca a = null;
        picoPlaca instance = null;
        instance.validarPicoyPlaca(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverHora method, of class picoPlaca.
     */
    @Test
    public void testDevolverHora() {
        System.out.println("devolverHora");
        picoPlaca instance = null;
        int expResult = 0;
        int result = instance.devolverHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devolverMinuto method, of class picoPlaca.
     */
    @Test
    public void testDevolverMinuto() {
        System.out.println("devolverMinuto");
        picoPlaca instance = null;
        int expResult = 0;
        int result = instance.devolverMinuto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
