/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Universidad extends UnicastRemoteObject implements IUniversidad {

    public Universidad() throws RemoteException {
        super();
    }
    
    @Override
    public Diploma EmitirDiploma(String ci, String nombres, String primerApellido, String segundoApellido, String fecha_nacimiento, Carrera carrera) throws RemoteException {
        try {
            Diploma aux=null;
            Boolean emitir=false;
            String rude=nombres.substring(0, 2)+primerApellido.substring(0,2);
            
            // Llamar a SEGIP (codigo de cliente RMI)
            ISegip segip;
            
            try {
                segip = (ISegip) Naming.lookup("rmi://localhost/Segip"); // instanciar un objeto remoto
                emitir= segip.Verificar(ci, nombres, primerApellido+" "+segundoApellido);
                
                
            } catch (NotBoundException ex) {
                Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
                
                
            }
            // Finaliza la llamada al SEGIP
            
            // Llamra al seduca por TCP
            
            
            int port = 5002;
            
            Socket client;
            client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            toServer.println("verificar-"+rude);
            String result = fromServer.readLine();
            
            
            
            
            // Llamar a SERECI ( codigo de cliente TCP)
            
            return aux;
        } catch (IOException ex) {
            Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Finaliza la llamada al SEGIP
        
        // Llamra al seduca por TCP
    }
    
}
