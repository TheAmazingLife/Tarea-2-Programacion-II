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

    public static void main(String[] args) {
        Moneda mon1 = new Moneda1500();
        Expendedor exp = new Expendedor(10, 1200);
        /* bebida tipo 1: CocaCola
        bebida tipo 2: Sprite
        bebida tipo 3: Fanta */
        Comprador pabloComprador = new Comprador(mon1, 1, exp);
        System.out.println(pabloComprador.cuantoVuelto());
        System.out.println(pabloComprador.queBebiste());
    }

}
