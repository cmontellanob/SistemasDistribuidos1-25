using System.ServiceModel.Channels;
using System.ServiceModel;

namespace ClienteImpuestos

{
    
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            srCodigos.solicitudCuis solicitud = new srCodigos.solicitudCuis();
            solicitud.codigoAmbiente = 2;
            solicitud.codigoModalidad = 2;
            solicitud.codigoPuntoVenta = 0;
            solicitud.codigoSistema = "";
            solicitud.codigoSucursal = 0;
            solicitud.nit =0;


            srCodigos.ServicioFacturacionCodigosClient sf = new srCodigos.ServicioFacturacionCodigosClient(srCodigos.ServicioFacturacionCodigosClient.EndpointConfiguration.ServicioFacturacionCodigosPort);
            srCodigos.respuestaCuis respuesta;
            using (OperationContextScope scope = new OperationContextScope(sf.InnerChannel))
            {
                // Crear el header HTTP personalizado
                HttpRequestMessageProperty requestMessage = new HttpRequestMessageProperty();
                requestMessage.Headers["apiKey"] = ""; // Cambia esto por tu valor real

                OperationContext.Current.OutgoingMessageProperties[HttpRequestMessageProperty.Name] = requestMessage;

                // Ahora haces la llamada
                respuesta = sf.cuis(solicitud);

                if (respuesta.transaccion)
                {
                    MessageBox.Show("El código CUIS es: " + respuesta.codigo, "Éxito");
                }
                else
                {
                    string errores = string.Join(", ", respuesta.mensajesList.Select(m => m.descripcion));
                    MessageBox.Show(errores, "Error");
                }
            }
            
            if (respuesta.transaccion)
            {
                MessageBox.Show("El codigo cuis es " + respuesta.codigo, "Exito");
            }
            else
            {
                string todasLasDescripciones = string.Join(", ", respuesta.mensajesList.Select(m => m.descripcion));

                MessageBox.Show(todasLasDescripciones, "Error");
            }
        
                
            


                    
        }
    }
}
