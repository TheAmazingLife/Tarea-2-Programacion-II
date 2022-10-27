package tarea2;

// Resumen
// clase `Comprador`
// Constructor Comprador(Moneda moneda, int cualBebida, Expendedor exp)
// Atributos
// - int vuelto
// - String sabor
// Metodos:
// - cuantoVuelto() devuelve el vuelto
// - queBebiste() devuelve el sonido de la bebida

public class Comprador {
    protected int vuelto;
    protected String sabor;

    public Comprador(Moneda moneda, int cualBebida, Expendedor exp) {
        this.vuelto = 0;
        Bebida tempBebida; // Bebida temporal
        try {
            // Intenta comprar la bebida e imprime si se realizo con exito
            tempBebida = exp.comprarBebida(moneda, cualBebida);
            sabor = tempBebida.beber();
            System.out.println("Compra Realizada con exito.");
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException e) {
            // En caso de que no se concrete la compra se deja el sabor como null
            sabor = null;
            System.out.println(e.getMessage());
        }
        Moneda tempMoneda = exp.getVuelto();
        while (tempMoneda != null) {
            vuelto += tempMoneda.getValor();
            tempMoneda = exp.getVuelto();
        }
    }

    public int cuantoVuelto() { // devuelve de vuelto del comprador
        return vuelto;
    }

    public String queBebiste() { // devuelve el sonido de la Bebida: cocacola, sprite, fanta
        return sabor;
    }
}