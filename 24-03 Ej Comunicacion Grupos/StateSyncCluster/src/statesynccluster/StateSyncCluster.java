/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statesynccluster;

/**
 *
 * @author Dell
 */
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;

public class StateSyncCluster {

    private JChannel channel;
    private int state = 0; // Estado inicial (un contador)

    public void start() throws Exception {
        // Crear el canal y unirse al grupo
        channel = new JChannel(); // Usa la configuración por defecto (UDP)
        channel.setReceiver(new ReceiverAdapter() {
            @Override
            public void receive(Message msg) {
                // Manejar mensajes recibidos
                state++;
                System.out.println("Mensaje recibido: " + msg.getObject());
                System.out.println("Estado: " + state);
            }

            @Override
            public void viewAccepted(View view) {
                // Manejar cambios en la membresía del grupo
                System.out.println("Miembros del grupo: " + view.getMembers());
            }
        });

        channel.connect("StateSyncCluster"); // Conectar al grupo
         channel.getState(null, 10000); // Opcional, para obtener estado compartido si lo hay
        Message msg=new Message(null,"contectado"); //crea mensaje
        channel.send(msg);  // envia al grupo        channel.close(); //
        System.out.println("Conectado al grupo 'StateSyncCluster'");
    }
    


    public static void main(String[] args) {
        try {
            StateSyncCluster example = new StateSyncCluster();
            example.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
