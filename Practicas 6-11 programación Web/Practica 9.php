<!DOCTYPE html PUBLIC “-//W3C//DTD HTML 4.01 Transitional//EN”>
 <html>
 <head>
 <meta content=”text/html; charset=ISO-8859-1″ httpequiv=”
content-type”>
 <title>Práctica 9</title>
 </head>
 <body>
 <?php
 echo "<h1>Tabla de Fotos con Enlace</h1>";
function valida_foto($fotos)
{
$rdo=0;
if (ereg("[Jj][Pp][Gg]$", $fotos)) {
    $rdo=1;
    jpg($fotos);
}
if (ereg("[Gg][Ii][Ff]$", $fotos)) {
    $rdo=1;
    gif($fotos);
}
if (ereg("[Pp][Nn][Gg]$", $fotos)){
    $rdo=1;
    png($fotos);
} 
if (ereg("[Bb][Mm][Pp]$", $fotos)) {
    $rdo=1;
    bmp($fotos);
}
return $rdo;
}


 echo "<table border=1>";
 $puntero = opendir(‘fotos’);
 $i=1;
 while (false !== ($foto = readdir($puntero)))
 {
 if ($foto!="<br>"
.” && $foto!=".." && valida_foto($foto))
 {
 if ($i==1)
 echo "<tr>";
echo "<td><a href=’fotos/$foto’>";
echo "<img src=’fotos/$foto’ width=100 height=100></img>";
echo "</a></td>";
if ($i==4)
 {echo "</tr>"; $i=0;}
 $i++;
 }
 }
 closedir($puntero);
 echo "</table>";
 ?>
 </body>
 </html>