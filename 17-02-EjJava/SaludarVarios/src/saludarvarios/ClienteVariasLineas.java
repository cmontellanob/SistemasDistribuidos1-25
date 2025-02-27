/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saludarvarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ClienteVariasLineas {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // TODO code application logic here
         int port = 5002;
        try {
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            System.out.println("introduzca su nombre");
            String nombre=sc.nextLine();
            System.out.println("introduzca su primer apellido");
            String primerApellido=sc.nextLine();
            System.out.println("introduzca su primer apellido");
            String segundoApellido=sc.nextLine();
            
            toServer.println(nombre);
            toServer.println(primerApellido);
            toServer.println(segundoApellido);
            String result = fromServer.readLine();
            System.out.println("cadena devuelta por el servidor es: " + result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
