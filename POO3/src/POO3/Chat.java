/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO3;
import java.awt.*;
public class Chat extends Frame
{
private TextField tfNick;
private TextField tfMensaje;
private Button bLogin;
private Button bLogout;
private Button bEnviar;
private List lstLog;
public Chat()
{
super("Chat");
setLayout(new BorderLayout());
// panel norte
Panel pNorth = _crearPNorte();
add( pNorth, BorderLayout.NORTH);
// panel central
Panel pCenter = _crearPCenter();
add( pCenter, BorderLayout.CENTER);
// panel sur
Panel pSouth = _crearPSur();
add(pSouth, BorderLayout.SOUTH);
setSize(400,300);
setVisible(true);
}
// sigue mas abajo
// :
// viene de mas arriba
private Panel _crearPNorte()
{
Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
p.add(new Label("Nick:"));
tfNick = new TextField(10);
p.add(tfNick);
bLogin=new Button("Login");
p.add(bLogin);
bLogout = new Button("Logout");
p.add(bLogout);
return p;
}
// sigue mas abajo
// :
private Panel _crearPCenter()
{
Panel p = new Panel(new BorderLayout());
// norte
p.add(new Label("Conversacion:"), BorderLayout.NORTH);
// centro
lstLog = new List();
p.add(lstLog,BorderLayout.CENTER);
return p;
}
// sigue mas abajo
// :
// :
// viene de mas arriba
private Panel _crearPSur()
{
Panel p = new Panel(new BorderLayout());
// oeste
p.add(new Label("Mensaje:"),BorderLayout.WEST);
// centro
tfMensaje = new TextField();
p.add(tfMensaje,BorderLayout.CENTER);
// este
bEnviar = new Button("Enviar");
p.add(bEnviar,BorderLayout.EAST);
return p;
}
public static void main(String[] args)
{
Chat c = new Chat();
}
}