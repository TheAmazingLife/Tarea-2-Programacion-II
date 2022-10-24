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
    }

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

/*
Bebida bebida = null;
switch (key) {
    case 1:
        bebida = new Sprite(1111);
        break;
    case 2:
        bebida = new CocaCola(2222);
        break;
    case 3:
        bebida = new Fanta(3333);
        break
    default:
        break;
}
 */
