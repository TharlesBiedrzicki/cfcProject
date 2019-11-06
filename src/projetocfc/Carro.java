/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocfc;

/**
 *
 * @author Tharles
 */
public class Carro extends Automovel{
    
    private int portas;
   
    public Carro(){
        this.portas=0;
    }
    
    public Carro(String placa, String modelo, String cor, int numCavalos, int numPneus, int numPortas){
        super(modelo,cor,placa,numPneus,numCavalos);
        this.portas=numPortas;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero de Portas: " + this.portas);
}
    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor Instrutor) {
        this.Instrutor = Instrutor;
    }  
}
