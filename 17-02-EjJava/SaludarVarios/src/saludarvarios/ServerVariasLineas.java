/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saludarvarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class ServerVariasLineas {

    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;
        try {
            // TODO code application logic here
            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            while (true) {

                client = server.accept(); //conexion entre cliente y servidor para comunicacion bidireccional
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                System.out.println("Cliente se conecto");
                
                String nombre = fromClient.readLine();
                String primerApellido = fromClient.readLine();
                String segundoApellido = fromClient.readLine();
                
                
                System.out.println("El cliente envio el mensaje:" + nombre + primerApellido+segundoApellido);
                toClient = new PrintStream(client.getOutputStream());
                toClient.println( nombre +" "+ primerApellido+" "+segundoApellido);
            }
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
    }

}
