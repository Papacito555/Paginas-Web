<!DOCTYPE>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Imágenes dinámicas de una carpeta en php "Practica 8"</title>
</head>

<body>
<?php
    $directory="img";
    $dirint = dir($directory);
    while (($archivo = $dirint->read()) !== false)
    {
        if (eregi("gif", $archivo) || eregi("jpg", $archivo) || eregi("png", $archivo)){
            echo '<img src="'.$directory."/".$archivo.'">'."\n";
        }
    }
    $dirint->close();
?>
</body>
</html>