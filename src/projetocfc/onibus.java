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
public class onibus extends automovel{
    private int lugares;
    
    public onibus(){
        this.lugares=0;
    }
    
    public onibus(String placa, String modelo, String cor,int codOnibus,int numCavalos, int numPneus, int lugares){
    super(cor,modelo,placa,numPneus,numCavalos);
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
