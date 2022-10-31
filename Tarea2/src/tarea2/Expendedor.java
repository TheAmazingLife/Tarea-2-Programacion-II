package tarea2;

// Resumen
// clase `Expendedor`
// Constructor Expendedor(int numBebidas, int precioBebidas)
// Atributos
// - DepositoBebida cocacola, sprite, fanta;
// - DepositoVuelto vueltoTotal;
// - int precioBebidas;
// Metodos:
// - comprarBebida(Moneda moneda, int cual) compra la bebida, retorna excepciones en caso de fallas
// - calcularVuelto(Moneda moneda) calcula vuelto y lo devuelve al DepositoVuelto vueltoTotal en monedas de 100
// - getVuelto() devuelve UNA moneda del deposito en caso de que este vacio retorna null
// - getPrecioBebidas() retorna precioBebidas el precio de las bebidas

class Expendedor {

    private DepositoBebida cocacola;
    private DepositoBebida sprite;
    private DepositoBebida fanta;
    private DepositoVuelto vueltoTotal;
    private int precioBebidas;

    public Expendedor(int numBebidas, int precioBebidas) {
        cocacola = new DepositoBebida();
        sprite = new DepositoBebida();
        fanta = new DepositoBebida();
        vueltoTotal = new DepositoVuelto();
        this.precioBebidas = precioBebidas;

        for (int i = 0; i < numBebidas; i++) { //relleno de maquina con bebidas
            Bebida cocacola = new CocaCola(100 + i); this.cocacola.addBebida(cocacola);
            Bebida spritee = new Sprite(100 + i); this.sprite.addBebida(spritee);
            Bebida fanta = new Fanta(100 + i); this.fanta.addBebida(fanta);
        }
    }

    public Bebida comprarBebida(Moneda moneda, int cual) throws PagoIncorrectoException, NoHayBebidaException, PagoInsuficienteException { // compra la bebida, retorna excepciones en caso de fallas
        Bebida bebida = null;
        if (moneda == null) {
            throw new PagoIncorrectoException("No se puede comprar una bebida sin dinero."); // PagoIncorrectoException
        } else {
            if (moneda.getValor() >= precioBebidas) {
                // en caso de no haber bebidas o numero erroneo NoHayBebidaException y devuelve la moneda al deposito
                switch (cual) {
                    case 1:
                        bebida = cocacola.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            return bebida;
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    case 2:
                        bebida = sprite.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            return bebida;
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    case 3:
                        bebida = fanta.getBebida();
                        if (bebida != null) {
                            calcularVuelto(moneda);
                            return bebida;
                        } else {
                            vueltoTotal.add(moneda);
                            throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                        }
                    default: // caso numero erroneo
                        vueltoTotal.add(moneda);
                        throw new NoHayBebidaException("No hay bebida disponible."); // NoHayBebidaException
                }
            } else {
                vueltoTotal.add(moneda);
                throw new PagoIncorrectoException("Saldo insuficiente."); // PagoInsuficienteException
            }
        }
    }

    public void calcularVuelto(Moneda moneda) { // calcula vuelto y lo devuelve al DepositoVuelto vueltoTotal en monedas de 100
        int monedas100 = (moneda.getValor() - precioBebidas) / 100;
        for (int i = 0; i < monedas100; i++) {
            Moneda monedaVuelto = new Moneda100();
            vueltoTotal.add(monedaVuelto);
        }
    }

    public Moneda getVuelto() { // devuelve UNA moneda del deposito en caso de que este vacio retorna null
        return vueltoTotal.getVuelto(); // se rescatan una a una
    }

    public int getPrecioBebidas() { //retorna precioBebidas el precio de las bebidas
        return precioBebidas;
    }
}