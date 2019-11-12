package projetocfc;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tharles
 */
public class Endereco {
private String logradouro;
private int numero;
private String cidade;
private String estado;

    public Endereco(String logradouro, int numero, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public Endereco() {
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
    
@Override
  public String toString(){
        return ("Rua: "+ this.getLogradouro()+" numero: "+this.getNumero()+" cidade: "+ this.getCidade());
     
  }  

 
  public void inserir(){
       Scanner dados = new Scanner(System.in);
       System.out.println("#ENDEREÇO#");
      System.out.println("rua: ");
      String rua = dados.next();
      System.out.println("numero: ");
      int num = dados.nextInt();
      System.out.println("cidade: ");
      String city = dados.next();
      System.out.println("estado: ");
      String state = dados.next();
      Endereco end = new Endereco(rua, num, city, state );
      System.out.println("---------------------");
  }

}

