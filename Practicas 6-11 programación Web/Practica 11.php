<!DOCTYPE html PUBLIC “-//W3C//DTD HTML 4.01 Transitional//EN”>
 <html>
 <head>
 <meta content=”text/html; charset=ISO-8859-1″ httpequiv=”
content-type”>
 <title>Practica 11 "Crear Miniatura"</title>
 </head>
 <body>
 <?php
 echo "<h1>Galeria de imagenes con thumbnails</h1>";
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
 function crea_tumbs($foto)
 {
 if (!is_dir(‘fotos/tumbs’))
mkdir (‘fotos/tumbs’, 0777);
 if (!is_file(‘fotos/tumbs/MINI-$foto’))
system ("convert -sample 40×40 /fotos/$foto /fotos/tumbs/MINI-
$foto");
 }
echo "<table border=1>";
 $puntero = opendir(‘fotos’);
 $i=1;
 while (false !== ($foto = readdir($puntero)))
 {
 if ($foto!="." && $foto!=".." && valida_foto($foto))
 {
 crea_tumbs($foto);
 if ($i==1)
 echo "<tr>";
echo "<td><a href=’fotos/tumbs/MINI-$foto’>";
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
