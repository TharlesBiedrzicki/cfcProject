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
public class Automovel implements tipo {

    protected Instrutor Instrutor;
    String placa;
    private String cor;
    private String modelo;
    private int cavalos;
    private int pneus;

       
     public Automovel(String placa, String cor, String modelo, int numCavalos, int numPneus) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
          this.cavalos=numCavalos;
        this.pneus=numPneus;
    }
     public Automovel() {
        this.placa = "";
        this.cor = "";
        this.modelo = "";
        this.cavalos=0;
        this.pneus=0;

     }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor Instrutor) {
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
    
    @Override
    public void NumPneus(int numPneus) {
        System.out.println("Número de Pneus : "+numPneus);
    }

    @Override
    public void NumCV(int numCavalos) {
        System.out.println("Número de Cavalos : "+numCavalos);
    }
    
    public void exibirDados(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Cor: "+ this.cor);
        NumCV(this.cavalos);
        NumPneus(this.pneus);
    }
    }

