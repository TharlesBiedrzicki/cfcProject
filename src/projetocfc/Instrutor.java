/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocfc;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Tharles
 */
public class Instrutor extends Pessoa {

    private String codID;
    protected Automovel auto;
    Scanner dados = new Scanner(System.in);

    public Instrutor(String flag, String nome, String cpf, String nascimento, String codID, Endereco end, Automovel auto) {
        super(flag, nome, cpf, nascimento, end);
        this.auto = auto;
        this.codID = codID;
    }

    public Instrutor(String flag, String nome, String cpf, String nascimento, String codID, Endereco end) {
        super(flag, nome, cpf, nascimento, end);
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
    public void exibirDados() {
        System.out.println("nome: " + this.getNome());
        System.out.println("codigo identificação: " + this.getId());
        System.out.println("carro associado: " + auto.getPlaca());
        System.out.println(this.end.toString());
    }

    public void inserir(Vector<Automovel> VectCar, Vector<Pessoa> VectPerson) {
        this.flag = "instrutor";
        System.out.println("nome: ");
        this.nome = dados.next();
        System.out.println("CPF: ");
        this.CPF = dados.next();
        System.out.println("Nascimento(xx/xx/xxxx): ");
        this.nascimento = dados.next();
        System.out.println("Cod ID instrutor ");
        this.codID = dados.next();

        Endereco endereco = new Endereco();
        this.end = endereco.inserir();
        System.out.println("Digite a placa do carro para este instrutor: ");
        String placa = dados.next();

        for (int i = 0; i < VectCar.size(); i++) {
            if(VectCar.get(i).getPlaca().equals(placa)){
                auto = VectCar.get(i);
                Instrutor inst = new Instrutor(flag, nome, CPF, nascimento, codID, end, auto);

            }
        }
    }
}
