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
public abstract class pessoa {
    protected String nome;
    protected String nascimento;
    protected String CPF;
    protected endereço end;
    
  public pessoa(){
      this.nome = "";
      this.CPF = "00.000.000-00";
      this.nascimento = "00/00/0000";
      this.end = null ;
  }
  
   public pessoa(String nome, String CPF, String nascimento, endereço end){
      this.nome = nome;
      this.CPF = CPF;
      this.nascimento = nascimento;
      this.end = end;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public abstract void exibirDados();

    
}
