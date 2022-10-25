package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - cuantoVuelto() devuelve el vuelto
// - queBebiste() devuelve el sonido de la bebida

public class Comprador {
    //[c] no almacenar monedas ni bebida como propiedad
    // las propiedades son un string y un entero, los valores se devuelven cuando se pidan
    /* protected Moneda moneda;
    protected int cualBebida;
    protected Expendedor exp; */

    protected int vuelto;
    protected String sabor;

    public Comprador(Moneda moneda, int cualBebida, Expendedor exp) {
        /* this.moneda = moneda;
        this.cualBebida = cualBebida;
        this.exp = exp; */ 
        this.vuelto = 0; //debemos devolvcomo un entero una en una
        Bebida tempBebida = exp.comprarBebida(moneda,  cualBebida);
        if(tempBebida != null){
            sabor = tempBebida.beber();
        } else {
            sabor = null;
        }
        Moneda tempMoneda = exp.getVuelto();;
        while (tempMoneda != null) {
            vuelto += tempMoneda.getValor();
            tempMoneda = exp.getVuelto();
        } 
    }
    
    public int cuantoVuelto() { // de vuelto
        return vuelto;
    }
    //debemos registrar el sabor como propiedad si es que consiguio una
    public String queBebiste() { //el sonido de la Bebida: cocacola, sprite, fanta
        return sabor;
    }
}

/* 
 * El retorno moneda con un void y solo asignando el valor
 * addVuelto 
 */