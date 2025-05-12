namespace ClienteCalculadora
   
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            srCalculadora.wsCalculadoraSoapClient client = new srCalculadora.wsCalculadoraSoapClient(srCalculadora.wsCalculadoraSoapClient.EndpointConfiguration.wsCalculadoraSoap12);
            int a=int.Parse( txtA.Text);
            int b = int.Parse(txtB.Text);
            int resultado = 0;
            switch (cbOperacion.SelectedIndex)
            {
                case 0:
                    resultado=client.Sumar(a, b);
                    break;
                case 1:
                    resultado=client.Restar(a, b);
                    break;
                case 2:
                    resultado=client.Multiplicar(a, b);
                    break;
                case 3:
                    resultado=client.Dividir(a, b);
                    break;
            }
             lblResultado.Text = resultado.ToString();

            

        }
    }
}
