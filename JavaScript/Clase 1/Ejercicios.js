//EJERCICIOS CLASE 1 
//Ejercicio 1 - For 

/*  Realizar un programa que permita al usuario ingresar 6 números enteros (positivos y negativos)
Al finalizar, mostrar la sumatoria de los números negativos y el promedio de los positivos*/

let sumNegativos = 0;
let countPositivos = 0;
let sumPositivos = 0;

for (let i = 0; i < 6; i++) {
    let numero = parseInt(prompt(`Ingrese el número ${i + 1}:`));

    if (numero < 0) {
        sumNegativos += numero;
    } else if (numero > 0) {
        countPositivos++;
        sumPositivos += numero;
    }
}
let promedioPositivos = 0;
if (countPositivos !== 0) {
    promedioPositivos = sumPositivos / countPositivos;
}
console.log(`La sumatoria de los números negativos es: ${sumNegativos}`);
console.log(`El promedio de los números positivos es: ${promedioPositivos}`);

//Ejercicio 2 - While 
/*Realiza un programa en el cual el usuario ingrese números enetros positivos 
y calcule la suma de los mismos, el programa se detiene cuando se ingresa un número negativo*/
let suma = 0;
let ingresado = 0;

while (ingresado >= 0) {
    suma += ingresado;
    ingresado = parseInt(prompt("Ingresar número: "));
}
console.log(`La suma es ${suma}`);

//Ejercicio 3 - Do while 
/*Realiza un programa en el que se genern números aleatorios y
cuente cuántos intentos se generan hasta llegar al número 50*/
let numAleatorio;
let intentos = 0;

do {
    numAleatorio = Math.floor(Math.random() * 100) + 1; // Genera un número aleatorio entre 1 y 100
    intentos++;
} while (numAleatorio !== 50);

console.log(`Se encontró el número 50 después de ${intentos} intentos.`);
