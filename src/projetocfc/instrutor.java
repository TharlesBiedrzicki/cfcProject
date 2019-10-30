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
public class instrutor extends pessoa{
    private String id;
    protected automovel auto;
 
    public instrutor(String id,String nome, String cpf, String nascimento) {
        this.id = id;
        this.nome = nome;
        this.CPF = cpf;
        this.nascimento = nascimento;    
    }
   public instrutor() {
        this.id = "";
        this.nome = "";
        this.CPF = "";
        this.nascimento = "";    
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public automovel getAuto() {
        return auto;
    }

    public void setAuto(automovel auto) {
        this.auto = auto;
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

    public endereço[] getEndereço() {
        return Endereço;
    }

    public void setEndereço(endereço[] Endereço) {
        this.Endereço = Endereço;
    }
    
  public void exibirDados(){
      System.out.println("nome: "+ this.getNome());
      System.out.println("codigo identificação: "+ this.getId());
      System.out.println("placa carro associado: "+this.auto.getPlaca());
  }  
    
}
