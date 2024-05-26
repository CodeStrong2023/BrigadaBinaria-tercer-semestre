mifuncion(8,2);//Esto se le conoce como hosting 

function mifuncion(a,b){
   //console.log("Sumamos: "+(a+b));
   return a+b;
}

//llamando la funcion
mifuncion(5,4);

let resultado = mifuncion(6,7);
console.log(resultado); 

//Declaramos una funcion de tipo expresion
let x=function(a,b){return a+b};//Necesita cierre  con punto y coma
resultado = x(5,6);//Al llamarla se pone la variable y parentesis
console.log(resultado);


//Funciones de tipo self y invoking
(function(a,b){
   console.log("Ejecutando la función: "+(a+b));
})(9,6);

console.log(typeof mifuncion);
function mifuncionDos(a,b){
   console.log(arguments.length);
   return a+b;
}

mifuncionDos(5,7,3,6);

//toString
var mifuncionTexto = mifuncionDos.toString();
console.log(mifuncionTexto);

//Funciones flecha
const sumarFuncionFlecha = (a,b)=>a+b;
resultado=sumarFuncionFlecha(3,7);//Asignar el valor a una variable
console.log(resultado);


//Funcion tipo de expresion
let sumar = function(a,b){
console.log(arguments[0]);//muestra el parametro de :a
console.log(arguments[1]);//muestra el parametro: b
return a+b+arguments[2];
}
resultado=sumar(3,2,9);
console.log(resultado);

let respuesta =sumarTodo(5,4,13,10,9); 
console,log(respuesta);
function sumarTodo(){
let suma = 0;
for(let i=0;i<arguments.length;i++){
   suma+=arguments[i];//arguments es para arreglos
}
return suma;
}


//Tipos primitivos
let k =10;
function cambiarValor (a){//Paso por valor
   a=20;
}

cambiarValor(k);
console.log(k); 10
// Paso por referencia
const persona = {
   nombre:"Lucas",
  apellido:"Garcia"
}

function cambiarValorObjeto(p1){
   p1.nombre= "Lucas"
   p1.apellido="Garcia"
}

cambiarValorObjeto(persona);
console.log(persona);
