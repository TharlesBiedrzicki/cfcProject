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
public class atendente extends pessoa{
    private String turno;

        public atendente(String turno,String nome, String cpf, String nascimento) {
        this.turno = turno;
        this.nome = nome;
        this.CPF = cpf;
        this.nascimento = nascimento;
        }
        
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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
          System.out.println("turno: "+this.getTurno());
      }  
  
}
