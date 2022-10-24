package tarea2;

// abstract de la clase `Expendedor`
// Metodos
// - 

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
        vueltoTotal = null;

        for (int i = 0; i < numBebidas; i++) {
            Bebida cocacola = new CocaCola(100 + i);
            this.cocacola.addBebida(cocacola);
            Bebida spritee = new Sprite(200 + i);
            this.sprite.addBebida(spritee);
            Bebida fanta = new Fanta(300 + i);
            this.fanta.addBebida(fanta);
        }
    }

    public Bebida comprarBebida(Moneda moneda, int cual) {
        Bebida bebida = null;
        if(moneda == null) {
            //PagoIncorrectoException
        } else {
            if (moneda.getValor() >= precioBebidas) {
                //en caso de no haber bebidas, numero erroneo NoHayBebidaException y devuelve la moneda al deposito
                switch (cual) { //vuelto es la moneda a devolver falta definirla
                    case 1:
                        bebida = cocacola.getBebida();
                        //metodo calcular `vuelto` entregando como parametro el valor de la bebida y la moneda.getValor en monedas de 100 en el deposito
                        vueltoTotal.add(vuelto);
                        return bebida;
                    case 2:
                        bebida = sprite.getBebida();
                        vueltoTotal.add(vuelto);
                        return bebida;
                    case 3:
                        bebida = fanta.getBebida();
                        vueltoTotal.add(vuelto);
                        return bebida;
                    default:
                        vueltoTotal.add(moneda);
                        //imprimir excepcion
                        return null;
                }
            } else if (moneda.getValor() < precioBebidas) {
                //PagoInsuficienteException
            }
        }
        return null;
    }
    
    public Moneda getVuelto(){ //torna moneda, null si deposito está vacío
        return vueltoTotal.getVuelto(); // se rescatan una a una
    }

    public int getPrecioBebidas(){
        return precioBebidas;
    }
}
