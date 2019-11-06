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
public class Moto extends Automovel {
    private int numCilindradas;

        public Moto(){
        this.numCilindradas=0;
    }
    
    public Moto(String cor, String modelo, String placa, int numPneus,int numCavalos, int numCilindradas){
        super(modelo,cor,placa,numPneus,numCavalos);
        this.numCilindradas=numCilindradas;
    }
    
  @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero de Cilindradas: " + this.numCilindradas);
}

    public int getNumCilindradas() {
        return numCilindradas;
    }

    public void setNumCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }

}
