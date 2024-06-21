class Persona{

    static contadorPersonas = 0;

    constructor(nombre, apellido, edad){
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona(){
        return this._idPersona
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    get edad(){
        return this._edad;
    }

    set edad(edad){
        this._edad = edad;
    }

    toString(){
        return this._idPersona+' '+this._nombre+' '+this._apellido+' '+this._edad;
    }
}

class Empleado extends Persona {
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this._idEmpleado;
    }

    get sueldo(){
        return this._sueldo;
    }

    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        return `${super.toString()} ${this._idEmpleado} ${this._sueldo}`;
    }
}

class Cliente extends Persona{
	static contadorClientes=0;
	constructor (nombre,apellido, edad,fechaRegistro){
		super(nombre, apellido, edad);
		this._idCliente =++Cliente.contadorClientes;
		this._fechaRegistro=fechaRegistro;
	}
	get idCliente(){
		return this._idCliente;
	}
	get fechaRegistro(){
		return this._fechaRegistro
	}
	set fechaRegistro(fechaRegistro){
		this._fechaRegistro=fechaRegistro
	}
	toString(){
		return `${super.toString()} ${this._idCliente} ${this._fechaRegistro}`;
	}
}

//Prueba de la clase Persona
let persona1 = new Persona("Martín", "Sánchez", 34);
console.log(persona1.toString());

let persona2 = new Persona("María", "González", 46);
console.log(persona2.toString());


// Prueba de la clase Empleado
let empleado1 = new Empleado('Lucio', 'Pérez', 22, 5000);
console.log(empleado1.toString());

let empleado2 = new Empleado('Rosario', 'Acosta', 20, 7000);
console.log(empleado2.toString());


// Prueba de la clase Cliente.
let cliente1 = new Cliente("Miguel", "Granados", 37, new Date());
console.log(cliente1.toString());

let cliente2 = new Cliente("Yayo", "Guridi", 58, new Date());
console.log(cliente2.toString());