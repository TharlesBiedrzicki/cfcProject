package projetocfc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tharles
 */
public class endereço {
private String logradouro;
private int numero;
private String cidade;
private String estado;

    public endereço(String logradouro, int numero, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public endereço() {
        this.logradouro = "";
        this.numero = 0;
        this.cidade ="";
        this.estado = "";
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
  public String toString(){
        return ("Rua: "+ this.getLogradouro()+" numero: "+this.getNumero()+" cidade: "+ this.getCidade());
     
  }  
}

