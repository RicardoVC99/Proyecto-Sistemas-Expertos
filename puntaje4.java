import javax.swing.*;
import java.awt.*;

public class puntaje4 extends JFrame{
  public JLabel mensaje1,mensaje2,mensaje3;
  public JTextArea ResComp;
  public int valor=0;
  JPanel miPanel;
  JScrollPane scroll;

  public Font fuente4 = new Font("Bahnschrift Light",1,14);

  public puntaje4(){
    //setLayout(null);
    setTitle("Resultado");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("Imagenes/logo.png")).getImage());

    miPanel = new JPanel();
    miPanel.setLayout(null);
    miPanel.setBackground(new Color(1, 205, 123));

    scroll = new JScrollPane(miPanel);
    miPanel.setPreferredSize(new Dimension(540,680));
    scroll.getVerticalScrollBar().setUnitIncrement(16);
    add(scroll);

    Proyecto ventanaPrincipal = new Proyecto();
    valor = ventanaPrincipal.puntaje;

    mensaje1 = new JLabel("El puntaje que usted obtuvo fue de ");
    mensaje1.setBounds(5,0,260,20);
    mensaje1.setFont(fuente4);
    mensaje1.setForeground(new Color(225, 238, 88));
    miPanel.add(mensaje1);

    mensaje2 =new JLabel("");
    mensaje2.setBounds(260,0,20,20);
    mensaje2.setFont(fuente4);
    mensaje2.setForeground(new Color(225, 238, 88));
    mensaje2.setText(String.valueOf(valor));
    miPanel.add(mensaje2);

    mensaje3 = new JLabel(" puntos de un total de 44 puntos.");
    mensaje3.setBounds(280,0,250,20);
    mensaje3.setFont(fuente4);
    mensaje3.setForeground(new Color(225, 238, 88));
    miPanel.add(mensaje3);

    ResComp = new JTextArea();
    ResComp.setBounds(5,30,610,650);
    ResComp.setEditable(false);
    ResComp.setFont(fuente4);
    ResComp.setBackground(new Color(1, 205, 123));
    ResComp.setForeground(Color.BLACK);
    ResComp.setText("Tener una puntuaci�n entre 4 y 22 puntos en el test abarca probabilidades entre el\n9% al 50% de que usted padesca de asma o asma estacional, el cual solo se\npresenta en ciertos periodos del a�o bajo ciertas condici�nes dependiendo de las\npersonas. Es posible que usted haya seleccionado que tiene los principales\ns�ntomas del asma, como pueden ser opresi�n en el pecho, dificultad para respirar,\nm�sculos tensos cerca de las v�as respiratorias y tener mucha tos. Es importante\nque usted asista con personal m�dico para realizar la prueba de asma para saber\ncon exactitud si usted padece o no algunos de estos t�pos de asma.\nLas personas con asma estacional tienen que tomar los m�smos medicamentos que las\npersonas que tienen el asma com�n aunque solo se llegue a presentar en un periodo\ndel a�o, ya que puede darse el caso de que los detonantes de ese periodo se\npresenten en un periodocompletamente distinto al habitual.\nEs posible tambi�n que usted pueda ser de las personas que solo necesitan pocos\ndetonantes del asma para presentar un ataque del mismo, ya que no todas las\npersonas lo presentan igual.\n\nSi usted resulta tener asma, se le recetar�n medicamentos que pueden ayudarle a\nprevenir ataques de asma, as� como medicamentos para reducir la gravedad de los\n s�ntomas durante un ataque de asma.\n\nSu m�dico le ayudar� a dise�ar un plan de acci�n para realizar durante un ataque de\nasma, dicho plan le ayuda a usted para saber c�mo reaccionar de manera segura\ny adecuada durante dichos ataques, adem�s le indicar� m�s recomendaci�nes\nsobre que hacer para prevenir dichos ataques de asma. Es aconsejable que\nidentifique los detonantes que le provoquen los ataques de asma para tener un\ncontacto m�nimo con ellos.\n\nSe le recomienda tambi�n que mantenga siempre limpio su casa y lugar de trabajo ya\nque una de las causas que provocan los ataques de asma son el polvo y los acaros.\n\nLas personas que padecen de asma tienen que vacunarse contra la influenza una vez\n al a�o, ya que son m�s propensas a contraer esta enfermedad por los s�ntomas que\nya padecen y porque con el asma, esta combinaci�n de enfermedades puede ser muy\ngrave.");
    miPanel.add(ResComp);
  }

  public static void main(String args[]){
    puntaje4 ventana4 = new puntaje4();
    ventana4.setBounds(300,250,650,400);
    ventana4.setVisible(true);
    ventana4.setResizable(false);
  }
}