package POO3;
import java.awt.*;
public class Ventana1 extends Frame
{
    //define tres objetos button
    private Button b1, b2, b3;
    
    public Ventana1()
    {
        //el constructor del padre recibe el titulo e la ventana
        super("Esta es la Ventana1");
        //define el Layout que va a tener la ventana:FlowLayou
        setLayout(new FlowLayout());
        //Instancio el primer boton y lo agrego al container
        b1=new Button("Boton1");
        add(b1);
        //Instancio el primer boton y lo agrego al container
        b2=new Button("Boton2");
        add(b2);
        //Instancio el primer boton y lo agrego al container
        b3=new Button("Boton3");
        add(b3);
        //Se define el tamaño de la ventana a la vez tambien la hacemos visible
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana1 v1=new Ventana1();
    }
    
}
