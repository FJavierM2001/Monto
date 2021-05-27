/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

/**
 *
 * @author Matxing
 */
public class Monto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public String ingreso (int cantidad) {
        String sRespuesta = "Error desconocido";

            if (cantidad >= 1 && cantidad <=1000) {
                sRespuesta = "Valor introducido correcto";
            } else if (cantidad < 1) {
                sRespuesta = "Error: La cantidad introducida es menor de 1";
            } else {
                sRespuesta= "Error: La cantidad introducida es > 1000";
            }

        return sRespuesta;
    }
    
}
