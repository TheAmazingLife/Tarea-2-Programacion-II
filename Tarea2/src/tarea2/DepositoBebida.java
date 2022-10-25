package tarea2;

import java.util.ArrayList;

public class DepositoBebida {

    private ArrayList<Bebida> deposito;

    public DepositoBebida() {
        deposito = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida bebida) {
        deposito.add(bebida);
    }

    public Bebida getBebida() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            return bebida;
        }
    }
}
