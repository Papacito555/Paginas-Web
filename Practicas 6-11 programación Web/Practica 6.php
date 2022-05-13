<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Práctica 6</title>
</head>
<body>
<?php
define('TAM',4); //definimos la constante TAM con valor de 4
function potencia ($v1, $v2) //función para elevar a la potencia. recibe dos valores (base y exponente
{
   $resultado= pow($v1, $v2); //elevamos la base $v1 al exponente $v2
   return $resultado; //devulvemos el resultado almacenado
}
 
//creamos la tabla a mostrar mediante dos bucles
echo "<table border=1>";
for ($n1=1; $n1<=TAM; $n1++) //notese que el tamaño de la tabla utiliza como referencia el valor de la constante TAM
{
   echo "<tr>";
   for ($n2=1; $n2<=TAM; $n2++)
      echo "<td>". potencia($n1,$n2). "</td>"; //pasamos el valor de los bucles a la función potencia
   echo "</tr>";
}
echo "</table>";
?>
</body>
</html>