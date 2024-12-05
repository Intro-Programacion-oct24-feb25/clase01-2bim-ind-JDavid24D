/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
       
        int suma1;
        int suma2;
        int suma3;
        String cadena = "";
        
        for (int i = 30; i >= 10; i--) {
            
            suma1 = i + i;
            suma2 = suma1 + i;
            suma3 = suma2 + i;
            
            cadena = String.format("%s%d-%d-%d-%d\n", cadena, i, suma1, suma2, suma3);
        }
        System.out.printf("%s",cadena);
    }
            
            
}
