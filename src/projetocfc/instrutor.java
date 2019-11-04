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
    private String codID;
    protected automovel auto;
 
    public instrutor(String nome, String cpf, String nascimento, String codID) {
     super(nome, cpf, nascimento);
        this.codID = codID;  
    }
   public instrutor() {
        this.codID = "";
    }
    public String getId() {
        return codID;
    }

    public void setId(String codID) {
        this.codID = codID;
    }

    public automovel getAuto() {
        return auto;
    }

    public void setAuto(automovel auto) {
        this.auto = auto;
    }

@Override
  public void exibirDados(){
      System.out.println("nome: "+ this.getNome());
      System.out.println("codigo identificação: "+ this.getId());
      System.out.println("placa carro associado: "+this.auto.getPlaca());
  }  
    
}
