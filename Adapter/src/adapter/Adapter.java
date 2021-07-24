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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        {
        Gratuito clienteGratuito = new Gratuito();
        Banco ContaGratuita = new Banco(clienteGratuito);
        ContaGratuita.criarClienteGratuito();
        
        Basico clientBasico = new Basico();
        Banco ContaBasica = new Banco(clientBasico);
        ContaBasica.criarClienteBasico();
        
        Ultimate clienteUltimate = new Ultimate();
        Banco ContaUltimate = new Banco(clienteUltimate);
        ContaUltimate.criarClienteUltimate();

    }
    
    }
}
    

