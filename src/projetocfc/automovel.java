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
public class automovel implements tipo {
    protected instrutor Instrutor;
    
    public String placa;
    public String cor;
    public String modelo;

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
    
    public int cavalos(){
        return 1;
    }
    
      
    public int pneus(){
        return 1;
    }

   
     public automovel(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }
     public automovel() {
        this.placa = "";
        this.cor = "";
        this.modelo = "";
    }
 
    public int numPneus(){
        return 1;
    }
  
    public int numCavalos(){
        return 1;
    }    
    }

