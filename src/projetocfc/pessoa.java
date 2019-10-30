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
    protected endereço Endereço[];

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
    
    public abstract void exibirDados();

    
}
