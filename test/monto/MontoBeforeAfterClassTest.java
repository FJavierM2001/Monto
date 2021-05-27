/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matxing
 */
public class MontoBeforeAfterClassTest {
    
    private static Monto instance;
    
    public MontoBeforeAfterClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
         instance = new Monto();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        instance = null;
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Monto.main(args);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIngreso() {
        System.out.println("ingreso 1");
        int cantidad = 500;
        //Monto instance = new Monto();
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIngreso1() {
        System.out.println("ingreso 2");
        int cantidad = -100;
        //Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es menor de 1";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testIngreso2() {
        System.out.println("ingreso 3");
        int cantidad = 1500;
        //Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es > 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
