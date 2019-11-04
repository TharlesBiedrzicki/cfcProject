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
public class carro extends automovel{
    
    private int portas;

    public carro(){
        this.portas=0;
    }
    
    public carro(String placa, String modelo, String cor,int numPortas, int numCavalos, int numPneus){
        super(placa,modelo,cor,numPneus,numCavalos);
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

    public instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(instrutor Instrutor) {
        this.Instrutor = Instrutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
