/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author Propietario
 */

public class data {
    private Object panel;
    
   public data(){
        
    }
      
       String nom2="";
       double alt2=0;
       double pes2=0;
       double imc1;
       double imc2;
       double imc3;
       public void capturarDatos(){
        
           nom2=salud.nom1.getText();
           alt2=Double.parseDouble(salud.alt1.getText());
           //LA LINEA DE ARRIBA SIRVE PARA CONVERTIR LOS STRING A DECIMALES
           pes2=Double.parseDouble(salud.pes1.getText());
       imc1=alt2*alt2;
       imc2=pes2/imc1;
      
      
       }
       
       
       
           public void imprimirDatos(){
          
       
            JOptionPane.showMessageDialog(null,"Nombre: "+nom2+"\nAltura(m): "+alt2+"\nPeso(Kg): "+pes2+"\nEl IMC es de: "+imc2,"Paciente:", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/proyecto/icon175x175.jpeg"));
            
             if(imc2<18){
                   JOptionPane.showMessageDialog (null,"Peso bajo. Necesario valorar signos de desnutrición\nDIETA:•Desayuno:\n" +
"\n" +
"    1 pieza de mango con 1 taza de yogurt y 3 cucharadas de granola\n" +
"    1 tortilla de maíz\n" +
"    1 huevo ranchero acompañado de media taza de salsa de tomate\n" +
"    1 taza de porotos salteados y una pieza de pan dulce\n" +
"\n" +
"•A media mañana:\n" +
"\n" +
"    1 taza de helado de chocolate\n" +
"    1barra de de granola\n" +
"\n" +
"•Comida:\n" +
"\n" +
"    1 taza de crema de verduras\n" +
"    1 taza de sopa de pasta o arroz\n" +
"    2 tortillas\n" +
"    1 papata al horno con 1 cucharadita de crema y 1 cucharadita de queso rallado\n" +
"    1 ensalada de hojas verdes con ¼ de taza de aguacate picado y 2 cucharadas de Vinagreta\n" +
"    1 taza de flan napolitano\n" +
"\n" +
"•Merienda:\n" +
"\n" +
"    1 taza de leche malteada\n" +
"    4 galletas saladas con queso crema\n" +
"\n" +
"•Cena:\n" +
"\n" +
"    2 porciones de pizza vegetariana\n" +
"    1 pieza de plátano","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol.JPG"));
             }
            
            if(imc2>=18 && imc2<=24.9){
                 JOptionPane.showMessageDialog (null,"\n\nNormal","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol2.JPG"));

            }
            if(imc2>=25 && imc2<=26.9){
                JOptionPane.showMessageDialog (null,"Sobrepeso\nDIETA: Frutas y verduras, Consume frutas y verduras. Lo ideal es consumir, como mínimo,\n "
                        + "cinco raciones diarias entre frutas y verduras.\n" +
"\n" +
"• Lácteos. Si deseas consumir leche o yogurt, es mejor consumirla en \n su presentación descremada o desnatada. "
                        + "Lo ideal es de 2 a 3 raciones al día para tener suficiente calcio.\n" +
"\n" +
"• Carnes y pescados. Es recomendable de 1 a 2 raciones diarias. Evita la grasa que contiene la piel de estos alimentos.\n" +
"\n" +
"•  Azúcar y derivados. Evita los alimentos que tengan una concentración alta en azúcares. Cambia las mermeladas y los refrescos\n por alimentos naturales.\n" +
"\n" +
"Es probable que hasta hoy no hayas tenido resultados con las dietas que has seguido, pero si empiezas a consumir\n "
                        + "los alimentos en las raciones y proporciones adecuadas, y te propones realizar algún tipo de actividad física,\n"
                                         + " los resultados empezarán a ser visibles a corto plazo.","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol.JPG"));

            }
            
             if(imc2>=27 && imc2<=29.9 ){
                  JOptionPane.showMessageDialog (null,"Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares\nDIETA: DESAYUNO: Té con leche, cereales ricos en fibra y fruta.\n" +
"• Una taza de desayuno de cereales desayuno (ricos en fibra)\n" +
"• Una taza de desayuno de leche desnatada\n" +
"• Una naranja\n" +
"• Una taza de desayuno de té\n" +
"Tome una taza de leche desnatada con té y cereales ricos en fibra (4 ó 5 cucharadas). Tome una naranja , que le\n" +
"aporta Vitamina C, imprescindible para la absorción del hierro.\n" +
"• MEDIA MAÑANA: Manzana.\n" +
"• Una manzana\n" +
"Es importante tener en cuenta la fibra que se encuentra, tanto en la piel como en la pulpa de las frutas, pues facilita\n" +
"el tránsito intestinal y retardan la absorción de los azúcares. Tome a media mañana una manzana.\n" +
"• COMIDA: Gazpacho y solomillo de ternera.\n" +
"• Una ración de gazpacho\n" +
"• Una ración de fresas\n" +
"• Una ración de ternera (solomillo)\n" +
"Tome una ración de gazpacho y una ración de solomillo de ternera. De postre, tome unas fresas en su propio jugo.\n" +
"• MERIENDA: Yogurt desnatado.\n" +
"• Un yogurt desnatado\n" +
"Tome de merienda un yogurt desnatado.\n" +
"• CENA: Ensalada vegetal.\n" +
"• Una ración de ensalada mixta (vegetal)\n" +
"• Una cucharada de aceite de oliva\n" +
"• Una cucharada de vinagre\n" +
"• Una porción de queso de Burgos","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol.JPG"));

             }
            
            if(imc2>=30 && imc2<=39.9 ){
          JOptionPane.showMessageDialog(null,"Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares\nDIETA:  A la hora de calcular una dieta, debe saber que un gramo de:\n" +
"\n" +
" • Hidratos de carbono y proteínas, suponen 4 Kcal.\n" +
" •Alcohol, suponen 7 Kcal\n" +
"• Grasa, suponen 9 Kcal.\n" +
"\n" +
"Luego está claro, que es fundamental reducir la cantidad de grasa de la dieta, es decir, una ensalada bien aliñada por la noche, NO es la solución.\n" +
"\n" +
"Respecto a los Batidos, Barritas y demás sustitutos de las comidas, es recomendable su uso SÓLO para suplir la comida, debiendo seguir el desayuno y la cena normal, o según su dieta.\n" +
"\n" +
"La dieta ideal es de un 55% de hidratos de carbono, un 30-35% de grasa y un 15% de proteínas, junto con una fuente de fibra y fundamental, 2 litros de agua.\n Desayuno: 2 rebanadas de pan integral y una fruta\nMedia-Mañana: 2 rodajas de melon"
                  + "\nComida: Ensalada de lechuga,pepino,pimiento,zanahoria,tomate en cantidad que quieras y fresas.\nMerienda:1 yogur de soya\nCena: Pure de verduras 1naranja","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol.JPG"));
   
            }
            if(imc2>40){
              JOptionPane.showMessageDialog(null,"Obesidad grado III Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares"
                      + "\nDIETA:\n•DESAYUNO:Un  vaso de leche descremada con dos cucharadas de \n" +
"maicena, todo endulzado con una cucharadita de miel de\n" +
"abeja.\n" +
"\n" +
"Media taza de frijoles cocidos con dos panes integrales\n" +
"\n" +
"Un  vaso  de  jugo  de  naranja natural y una taza de sandía,\n" +
"melón  o  piña,  lo  cual  puede  ser ingerido como parte del\n" +
"desayuno ó a media mañana.\n•ALMUERZO (COMIDA):8 onzas de carne de res a la plancha o asada\n" +
"\n" +
"Dos rebanadas de pan integral o dos tortillas\n" +
"\n" +
"2 Tazas de sopa de fideos (de sobre) sin verduras.\n" +
"\n" +
"Dos frutas a escoger entre manzanas, peras o naranjas.\n•CENA:Media pechuga de pollo asada o a la plancha.\n" +
"\n" +
"Dos rebanadas de pan integral.\n" +
"\n" +
"Un plátano (macho) cocido.\n" +
"\n" +
"1 yogurt natural (tamaño aproximado de 150 grs)","DIETA:", JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/proyecto/lol.JPG"));

          
            }
           
 
        JOptionPane.showMessageDialog(null,"GRACIAS POR UTILIZAR SALUD IDEAL V1.0\n BY: GARO AND ALBERT" ,"GRACIAS:", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/proyecto/ms.jpg"));
           
           
           
           }
        
           
        
}

    
   

