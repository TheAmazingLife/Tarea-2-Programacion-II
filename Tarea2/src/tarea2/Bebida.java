package tarea2;

abstract class Bebida {

    private int serie;

    public Bebida(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String sabor() {
        return "sabor: ";
    }
}

class Sprite extends Bebida {

    public Sprite(int serie) {
        super(serie);
    }

    public String sabor() {
        return super.sabor() + "sprite";
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
    }

    public String sabor() {
        return super.sabor() + "cocacola";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
    }

    public String sabor() {
        return super.sabor() + "fanta";
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
