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
public class Automovel implements tipo {

    protected Instrutor Instrutor;
    String placa;
    String cor;
    String modelo;
    private int cavalos;
    private int pneus;
    Scanner dados = new Scanner(System.in);

    public Automovel(String placa, String cor, String modelo, int numCavalos, int numPneus) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.cavalos = numCavalos;
        this.pneus = numPneus;
    }

    public Automovel() {
        this.placa = "";
        this.cor = "";
        this.modelo = "";
        this.cavalos = 0;
        this.pneus = 0;

    }

    public Automovel(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public Instrutor getInstrutor() {
        return Instrutor;
    }

    public void setInstrutor(Instrutor Instrutor) {
        this.Instrutor = Instrutor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    @Override
    public void NumPneus(int numPneus) {
        System.out.println("Número de Pneus : " + numPneus);
    }

    @Override
    public void NumCV(int numCavalos) {
        System.out.println("Número de Cavalos : " + numCavalos);
    }

    public void exibirDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        NumCV(this.cavalos);
        NumPneus(this.pneus);
    }

    public Automovel inserir() {
        System.out.print("Digite a cor: ");
        String cor = dados.next();
        System.out.print("Digite a placa: ");
        String placa = dados.next();
        System.out.print("Digite o modelo: ");
        String modelo = dados.next();
        System.out.println("Nº CV's: ");
        int CVs = dados.nextInt();
        System.out.println("Nº Pneus: ");
        int pneus = dados.nextInt();
        Automovel auto = new Automovel(placa, cor, modelo, CVs, pneus);

        return auto;
    }
}
