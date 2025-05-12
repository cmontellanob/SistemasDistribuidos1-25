/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientecalculadora;

/**
 *
 * @author Dell
 */
public class ClienteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("El resultado de la suma es"+sumar(4,5));
    }

    private static int sumar(int a, int b) {
        calculadora.WsCalculadora service = new calculadora.WsCalculadora();
        calculadora.WsCalculadoraSoap port = service.getWsCalculadoraSoap12();
        return port.sumar(a, b);
    }
    
}
