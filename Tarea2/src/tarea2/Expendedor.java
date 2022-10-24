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
                        calcularVuelto(moneda);
                        return bebida;
                    case 2:
                        bebida = sprite.getBebida();
                        calcularVuelto(moneda);
                        return bebida;
                    case 3:
                        bebida = fanta.getBebida();
                        calcularVuelto(moneda);
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

    public void calcularVuelto(Moneda moneda) {
        int monedas100 = (moneda.getValor() - precioBebidas) / 100;
        for (int i = 0; i < monedas100; i++) {
            Moneda monedaVuelto = new Moneda100();
            vueltoTotal.add(monedaVuelto);
        }
    }
    
    public Moneda getVuelto(){ //torna moneda, null si deposito está vacío
        return vueltoTotal.getVuelto(); // se rescatan una a una
    }

    public int getPrecioBebidas(){
        return precioBebidas;
    }
}
/* 
 * Features:
 * Metodo calcularVuelto() entregando como parametro la moneda.getValor convierte y deposita en monedas de 100 en el deposito
 */