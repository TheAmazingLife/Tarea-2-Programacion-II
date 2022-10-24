package tarea2;

public class Comprador {

    protected Moneda dineroTotal;
    protected int tipo;
    protected Expendedor expendedor;

    public Comprador(Moneda dineroTotal, int tipo, Expendedor expendedor) {
        this.dineroTotal = dineroTotal;
        this.tipo = tipo;
        this.expendedor = expendedor;
    }

    public Bebida comprarBebida(int tipo) {
        Bebida bebida = null;
        if (dineroTotal.valor >= expendedor.getPrecioBebidas()) {
            switch (tipo) {
                case 1:
                    bebida = expendedor.getBebida(1);
                    return bebida;
                case 2:
                    bebida = expendedor.getBebida(2);
                    return bebida;
                case 3:
                    bebida = expendedor.getBebida(3);
                    return bebida;
            }

            int vuelto = dineroTotal.valor - expendedor.getPrecioBebidas();
            for (int i = 0; i < vuelto / 100; i++) {
                expendedor.addVuelto();
            }
        }
        return null;
    }

    public Moneda getVuelto() {
        if (dineroTotal.valor >= expendedor.getPrecioBebidas()) {
            return expendedor.getVuelto();
        } else {
            return null;
        }
    }

    public String queBebiste() {
    }
}
