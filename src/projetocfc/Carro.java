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
public class Carro extends Automovel {

    private int portas;
    Scanner dados = new Scanner(System.in);

    public Carro() {
        this.portas = 0;
    }

    public Carro(String placa, String cor, String modelo, int numCavalos, int numPneus, int numPortas) {
        super( modelo,cor, placa, numCavalos,numPneus);        
        this.portas = numPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Numero de Portas: " + this.portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor Instrutor) {
        this.Instrutor = Instrutor;
    }
    
    @Override
    public Carro inserir() {
        Automovel automovel =super.inserir();
        System.out.print("Digite o numero de portas: ");
        int numPortas = dados.nextInt();
        Carro carro = new Carro(automovel.getModelo(), automovel.getCor(),automovel.getPlaca() , automovel.getCavalos(), automovel.getPneus(), numPortas);

        return carro;
    }
}
