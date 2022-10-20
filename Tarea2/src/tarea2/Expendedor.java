package tarea2;

class Expendedor {

    private DepositoBebida cocacola;
    private DepositoBebida sprite;
    private DepositoBebida fanta;

    public Expendedor(int numBebidas, int precioBebidas) {
        cocacola = new DepositoBebida();
        sprite = new DepositoBebida();
        fanta = new DepositoBebida();

        for (int i = 0; i < numBebidas; i++) {
            Bebida cocacola = new CocaCola(100 + i);
            this.cocacola.addBebida(cocacola);
            Bebida spritee = new Sprite(200 + i);
            this.sprite.addBebida(spritee);
            Bebida fanta = new Fanta(300 + i);
            this.fanta.addBebida(fanta);
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if (m > precioBebidas()) {
        
        }
        Bebida bebida = null;
        switch (cual) {
            case 1:
                bebida = cocacola.getBebida();
                return bebida;
            case 2:
                bebida = sprite.getBebida();
                return bebida;
            case 3:
                bebida = fanta.getBebida();
                return bebida;
        }
        return null;
    }
}
