/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Matxing
 */
@RunWith(value = org.junit.runners.Parameterized.class)
public class MontoTest {

    
    int cantidad1;
    String respuestaExp;
    
    public MontoTest(int cantidad, String respuestaExp) {
        this.cantidad1 = cantidad;
        this.respuestaExp = respuestaExp;
    }
    

    @Parameters
    public static Iterable<Object[]> getdata() {
        List<Object[]> obj = new ArrayList<>();

        obj.add(new Object[]{500,"Valor introducido correcto"});
        obj.add(new Object[]{-100,"Error: La cantidad introducida es menor de 1"});
        obj.add(new Object[]{1500,"Error: La cantidad introducida es > 1000"});
        obj.add(new Object[]{1,"Valor introducido correcto"});
        obj.add(new Object[]{0,"Error: La cantidad introducida es menor de 1"});
        obj.add(new Object[]{1000,"Valor introducido correcto"});
        obj.add(new Object[]{1001,"Error: La cantidad introducida es > 1000"});
        
        return obj;
    }

    @Test
    public void testIngreso() {
        System.out.println("ingreso");
        int cantidad = cantidad1;
        Monto instance = new Monto();
        String expResult = respuestaExp;
        String result = instance.ingreso(cantidad);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

}
