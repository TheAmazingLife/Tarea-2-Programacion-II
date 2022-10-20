/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

/**
 *
 * @author TheAmazingLife
 */
public class Comprador {
    protected Moneda m;
    protected int cualBebida;
    protected Expendedor exp;
    
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        this.m = m;
        this.cualBebida = cualBebida;
        this.exp = exp;
    }
    
    public int cuantoVuleto() { //da el vuelto
        
    }
    
    public String queBebiste() { //el sonido de la Bebida: cocacola, sprite, fanta
        
    }
}
