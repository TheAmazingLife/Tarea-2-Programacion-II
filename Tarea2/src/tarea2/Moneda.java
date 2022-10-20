package tarea2;

abstract class Moneda {

    private int serie;
    protected int valor;

    public Moneda(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String toString() {
        return "Valor de la moneda: " + serie;
    }
}

class Moneda1500 extends Moneda {
    public Moneda1500(int serie){
       super(serie);
       valor = 1500;
    }
    
    public String getValor() {
        return "Valor: " + valor;
    }
}
