/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma1;
        int suma2;
        int suma3;
        String cadena = "";
        
        for (int i = 30; i <= 10; i--) {
            
            suma1 = i + i;
            suma2 = suma1 + i;
            suma3 = suma2 + i;
            
            cadena = String.format("hola%s-%d-%d-%d-%d\n", cadena, i, suma1, 
                    suma2, suma3);
            System.out.printf("%s",cadena);
        }
        

        // System.out.printf("%d\n", i);

    }
}

