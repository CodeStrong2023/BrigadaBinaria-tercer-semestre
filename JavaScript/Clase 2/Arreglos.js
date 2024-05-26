// CLASE 2

//Los arreglos son un tipo object que permiten almacenar distintos valores
//Hay diferentes formas de declarar un arreglo:

let autos1 = new Array('Ferrari','Porche','Audi'); //Esta forma es antigua, ya no se recomienda realizarlo de esa manera

const autos2 = ['Mercedes','Nissan','BMW'];//Esta forma se usa actualente
//Es constante ya que la referencia de memoria no se va a modificar, pero si podremos modificar su contenido
console.log(autos2);//Mostramos el arreglo
//Mostramos un elemento del arreglo
console.log(autos2[0]);
//recorremos los elementos de un arreglo con ciclo for
for (let i = 0;i < autos2.length;i++){
    console.log(autos2[i]);
}
//Modificamso elementos
autos2[1] = 'Pagani';
console.log(autos2[0]);
//Agregamos nuevos valores al arreglo
autos2.push('Macerati');
console.log(autos2);
//Otra forma para agregar nuevos valores al arreglo
autos2[autos2.length] = 'McLaren';
//Otra forma para agregar nuevos valores al arreglo, hay que tener cuidado con esta forma
autos2[5] = 'Alfa Romeo';
console.log(autos2);
//Preguntamos si es una Arreglo, devolverá un booleano
console.log(Array.isArray(autos2));
//Otra forma de comprobar si es arreglo, preguntamos si la variable es una instancia de la clase array
console.log(autos2 instanceof Array);
