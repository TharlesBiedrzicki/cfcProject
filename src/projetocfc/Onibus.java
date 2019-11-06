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
public class Onibus extends Automovel{
    private int lugares;
    
    public Onibus(){
        this.lugares=0;
    }
    
    public Onibus(String placa, String modelo, String cor,int numCavalos, int numPneus, int lugares){
    super(modelo,cor,placa,numPneus,numCavalos);
    this.lugares=lugares;
    }
    
    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

     @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero de Passageiros: " + this.lugares);
}
}
