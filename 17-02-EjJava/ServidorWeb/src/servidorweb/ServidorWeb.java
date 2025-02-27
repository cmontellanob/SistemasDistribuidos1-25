/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidorweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class ServidorWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 80;  // Cambié el puerto a 8080 para evitar problemas de uso
        ServerSocket server;


        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor iniciado en el puerto " + port);

            while (true) {
                // Espera a una conexión del cliente
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente conectado");

                // Crear flujos de entrada y salida para la comunicación
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                // Leer la solicitud HTTP (aunque no la procesamos en este ejemplo)
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    if (inputLine.isEmpty()) {
                        break;  // La solicitud está terminada cuando encontramos una línea vacía
                    }
                    System.out.println(inputLine);  // Imprimir la solicitud (opcional)
                }

                // Crear la respuesta HTTP con contenido HTML
                String httpResponse = "HTTP/1.1 200 OK\r\n" +
                                      "Content-Type: text/html; charset=UTF-8\r\n" +
                                      "Content-Length: 38\r\n" + 
                                      "\r\n" + 
                                      "<!DOCTYPE html>\n" +
                                      "<html>\n" +
                                      "<head><title>Hola Mundo</title></head>\n" +
                                      "<body><h1>Hola Mundo</h1></body>\n" +
                                      "</html>\n";

                // Enviar la respuesta al cliente
                out.println(httpResponse);

                // Cerrar la conexión con el cliente
                in.close();
                out.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}



