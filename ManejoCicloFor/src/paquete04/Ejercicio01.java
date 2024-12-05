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
       
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        String cadena = "";
        
        for (int i = 30; i <= 10; i--) {
            suma1 = i + 30;
            suma2 = suma1 + 30;
            suma3 = suma2 + 30;
            cadena = String.format("%s-%d-%d-%d-%d", cadena, i, suma1, suma2, suma3);
        }
        System.out.printf("%s",cadena);
    }
            
            
}
