let x =10;//Variable de tipo primitiva
console.log(xlength);
console.log("Tipos primitivos")

//objeto
let persona={
    nombre:"Daniel",
    apellido:"Martinez",
    email:"Dmartinez@gmial.com",
    edad:35,

  nombreCompleto:function (){//metodo o funcion en java script
return this.nombre+""+this.apellido;
   }
}
console,log(persona.nombre);
console,log(persona.apellido);
console,log(persona.email);
console,log(persona.edad);
console,log(persona);
console,log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");

let persona2 =new Object();//Debe crear un nuevo objeto en memoria
persona2.nombre="Juan";
persona2.direccion="filtros 2250";
persona2.telefono="264665544"
console.log(persona2.telefono);

console.log(persona["apellido"]);//Accedemos como si fuera un arreglo

//for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[porpiedad]);
}console.log("Cambiamosy eliminamos un error");
persona.apellido="Nahuel";//Cambiamos dinamicamente un valor del objeto
delete persona.apellido;//Eliminamos el error
console.log(persona);
//Distintas formas de iprimir un objeto
//Numero 1: La forma mas sencilla: concatenar cada valor de cada
console.log("Distintas formas de imprimir un objeto: Forma 1");
console.log(persona.nombre+","+persona.apellido);

//Numero 2: A traves del ciclo for in 
console.log("Distintas formas de imprimir un objeto: Forma 2");
for(nombrePropiedad in persona){
  console.log(persona[nombrePropiedad]);
}
//Numero 3: La funcion objet.values()
console.log("Distintas formas de imprimir un objeto: Forma 3");
let personaArray=objet.values(persona);
console.log(personaArray);


//Numero 4: Utilizaremos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto: Forma 4");
let personaString = JSON.stringify(persona);
console log(personaString);