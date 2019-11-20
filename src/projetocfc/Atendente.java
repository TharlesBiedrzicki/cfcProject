/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocfc;

import java.util.Scanner;

/**
 *
 * @author Tharles
 */
public class Atendente extends Pessoa {

    private String turno;
    private int codAtendente;
    Scanner dados = new Scanner(System.in);

    public Atendente() {
        this.codAtendente = 0;
        this.turno = "";

    }

    public Atendente(String flag, String nome, String cpf, String nascimento, String turno, int codAtendente, Endereco end) {
        super(flag, nome, cpf, nascimento, end);
        this.turno = turno;
        this.codAtendente = codAtendente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCodAtendente() {
        return codAtendente;
    }

    public void setCodAtendente(int codAtendente) {
        this.codAtendente = codAtendente;
    }

    @Override
    public void exibirDados() {
        System.out.println("nome: " + this.getNome());
        System.out.println("turno: " + this.getTurno());
        System.out.println("Codigo: " + this.getCodAtendente());
        System.out.println(this.end.toString());
    }

    public void inserir() {
        this.flag = "atendente";
        System.out.println("nome: ");
        this.nome = dados.next();
        System.out.println("CPF: ");
        this.CPF = dados.next();
        System.out.println("Nascimento(xx/xx/xxxx): ");
        this.nascimento = dados.next();
        System.out.println("Turno de trabalho: ");
        this.turno = dados.next();
        System.out.println("Cod ID atendente ");
        this.codAtendente = dados.nextInt();
        Endereco endereco = new Endereco();
        this.end=endereco.inserir();
    }

}
