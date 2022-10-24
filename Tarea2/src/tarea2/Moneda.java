Pablo Sanhueza
#8484

La Momia Emo 🇵🇪🎃 — ayer a las 21:21
https://www.w3schools.com/java/java_user_input.asp
W3Schools offers free online tutorials, references and exercises in all the major languages of the web. Covering popular subjects like HTML, CSS, JavaScript, Python, SQL, Java, and many, many more.
Imagen
Tipo de archivo adjunto: acrobat
Tarea_2_Enunciado.pdf
1.71 MB
La Momia Emo 🇵🇪🎃 — hoy a las 15:19
package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - getSerie() devuelve el numero de serie en valor de ubicacion en memoria ram
// - toString() imprime el valor de la moneda y la direccion de memoria ram
Expandir
Moneda.java
3 KB
package tarea2;

// abstract de la clase `Expendedor`
// Metodos
// - 

Expandir
Expendedor.java
3 KB
﻿
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
        return "" + this.hashCode();
    }

    public abstract String toString(); // imprime el valor de la moneda

    public abstract int getValor(); // retorna la cantidad que vale la moneda
}

class Moneda1500 extends Moneda {
    public Moneda1500() {
    }

    public String toString() {
        return "Valor de la moneda: " + getValor() + " Nro de serie :" + getSerie();
    }

    public int getValor() {
        return 1500;
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
    }

    public String toString() {
        return "Valor de la moneda: " + getValor() + " Nro de serie :" + getSerie();
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
    }

    public String toString() {
        return "Valor de la moneda: " + getValor() + " Nro de serie :" + getSerie();
    }

    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
    }

    public String toString() {
        return "Valor de la moneda: " + getValor() + " Nro de serie :" + getSerie();
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