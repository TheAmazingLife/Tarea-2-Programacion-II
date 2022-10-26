/*-------------------------------------------------------------------
                                     /~\
                                    |oo )
                                    _\=/_
                    ___        #   /  _  \
                   / ()\        \\//|/.\|\\
                 _|_____|_       \/  \_/  ||
                | | === | |         |\ /| ||
                |_|  O  |_|         \_ _/  #
                 ||  O  ||          | | |
                 ||__*__||          | | |
                |~ \___/ ~|         []|[]
                /=\ /=\ /=\         | | | 
________________[_]_[_]_[_]________/_]_[_\_________________________
 */
package tarea2;

public class Tarea2 {

    /* 
     * Para comprar bebidas:
     * bebida tipo 1: CocaCola
     * bebida tipo 2: Sprite
     * bebida tipo 3: Fanta
     */
    public static void main(String[] args) {
        
        Moneda mon1 = null;
        Expendedor exp1 = new Expendedor(10, 1200);
        Comprador pabloComprador = new Comprador(mon1, 1, exp1);
        System.out.println(pabloComprador.cuantoVuelto());
        System.out.println(pabloComprador.queBebiste()+"\n");

        Moneda mon2 = new Moneda100();
        Expendedor exp2 = new Expendedor(10, 1200);
        Comprador joaquinComprador = new Comprador(mon2, 1, exp2);
        System.out.println(joaquinComprador.cuantoVuelto());
        System.out.println(joaquinComprador.queBebiste()+"\n");

        Moneda mon3 = new Moneda1500();
        Expendedor exp3 = new Expendedor(0, 1200);
        Comprador geoffreyComprador = new Comprador(mon3, 1, exp3);
        System.out.println(geoffreyComprador.cuantoVuelto());
        System.out.println(geoffreyComprador.queBebiste()+"\n");

        Moneda mon4 = new Moneda1500();
        Expendedor exp4 = new Expendedor(10, 1200);
        Comprador lissetteComprador = new Comprador(mon4, 1, exp4);
        System.out.println(lissetteComprador.cuantoVuelto());
        System.out.println(lissetteComprador.queBebiste()+"\n");
    }

}
