import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
	JPanel VentanaPrincipal;
	JScrollPane scroll;


	public JTextArea Mensaje;
	public JLabel hola, foto;
	public JButton Inicio;
	public Font Titulo = new Font("Bahnschrift",3,60);
	public Font Contenido = new Font("Bahnschrift",1,14);

	public Principal(){

		//Ventana
	  	setTitle("Centro de enseñanza tecnica e industrial");
	  	setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Imagen de miniatura
	  	setIconImage(new ImageIcon(getClass().getResource("Imagenes/logo.png")).getImage());

		//Color de fondo de la portada
		VentanaPrincipal = new JPanel();
		VentanaPrincipal.setLayout(null);
		VentanaPrincipal.setBackground(new Color(180,180,255));
		scroll = new JScrollPane(VentanaPrincipal);
		scroll.getVerticalScrollBar().setUnitIncrement(10);
		add(scroll);
		//////////////////////////////////////////////////////////////////////////////////////////////////////


		//Contenido Ventana
		hola = new JLabel();
		hola.setBounds(250,10,500,60);
		hola.setFont(Titulo);
		hola.setText("Saludos");
		hola.setForeground(Color.BLACK);
		VentanaPrincipal.add(hola);

		//Imagen de portada
	  	ImageIcon imagen = new ImageIcon("Imagenes/asma.png");
	  	foto = new JLabel(imagen);
	  	foto.setBounds(250,50,220,220);
	  	Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_DEFAULT));
	  	foto.setIcon(icono);
	  	VentanaPrincipal.add(foto);
	  	
		Mensaje = new JTextArea("El siguiente test es realizado para realizar una deteccion de sintomas del Asma y asi puntuarlas \npara verificar si es recomendable ir con un medico especializado y realizarse examenes que el\nmedico especializado especifique.");
		Mensaje.setBounds(50,350,650,100);
		Mensaje.setFont(Contenido);
		Mensaje.setForeground(Color.BLACK);
		Mensaje.setEditable(false);
		Mensaje.setBackground(new Color(180,180,255));
		VentanaPrincipal.add(Mensaje);

	    Inicio = new JButton("Empezar");
	  	Inicio.setForeground(Color.BLACK);
	  	Inicio.setBounds(350,500,100,25);
	  	Inicio.setBackground(new Color(255,255,80));
	  	Inicio.setFont(Contenido);
	  	VentanaPrincipal.add(Inicio);

	  	Inicio.addActionListener(this);

	}

	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == Inicio){
			Proyecto ventanaP = new Proyecto();
		    ventanaP.setBounds(200,50,600,1200);
		    ventanaP.setVisible(true);
		    ventanaP.setResizable(false);
		    this.setVisible(false);
		}
	}

	public static void main(String[] args) {
  	Principal ingreso = new Principal();
  	ingreso.setBounds(500,200,800,600);
  	ingreso.setVisible(true);
  	ingreso.setResizable(false);
  	ingreso.setLocationRelativeTo(null);
  }//fin del main
}