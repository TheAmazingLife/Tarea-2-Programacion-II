package tarea2;

import java.util.ArrayList;

public class DepositoVuelto {

    private ArrayList<Moneda> deposito;

    public DepositoVuelto() {
        deposito = new ArrayList();
    }

    public void add(Moneda vuelto) {
        deposito.add(vuelto);
    }

    public Moneda getVuelto() {
        if (deposito.isEmpty()) {
            return null;
        } else {
            Moneda vuelto = deposito.get(0);
            deposito.remove(0);
            return vuelto;
        }
    }
}
