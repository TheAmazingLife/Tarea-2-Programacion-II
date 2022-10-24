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
        
        Moneda moneda1 = new Moneda1500();
        Expendedor expendedor1 = new expendedor1(3,1100);
        // bebida tipo 1: CocaCola
        // bebida tipo 2: Sprite
        // bebida tipo 3: Fanta
        Comprador comprador1 = new Comprador(moneda1, 1, expendedor1)
        
    }

}