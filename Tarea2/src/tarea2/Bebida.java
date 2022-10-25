package tarea2;

// abstract de la clase `Bebida`
// Metodos
// - getSerie() retorna el numero de serie de la bebida
// - beber() retorna el sabor de la bebida bebida

abstract class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber(); {
    }
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return  "sprite";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }+operation()
    public String beber() {
        return "cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String beber() {
        return "fanta";
    }
}