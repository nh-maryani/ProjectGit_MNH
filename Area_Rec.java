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
public class Area_Rec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
         for (int n = 1; n<=10; n++){
             System.out.print ("Teclee la base: ");
             int base = Scanner.nextInt ();
             System.out.print ("Teclee la altura: ");
             int altura = Scanner.nextInt();
             int arear = base * altura;
             System.out.println ("El area del rectangulo es: " + arear);
         }
       Scanner.close ();  
    }
    
}
