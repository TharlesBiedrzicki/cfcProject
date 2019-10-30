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
    
       public aluno(String catHab,String nome, String cpf, String nascimento) {
        this.catHab = catHab;
        this.nome = nome;
        this.CPF = cpf;
        this.nascimento = nascimento;
        }

    public String getCatHab() {
        return catHab;
    }

    public void setCatHab(String catHab) {
        this.catHab = catHab;
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
         System.out.println("nome: "+this.getNome());
         System.out.println("categoria Habilitação: "+this.getCatHab());
         System.out.println("nascimento: "+this.getNascimento());
  }  
    
}
