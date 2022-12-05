import javax.swing.*;
import java.awt.*;

public class puntaje40 extends JFrame{
  public JLabel mensaje1,mensaje2,mensaje3;
  public JTextArea ResComp;
  public int valor=0;
  JPanel miPanel;
  JScrollPane scroll;

  public Font fuente4 = new Font("Bahnschrift Light",1,14);

  public puntaje40(){
    //setLayout(null);
    setTitle("Resultado");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/logo.png")).getImage());

    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(231, 167, 12));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(540,500));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    Proyecto ventanaPrincipal = new Proyecto();
    valor = ventanaPrincipal.puntaje;

    mensaje1 = new JLabel("El puntaje que usted obtuvo fue de ");
    mensaje1.setBounds(5,0,260,20);
    mensaje1.setFont(fuente4);
    mensaje1.setForeground(new Color(219, 3, 17));
    miPanel.add(mensaje1);

    mensaje2 =new JLabel("");
    mensaje2.setBounds(260,0,20,20);
    mensaje2.setFont(fuente4);
    mensaje2.setForeground(new Color(219, 3, 17));
    mensaje2.setText(String.valueOf(valor));
    miPanel.add(mensaje2);

    mensaje3 = new JLabel(" puntos de un total de 44 puntos.");
    mensaje3.setBounds(280,0,250,20);
    mensaje3.setFont(fuente4);
    mensaje3.setForeground(new Color(219, 3, 17));
    miPanel.add(mensaje3);

    ResComp = new JTextArea();
    ResComp.setBounds(5,30,610,500);
    ResComp.setEditable(false);
    ResComp.setFont(fuente4);
    ResComp.setBackground(new Color(231, 167, 12));
    ResComp.setForeground(Color.BLACK);
    ResComp.setText("Tener una puntuaci�n de 40 puntos o m�s en el test, es considerado como que usted\npadece de asma, ya que muchos de los detonantes y s�ntomas que se presentan\nson focos rojos que normalmente se detectan en las personas que padecen de asma,\ncomo pueden ser las dificultades para respirar, opresi�n en el pecho, falta de aire,\nm�sculos tensos en �reas cercanas a las v�as resp�ratorias y tener mucha tos.\nSe le aconseja que acuda con personal m�dico para comprobar los resultaddos del\ntest, y si es as�, se le recetar�n medicamentos que pueden ayudarle a prevenir\n ataques de asma, as� como medicamentos para reducir la gravedad de los s�ntomas\ndurante un ataque de asma.\n\nSu m�dico le ayudar� a dise�ar un plan de acci�n para realizar durante un ataque de\nasma, dicho plan le ayuda a usted para saber c�mo reaccionar de manera segura\ny adecuada durante dichos ataques, adem�s le indicar� m�s recomendaci�nes\nsobre que hacer para prevenir dichos ataques de asma. Es aconsejable que\n identifique los detonantes que le provoquen los ataques de asma para tener un\ncontacto m�nimo con ellos.\n\nSe le recomienda tambi�n que mantenga siempre limpio su casa y lugar de trabajo ya\nque una de las causas que provocan los ataques de asma son el polvo y los acaros.\n\nLas personas que padecen de asma tienen que vacunarse contra la influenza una vez\n al a�o, ya que son m�s propensas a contraer esta enfermedad por los s�ntomas que\nya padecen y porque con el asma, esta combinaci�n de enfermedades puede ser muy\ngrave.");
    miPanel.add(ResComp);
  }

  public static void main(String args[]){
    puntaje40 ventana40 = new puntaje40();
    ventana40.setBounds(300,250,650,400);
    ventana40.setVisible(true);
    ventana40.setResizable(false);
  }
}