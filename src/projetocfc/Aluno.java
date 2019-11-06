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
public class Aluno extends Pessoa{
    private String catHab;
    
     public Aluno(){
        this.catHab = "";
    }
       public Aluno(String nome, String cpf, String nascimento, String catHab, Endereco end) {
        super(nome, cpf, nascimento, end);
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
         System.out.println(end.toString());
  } 
     /**
     Scanner dados = new Scanner(System.in);
    public void inserir(){
        System.out.println("nome: ");
       String Nome = dados.next();
        System.out.println("CPF: ");
        String Cpf = dados.next();
        System.out.println("Nascimento(xx/xx/xxxx): ");
        String Nascimento = dados.next();
        System.out.println("categoria hablitação: ");
        String CatHab = dados.next();
        end.inserir();
    }
    **/
}
