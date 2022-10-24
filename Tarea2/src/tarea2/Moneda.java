package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - getSerie() devuelve el numero de serie en valor de ubicacion en memoria ram
// - toString() imprime el valor de la moneda
// - getValor() devuelve el valor de la moneda en int.

abstract class Moneda {
    //ARREGLAR las monedas  no tienen propiedades, no las necesitan, el valor puede ser retornando directamente el número
    protected int valor;

    public Moneda(int valor) {
        this.valor = valor;
    }

    public String getSerie(Moneda obj) { //retorna su dirección en RAM como número de serie
        return "" + obj;
    }

    public String toString(Moneda obj) { //imprime el valor de la moneda
        return "Valor de la moneda: " + valor + " Nro de serie :" + obj;
    }

    public abstract int getValor(); //retorna la cantidad que vale la moneda
}

class Moneda1500 extends Moneda {
    public Moneda1500() { //posible correccion eliminar el constructor
        super(1500);
    }

    public int getValor() { // retornar solamnete el numero
        return valor;
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super(1000);
    }

    public int getValor() {
        return valor;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super(500);
    }

    public int getValor() {
        return valor;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super(100);
    }

    public int getValor() {
        return valor;
    }
}

/*
 * Features:
 * Creacion de subclase Moneda1500, Moneda1000, Moneda500, Moneda100
 * Asignar direccion en memoria ram a serie y metodo getSerie();
 */