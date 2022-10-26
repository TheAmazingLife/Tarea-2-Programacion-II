package tarea2;

// abstract de la Clase `Moneda`:
// Metodos:
// - cuantoVuelto() devuelve el vuelto
// - queBebiste() devuelve el sonido de la bebida

public class Comprador {    
    // las propiedades son un string y un entero, los valores se devuelven cuando se pidan
    protected int vuelto;
    protected String sabor;

    public Comprador(Moneda moneda, int cualBebida, Expendedor exp) {
        this.vuelto = 0; //debemos devolverlo como un entero una en una
        Bebida tempBebida;
        sabor = null;
        try {
            tempBebida = exp.comprarBebida(moneda, cualBebida);
            sabor = tempBebida.beber();
            System.out.println("Compra Realizada con exito.");
        } catch (PagoIncorrectoException|PagoInsuficienteException|NoHayBebidaException e) {
            tempBebida = null;
            sabor = null;
            System.out.println(e.getMessage());
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