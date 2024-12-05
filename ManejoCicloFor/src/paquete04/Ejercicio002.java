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
public class Ejercicio002 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double farenheit;
        double celcius;
        int i = 0;
        
        for (farenheit = 20; farenheit <= 100; farenheit +=4){
            celcius = (5./9.)*(farenheit-32);
            
            System.out.printf("Operacion(%d) Farenheit: %.2f ===> Celcius: %.2f\n",
                    i, farenheit, celcius);
            
            i++;
        }
   } 
}

