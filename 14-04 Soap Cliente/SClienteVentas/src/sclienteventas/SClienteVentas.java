/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sclienteventas;

import ventas.Producto;

/**
 *
 * @author Dell
 */
public class SClienteVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ventas.Producto p=new Producto ();
    }

    private static Producto getProducto(java.lang.String codigo) {
        ventas.WsProductos service = new ventas.WsProductos();
        ventas.WsProductosSoap port = service.getWsProductosSoap12();
        return port.getProducto(codigo);
    }
    
}
