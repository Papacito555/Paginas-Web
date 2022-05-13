package POO3;
import java.awt.*;

public class Calculadora extends Frame
{
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private Button bDec,bMas,bMenos,bPor,bDiv,bigual,bborrar;
    private TextField tfDisplay;
     
    public Calculadora()
    {
        super();
        setLayout(new BorderLayout());
        
        //En el norte se ubica el display
        tfDisplay=new TextField();
        add(tfDisplay,BorderLayout.NORTH);
        
        //En el centro ubicamos el teclado
        Panel pTeclado =_crearTeclado();
        add(pTeclado, BorderLayout.CENTER);
        
        //este metodo dimensiona y setea el tamaño exacto
        //Necesario para contener todos los componenetes del Frame
        pack();
        setVisible(true);
        
    }
    private Panel _crearTeclado()
    {
     b0=new Button("0"); 
     b1=new Button("1");
     b2=new Button("2");
     b3=new Button("3");
     b4=new Button("4");
     b5=new Button("5");
     b6=new Button("6");
     b7=new Button("7");
     b8=new Button("8");
     b9=new Button("9");
     bDec=new Button(".");
     bMas=new Button("+");
     bMenos=new Button("-");
     bPor=new Button("*");
     bDiv=new Button("/");
     bigual=new Button("=");
   //Se instancia un Panel (container) con GridLayout de 4x4
    Panel p=new Panel (new GridLayout(4,4));
    //Agregamos los botones al panel
    //Fila 0 la ma´s arriba
    p.add(b7);
    p.add(b8);
    p.add(b9);
    p.add(bDiv);
    
    //Fila 1 (la segunda comenzando desde arriba
    p.add(b4);
    p.add(b5);
    p.add(b6);
    p.add(bPor);
    
    //Fila 2(la tercera comenzando desde arriba)
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(bMenos);
    
    //Fila 3 (la cuarta comenzando desde arriba)
    p.add(bDec);
    p.add(b0);
    p.add(bigual);
    p.add(bMas);
    
    //Retorno el panel con todos los botones agregados
    return p;
    
    }
     public static void main(String[]args)
    {
        Calculadora c=new Calculadora();
    }
}
