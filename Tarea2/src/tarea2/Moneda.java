package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - getSerie() devuelve el numero de serie en valor de ubicacion en memoria ram
// - toString() imprime el valor de la moneda y la direccion de memoria ram
// - getValor() devuelve el valor de la moneda en int.

abstract class Moneda {

    public Moneda() {
    }

    public String getSerie() { // retorna su dirección en RAM como número de serie
        return this.hashCode().toString();
    }

    public abstract String toString(){ // imprime el valor de la moneda
        return "Valor de la moneda: " + getValor() + " Nro de serie :" + getSerie();
    } 

    public abstract int getValor(); // retorna la cantidad que vale la moneda
}
class Moneda1500 extends Moneda {
    public Moneda1500() {
    }

    public int getValor() {
        return 1500;
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
    }

    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
    }

    public int getValor() {
        return 100;
    }
}

/*
 * Features:
 * Creacion de subclase Moneda1500, Moneda1000, Moneda500, Moneda100
 * Asignar direccion en memoria ram a serie y metodo getSerie();
 * 
 * Las monedas no tienen propiedades, no las necesitan, el valor puede ser retornando directamente el número
 * Eliminacion del constructor y valor como atributo, getValor() retorna su valor en int
 * Metodo toString devuelve la serie y el valor en un String
 * Metodo getValor solamente retorna en numero
 */