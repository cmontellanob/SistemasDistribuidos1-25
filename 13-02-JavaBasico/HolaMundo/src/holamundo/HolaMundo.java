/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Scanner sc=new Scanner(System.in);
        System.out.print("introduzca un numero ");
        int numero=sc.nextInt();
        System.out.print("introduzca otro numero ");
        int numero2=sc.nextInt();
        
        int c=numero+numero2;
        System.out.print("la suma es: "+c);
        
        
        
        
    }
    
}
