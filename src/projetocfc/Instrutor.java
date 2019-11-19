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
public class Instrutor extends Pessoa{
    private String codID;
    protected Automovel auto;
 
    public Instrutor(String flag, String nome, String cpf, String nascimento, String codID, Endereco end, Automovel auto) {
     super(flag, nome, cpf, nascimento,end);
     this.auto = auto;
     this.codID = codID;  
    }
   public Instrutor() {
        this.codID = "";
    }
    public String getId() {
        return codID;
    }

    public void setId(String codID) {
        this.codID = codID;
    }

    public Automovel getAuto() {
        return auto;
    }

    public void setAuto(Automovel auto) {
        this.auto = auto;
    }

@Override
  public void exibirDados(){
      System.out.println("nome: "+ this.getNome());
      System.out.println("codigo identificação: "+ this.getId());
      System.out.println("placa carro associado: "+this.auto.getPlaca());
      System.out.println("modelo: "+ this.auto.getModelo());
      System.out.println(this.end.toString());
  }  
    
}
