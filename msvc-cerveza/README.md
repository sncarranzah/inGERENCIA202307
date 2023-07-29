	El usuario mediante una aplicacion cliente web (por ejemplo postman) hace una peticion RestFul al microservicio msvc-cerveza.
	Esta peticion puede ser de 3 tipos:
a.	url: localhost:12001
	metodo: GET
	descripcion: lista todas las cervezas disponibles
b.	url: localhost:12001/[cadena A]
	metodo: GET
	descripcion: muestra todas las cervezas que tengan como subcadena en su nombre la cadena A
c. 	URL: localhost:12001/recomendarCervezaAleatoria
	metodo: GET
	descripcion: se ofrece una cerveza aleatoria

	Luego de que el usuario envíe la petición, el microservicio enviará una respuesta en formato json mediante la aplicacion
	cliente web.
