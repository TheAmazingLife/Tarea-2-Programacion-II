package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - cuantoVuelto() devuelve el vuelto
// - queBebiste() devuelve el sonido de la bebida

public class Comprador {
    //[c] no almacenar monedas ni bebida como propiedad
    // las propiedades son un string y un entero, los valores se devuelven cuando se pidan
    protected Moneda moneda;
    protected int cualBebida;
    protected Expendedor exp;

    protected int vuelto;
    protected String sabor;

    public Comprador(Moneda moneda, int cualBebida, Expendedor exp) {
        this.moneda = moneda;
        this.cualBebida = cualBebida;
        this.exp = exp;
        this.vuelto = 0; //debemos devolverlo como un entero una en una
        Bebida tempBebida = exp.comprarBebida(moneda, cualBebida);
        if(tempBebida != null){
            sabor = tempBebida.beber();
        } else {
            sabor = null;
        }
    }
    //metodo dudoso(?) se puede skipear el retorno moneda con un void y solo asignando el valor
    public Moneda getVuelto(Expendedor exp) {
        Moneda tempMoneda = exp.getVuelto();
        vuelto += tempMoneda.getValor(); //expendedor devuelve moneda a la que se le pide el valor y se suma al vuelto int
        return tempMoneda;
    }

    public int cuantoVuelto() { // de vuelto
        return vuelto;
    }
    //debemos registrar el sabor como propiedad si es que consiguio una
    public String queBebiste() { //el sonido de la Bebida: cocacola, sprite, fanta
        return sabor;
    }
}