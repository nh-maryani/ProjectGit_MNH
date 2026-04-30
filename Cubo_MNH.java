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
public class Cubo_MNH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner Scanner = new Scanner (System.in);
      for (int n = 1; n<=10; n++){
          System.out.print ("Teclee un numero: ");
          int num = Scanner.nextInt ();
          int cubo = num * num * num;
          int cuarta = cubo * num;
          System.out.println ("El cubo del numero es: "+ cubo);
          System.out.println ("La cuarta del numero es: "+ cuarta);
          
           
        
           
       }
      Scanner.close ();         
    }
    
}
