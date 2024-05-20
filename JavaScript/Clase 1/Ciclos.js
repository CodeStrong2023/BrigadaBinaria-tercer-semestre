// CLASE 1 

//cilco while
let contador = 0;
while(contador<3){
    console.log(contador);
    contador++;//aumenta contador
}
console.log('Fin del ciclo while');
//Ciclo do while
let conteo = 0;
do {
    console.log(conteo)
    conteo++;//operador unario de post incremento
}while(conteo < 3);
console.log('Fin del ciclo do while');
//Ciclo for
for(let contando = 0;contando < 3;contando++){
    console.log(contando);
}
console.log('Fin del ciclo for');
//Palabra reservada break
for(let contando = 0;contando <= 10;contando++){
    if (contando % 2 == 0){
        console.log(contando);//muestra numeros pares
        break;//al encontrar un numero par sale del ciclo
    }
}
console.log('Se encontró un numero par');
console.log('Fin del ciclo for con palabra reservada break');
//Palabra reservada continue
for(let contando = 0;contando <= 10;contando++){
    if (contando % 2 !== 0){
        continue;//irá a la siguiente iteracion
    }//La palabra continue en en este caso ignora el ciclo if
    console.log(contando);
}
console.log('Fin del ciclo for con palabra reservada continue');
//Etiquetas labels (no son recomendadas)
//permite ir a una parte del programa que deseemos
inicio:
for(let contando = 0;contando <= 10;contando++){
    if (contando % 2 !== 0){
        continue inicio;//
    }//La palabra inicio en en este caso ignora el ciclo "for" e "if"
    console.log(contando);
}
console.log('Fin del ciclo');




//Ciclo while
//Imprimir numeros del 0 al 5 con el ciclo while

let i = 0;
while(i<=5){
    console.log(i);
    i++;
}

//Ciclo for 
//Ingrese un número y mostrar su potencia n^2, repetir este proceso hasta que se ingrese un número negativo
let num = parseInt(prompt("Ingrese un número: "));

while (num > 0) {
    let cuadrado = Math.pow(num, 2);
    console.log(`La potencia de ${num} es igual a ${cuadrado}`);
    // Nueva entrada
    num = parseInt(prompt("Ingrese un número: "));
}
console.log('Fin del programa');

