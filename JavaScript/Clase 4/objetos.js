let x = 10; //Variable de tipo primitiva
console.log(x.length);
console.log('TIPOS PRIMITIVOS');
//Creamos un objeto
let persona = {
    nombre:'Santiago',
    apellido:'Castro',
    email:'santiagomkastro10@gmial.com',
    edad:18,
    nombreCompleto: function(){ //creamos un metodo o funcion
        return this.nombre +' '+ this.apellido
    }
}
//Mostramos atributos del objeto
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log('EJECUTANDO CON UN OBEJTO');
let persona2 = new Object(); //Crea una objeto nuevo en memoria
persona2.nombre = 'Angi';
persona2.direccion = 'Mite 333';
persona2.telefono = '2604 824634'
console.log(persona2.telefono);
console.log('CREAMOS UN NUEVO OBJETO');
console.log(persona['apellido'])//Accedemos como su fuera un arreglo
//for in para acceder al objeto como si fuera un arreglo
console.log('USAMOS EL CICLO FOR IN ')
for (propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad])
}
//Agregar y eliminar propiedades de un objeto
console.log('CAMBIAMOS Y ELIMINAMOS UN ERROR')
persona.apellido = 'Nuñez'; //Cambiamos dinamicamente el valor de un objeto
console.log(persona)
//Creamos un atributo erroneo para luego borrarlo
persona.Apellidos = 'Ruiz';//Creamos una nuevo propiedad
delete persona.Apellidos;//Borramos la propiedad erronea

//DISTINTAS FORMAS DE IMPRIMIR UN OBJETO
//Numero 1(la mas sencilla): concatenar cada valor de cada propiedad
console.log(persona.nombre+' '+persona.apellido);
//Numero 2: mediante el ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
//Numero 3: la funcion Object.values()
let personaArray = Object.values(persona);
console.log(personaArray)

//Numero 4: Utilizaremos el metodo JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString)



//CLASE 5
console.log('Comenzamos a utilizar el método get');
console.log(persona.nombreEdad);

console.log('Comenzamos con el método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}
let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis'; //Modificamos el nombre
padre.telefono = '6588378537';// Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()) //Utilizamos la función
let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); // La propiedad no está definida
console.log(madre.nombreCompleto());

//Diferentes formas de crear objetos

//caso 1
let miObjeto = new Object(); //opción formal
//caso 2
let miObjeto2 = {};//breve y recomendada

// caso string 1
let miCadena1 = new String("Hola");
//caso string 2
let miCadena2 = "Hola";//sintaxis siplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1);//formal no recomendada
//caso con numeros 2
let miNumero2 = 1;// sintaxis recomendada

//caso boolean 1
let miBoolean1 = false;//formal
//caso boolean 2
let miBoolean2 = false; //sintaxis recomendada

//caso arreglo 1
let miArreglo1 = new Array();
//caso arreglo 2
let miArreglo2 = [];

//caso función 1
let miFuncion1 = new function(){}; //después de new todo se considera objeto
//caso función 2
let miFuncion2 = function(){}; //simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '2942434833';
console.log(padre)
console.log(madre.telefono);
madre.telefono = '29423484379';
console.log(madre.telefono);

// Uso de call
// Permite llamar a un método que está definido en un objeto desde otro objeto.
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+ ': '+this.nombre+' '+this.apellido+' '+telefono;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '5492618585856'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing', '5492618585856'));


// Método apply (llama a un método que no se encuentra definido en cierto objeto) parecido al call
let arreglo = ['Ing.', '5492618686865']; //creación del objeto 
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
