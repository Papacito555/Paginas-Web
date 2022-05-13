/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;

import java.awt.*;
import java.awt.event.*;
public class DemoListener6 extends Frame
{
private TextField tf;
private Label lab;
public DemoListener6()
{
super("Key Listener");
// defi no el layout principal
setLayout(new FlowLayout(FlowLayout.LEFT));
add( new Label("Ingrese Texto:"));
tf= new TextField(15);
add(tf);
lab=new Label();
add(lab);
// agrego los listeners al TextField
tf.addKeyListener(new EscuchaTecla());
tf.addActionListener(new EscuchaEnter());
setSize(350,100);
setVisible(true);
// mando el cursor al TextField
tf.requestFocus();
//addWindowListener(new EscuchaVentana());
}
class EscuchaTecla implements KeyListener
{
public void keyPressed(KeyEvent e)
{
// por cada tecla presionada tomo el caracter
char c = e.getKeyChar();
// seteo el caracter como texto del label
lab.setText(Character.toString(c));
}
public void keyReleased(KeyEvent e){}
public void keyTyped(KeyEvent e){}
}
class EscuchaEnter implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
// tomo el texto ingresado en el TextField
String texto = tf.getText();
// lo seteo como texto en el Label
lab.setText(texto);
// refresco los componentes de la ventana
validate();
// combierto a mayuscula el texto del TextField
tf.setText(texto.toUpperCase());
// lo selecciono todo
tf.selectAll();
}
}
public static void main(String[] args)
{
new DemoListener6();
}
}
