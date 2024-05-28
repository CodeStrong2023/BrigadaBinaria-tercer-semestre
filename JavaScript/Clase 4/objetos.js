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



