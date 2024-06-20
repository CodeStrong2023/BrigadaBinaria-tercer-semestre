//let persona3 = new Persona('Carla', 'Ponce'); esto no se debe hacer: Persona is not defined


class Persona { // Clase padre
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre(nombre) {
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
    // Sobreescribiendo el metodo de la clase padre (object)
     toString(){ //Regresa un String
        // Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        // El metodo que se ejecuta depende si es una referencia si es tipo padre o hija
        return this.nombreCompleto();
    }
}

class Empleado extends Persona{ // Clase hija  
    constructor (nombre,apellido,departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}
