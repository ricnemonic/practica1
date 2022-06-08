/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ccuenta1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DE LEON
 */
public class CCuentaTest {
    
    public CCuentaTest() {
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
     * Test of ingresar method, of class CCuenta.
     */
    @Test
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(150);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    @Test
    public void testIngresar1() {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(-150);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    @Test
    public void testIngresar2() {
        System.out.println("ingresar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        int expResult = 2;
        int result = instance.ingresar(-3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    /**
     * Test of retirar method, of class CCuenta.
     */
   
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(50);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
