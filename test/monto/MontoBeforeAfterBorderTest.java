/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matxing
 */
public class MontoBeforeAfterBorderTest {

    private Monto instance;

    public MontoBeforeAfterBorderTest() {
    }

    @Before
    public void setUp() {

        instance = new Monto();
    }

    @After
    public void tearDown() {

        instance = null;
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Monto.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIngreso() {
        System.out.println("ingreso");
        int cantidad = 0;
        //Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es menor de 1";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIngreso1() {
        System.out.println("ingreso");
        int cantidad = 1;
        //Monto instance = new Monto();
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIngreso2() {
        System.out.println("ingreso");
        int cantidad = 1000;
        //Monto instance = new Monto();
        String expResult = "Valor introducido correcto";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testIngreso3() {
        System.out.println("ingreso");
        int cantidad = 1001;
        //Monto instance = new Monto();
        String expResult = "Error: La cantidad introducida es > 1000";
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
