/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclicas_mnh;

import java.util.Scanner;

/**
 *
 * @author Pomuch20
 */
public class Edad_MNH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
         for (int n = 1; n<=5; n++){
             System.out.print ("Teclee el año actual: ");
             int añoa = Scanner.nextInt ();
              System.out.print ("Teclee el año de nacimiento: ");
             int añon = Scanner.nextInt ();
             int edadp = añoa - añon;
             System.out.println ("La edad de la persona es: "+ edadp);
         }
         Scanner.close();
    }
    
}
