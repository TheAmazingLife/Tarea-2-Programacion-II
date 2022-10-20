package tarea2;

abstract class Moneda {
    protected int valor;

    public Moneda(int valor) {
        this.valor = valor;
    }

    public String getSerie(Moneda obj) {
        //System.out.println(obj.getClass().getSimpleName());
        return "Nro de serie" + obj;
    }

    public String toString() {
        return "Valor de la moneda: " + valor;
    }

    public abstract int getValor();
}

class Moneda1500 extends Moneda {
    public Moneda1500() {
        super(1500);
    }

    public int getValor() {
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
 * Pendiente:
 * Serie un atributo?
 */