/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio03 {
        public static void main(String[] args) {
        
            // Número de filas de la parte superior
        int contador = 5;

        // Imprimir la parte superior del patrón
        for (int i = 1; i <= contador; i++) {
            for (int variable = 1; variable <= i; variable++) {
                System.out.print("*");
            }
              System.out.println();
        }
        
        for (int i = contador - 1; i >= 1; i--) {
            for (int variable = 1; variable <= i; variable++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
