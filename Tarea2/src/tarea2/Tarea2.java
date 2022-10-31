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

        /* 
        *   expendedor con:
        *   - una bebida de cada tipo
        *   - cada bebida se vende por $900 CLP
        */
        Expendedor exp1 = new Expendedor(1, 900);

        // compra con moneda de $1500 y realizada con exito, sabor bebida CocaCola (1) y Vuelto $600
        Moneda mon1 = new Moneda1500();
        System.out.println(mon1.toString());        
        Comprador joaquinComprador = new Comprador(mon1, 1, exp1);
        System.out.println("Vuelto: $" + joaquinComprador.cuantoVuelto());
        System.out.println("Sabor: " + joaquinComprador.queBebiste() + "\n");

        // compra con moneda de $1000 y realizada con exito, sabor bebida Sprite (2) y Vuelto $100
        Moneda mon2 = new Moneda1000();
        System.out.println(mon2.toString());
        Comprador pabloComprador = new Comprador(mon2, 2, exp1);
        System.out.println("Vuelto: $" + pabloComprador.cuantoVuelto());
        System.out.println("Sabor: " + pabloComprador.queBebiste() + "\n");

        // compra con moneda de $1500 y no realizada con exito, sabor bebida CocaCola (1) no disponible y Vuelto $1500 su moneda
        // retorno excepcion NoHayBebidaException
        Moneda mon3 = new Moneda1500();
        System.out.println(mon3.toString());
        Comprador lissetteComprador = new Comprador(mon3, 1, exp1);
        System.out.println("Vuelto: $" + lissetteComprador.cuantoVuelto());
        System.out.println("Sabor: " + lissetteComprador.queBebiste() + "\n");

        // compra con moneda de menor precio $500 y compra no realizada con exito, no puede comprar con moneda menor y Vuelto su moneda $500
        // retorno excepcion PagoIncorrectoException

        Moneda mon4 = new Moneda500();
        System.out.println(mon4.toString());
        Comprador EstebanComprador = new Comprador(mon4, 3, exp1);
        System.out.println("Vuelto: $" + EstebanComprador.cuantoVuelto());
        System.out.println("Sabor: " + EstebanComprador.queBebiste() + "\n");

        // compra sin moneda y no realizada con exito, no puede comprar con moneda nula y Vuelto su moneda nula
        // retorno excepcion PagoInsuficienteException

        Moneda mon5 = null;
        Comprador lukasComprador = new Comprador(mon5, 3, exp1);
        System.out.println("Vuelto: $" + lukasComprador.cuantoVuelto());
        System.out.println("Sabor: " + lukasComprador.queBebiste() + "\n");
    }

}
