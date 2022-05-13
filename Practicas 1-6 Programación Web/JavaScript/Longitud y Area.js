function area()
{
	var radio=Number(document.getElementById('r1').value);
	
	var area=((radio*radio)*3.1416);
	document.getElementById('ar').value=area;
}

function longitud()
{
	var diametro=Number(document.getElementById('dm').value);
	var longitud=(diametro*3.1416);
	document.getElementById('longitud').value=longitud;
}