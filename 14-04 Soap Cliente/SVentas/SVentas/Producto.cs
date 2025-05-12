using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace SVentas
{
    public class Producto
    {
        public String codigo;
        public String nombre;
        public String descripcion;
        public Double precio;
        public Producto() { }
        public Producto(string codigo, string nombre, string descripcion, Double precio )
        {
            this.codigo = codigo;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }


    }
}