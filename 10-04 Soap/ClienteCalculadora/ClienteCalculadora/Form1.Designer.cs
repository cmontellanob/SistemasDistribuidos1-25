namespace ClienteCalculadora
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            txtA = new TextBox();
            txtB = new TextBox();
            button1 = new Button();
            panel1 = new Panel();
            lblResultado = new Label();
            cbOperacion = new ComboBox();
            panel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(37, 47);
            label1.Name = "label1";
            label1.Size = new Size(13, 15);
            label1.TabIndex = 0;
            label1.Text = "a";
            label1.Click += label1_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(216, 46);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 1;
            label2.Text = "b";
            // 
            // txtA
            // 
            txtA.Location = new Point(59, 39);
            txtA.Name = "txtA";
            txtA.Size = new Size(69, 23);
            txtA.TabIndex = 2;
            // 
            // txtB
            // 
            txtB.Location = new Point(238, 36);
            txtB.Name = "txtB";
            txtB.Size = new Size(87, 23);
            txtB.TabIndex = 3;
            // 
            // button1
            // 
            button1.Location = new Point(140, 120);
            button1.Name = "button1";
            button1.Size = new Size(61, 30);
            button1.TabIndex = 4;
            button1.Text = "Calcular";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // panel1
            // 
            panel1.Controls.Add(lblResultado);
            panel1.Location = new Point(62, 188);
            panel1.Name = "panel1";
            panel1.Size = new Size(257, 123);
            panel1.TabIndex = 6;
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Font = new Font("Segoe UI", 27.75F, FontStyle.Bold, GraphicsUnit.Point, 0);
            lblResultado.Location = new Point(40, 38);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(128, 50);
            lblResultado.TabIndex = 0;
            lblResultado.Text = "label3";
            // 
            // cbOperacion
            // 
            cbOperacion.FormattingEnabled = true;
            cbOperacion.Items.AddRange(new object[] { "Sumar", "Restar", "Multiplicar", "Dividir" });
            cbOperacion.Location = new Point(102, 79);
            cbOperacion.Name = "cbOperacion";
            cbOperacion.Size = new Size(121, 23);
            cbOperacion.TabIndex = 7;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(cbOperacion);
            Controls.Add(panel1);
            Controls.Add(button1);
            Controls.Add(txtB);
            Controls.Add(txtA);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private TextBox txtA;
        private TextBox txtB;
        private Button button1;
        private Panel panel1;
        private Label lblResultado;
        private ComboBox cbOperacion;
    }
}
