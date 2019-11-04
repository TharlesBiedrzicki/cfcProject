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
public class aluno extends pessoa{
    private String catHab;
    
     public aluno(){
        this.catHab = "";
    }
       public aluno(String nome, String cpf, String nascimento, String catHab) {
        super(nome, cpf, nascimento);
         this.catHab = catHab;
       }
       
    public String getCatHab() {
        return catHab;
    }

    public void setCatHab(String catHab) {
        this.catHab = catHab;
    }

    
    @Override
     public void exibirDados(){
         System.out.println("nome: "+this.getNome());
         System.out.println("categoria Habilitação: "+this.getCatHab());
         System.out.println("nascimento: "+this.getNascimento());
  }  
    
}
