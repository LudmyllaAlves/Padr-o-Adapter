/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author tatia
 */
public class Banco extends Gratuito {
    
    private Gratuito clienteGratuito;
    private Basico clienteBasico;
    private Ultimate clienteUtimate;

    public Banco(Ultimate clienteUtimate) {
        
        this.clienteUtimate = clienteUtimate;
    }

    public Banco(Gratuito clienteGratuito) {
        this.clienteGratuito = clienteGratuito;
    }

    public Banco(Basico clienteBasico) {
        this.clienteBasico = clienteBasico;
    }
    
    public void criarClienteGratuito() {
        clienteGratuito.bdGratuito();
    }
    
    public void criarClienteBasico() {
        clienteBasico.bdBasico();
    }
    
    public void criarClienteUltimate() {
        clienteUtimate.bdUltimate();
    }
}
    

