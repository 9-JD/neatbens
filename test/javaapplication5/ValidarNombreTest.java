/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


 
public class ValidarNombreTest {
    /**
    public ValidarNombreTest() {
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

   
     * Test of tieneLongitudCorrecta method, of class ValidarNombre.
     */
    @Test
    public void testTieneLongitudCorrecta() {
        System.out.println("tieneLongitudCorrecta");
        String nombreCompleto = "";
        boolean expResult = false;
        boolean result = ValidarNombre.tieneLongitudCorrecta(nombreCompleto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tieneComaAlFinal method, of class ValidarNombre.
     */
    @Test
    public void testTieneComaAlFinal() {
        System.out.println("tieneComaAlFinal");
        String segundoApellido = "";
        boolean expResult = false;
        boolean result = ValidarNombre.tieneComaAlFinal(segundoApellido);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of tieneSoloPrimeraLetraMayuscula method, of class ValidarNombre.
     */
    @Test
    public void testTieneSoloPrimeraLetraMayuscula() {
        System.out.println("tieneSoloPrimeraLetraMayuscula");
        String palabra = "";
        boolean expResult = false;
        boolean result = ValidarNombre.tieneSoloPrimeraLetraMayuscula(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of existePalabraEnVector method, of class ValidarNombre.
     */
    @Test
    public void testExistePalabraEnVector() {
        System.out.println("existePalabraEnVector");
        String palabra = "";
        String[] vector = null;
        boolean expResult = false;
        boolean result = ValidarNombre.existePalabraEnVector(palabra, vector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validarNombre method, of class ValidarNombre.
     */
    @Test
    public void testValidarNombre() {
        System.out.println("validarNombre");
        String nombreCompleto = "";
        boolean expResult = false;
        boolean result = ValidarNombre.validarNombre(nombreCompleto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ValidarNombre.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ValidarNombre.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   */ 
}
