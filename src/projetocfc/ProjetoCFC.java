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
public class ProjetoCFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Automovel> VectCar = new Vector();
        Vector<Pessoa> VectPerson = new Vector();
        int i;
        String flag;
        Scanner dados = new Scanner(System.in);
        do {
            System.out.println("1-CADASTRAR VEICULO");
            System.out.println("2-CADASTRAR PESSOAS");
            System.out.println("3-LISTAR VEICULOS");
            System.out.println("4-LISTAR PESSOAS");
            System.out.println("0-SAIR");
            i = dados.nextInt();
            switch (i) {
                case 1:
                    System.out.println("1-CARRO");
                    System.out.println("2-MOTO");
                    System.out.println("3-ONIBUS");
                    int j = dados.nextInt();
/**
                    System.out.println("Modelo: ");
                    String modelo = dados.next();
                    System.out.println("Cor: ");
                    String cor = dados.next();
                    System.out.println("Placa: ");
                    String placa = dados.next();
                    System.out.println("Nº CV's: ");
                    int CVs = dados.nextInt();
                    System.out.println("Nº Pneus: ");
                    int pneus = dados.nextInt();
                  **/
                    
                    switch (j) {
                        case 1:
                            /**
                            System.out.println("Nº portas: ");
                            int portas = dados.nextInt();
                            Carro car = new Carro(modelo, cor, placa, CVs, pneus, portas);
                            **/
                            Carro car = new Carro();
                            car.inserir();
                            VectCar.add(car);
                            break;
                        case 2:
                            /**
                            System.out.println("Nº cilindradas: ");
                            int cilindradas = dados.nextInt();
                            Moto moto = new Moto(modelo, cor, placa, CVs, pneus, cilindradas);
                            **/
                            Moto moto = new Moto();
                            moto.inserir();
                            VectCar.add(moto);
                            break;
                        case 3:
                            /**
                            System.out.println("Nº lugares: ");
                            int lugares = dados.nextInt();
                            Onibus bus = new Onibus(modelo, cor, placa, CVs, pneus, lugares);
                            **/
                            Onibus bus = new Onibus();
                            bus.inserir();
                            VectCar.add(bus);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("1-INSTRUTOR");
                    System.out.println("2-ATENDENTE");
                    System.out.println("3-ALUNO");
                    int k = dados.nextInt();
/**
                    System.out.println("#DADOS BASICOS#");
                    System.out.println("nome: ");
                    String Nome = dados.next();
                    System.out.println("CPF: ");
                    String Cpf = dados.next();
                    System.out.println("Nascimento(xx/xx/xxxx): ");
                    String Nascimento = dados.next();
                    System.out.println("-----------------");
                    Endereco end = new Endereco();
                    end.inserir();
                    **/
                    switch (k) {
                        case 1:
                            /**
                            flag = "instrutor";
                            System.out.println("#DADOS EXCLUSIVOS#");
                            System.out.println("Cod ID instrutor: ");
                            String codID = dados.next();
                            System.out.println("Digite a placa do carro para este instrutor: ");
                            placa = dados.next();
                            //int i = 0;
                            for (int l = 0; l < VectCar.size(); l++) {
                                String placaVeic = VectCar.get(l).placa;
                                Automovel car = VectCar.get(l);
                                if (placaVeic.equals(placa)) {
                                    Instrutor inst = new Instrutor(flag, Nome, Cpf, Nascimento, codID, end, car);
                                    VectPerson.add(inst);
                                }
                            }
                               **/
                             Instrutor inst = new Instrutor();
                             inst.inserir();
                                    VectPerson.add(inst);
                            break;

                        case 2:
                  /**          flag = "atendente";
                            System.out.println("Turno de trabalho: ");
                            String turno = dados.next();
                            System.out.println("Cod ID atendente ");
                            int codAtendente = dados.nextInt();

                            Atendente atend = new Atendente(flag, Nome, Cpf, Nascimento, turno, codAtendente, end);
                     **/ 
                            Atendente atend = new Atendente();
                            atend.inserir();
                            VectPerson.add(atend);
                            break;

                        case 3:
                            /**
                            flag = "aluno";
                            System.out.println("categoria hablitação: ");
                            String CatHab = dados.next();
                            Aluno aluno = new Aluno(flag, Nome, Cpf, Nascimento, CatHab, end);
                            **/
                             Aluno aluno = new Aluno();
                             aluno.inserir();
                            VectPerson.add(aluno);
                            break;
                    }
                case 3:

                    if (VectCar.isEmpty() == true) {
                        System.out.println("nenhum veiculo cadastrado");
                    } else {
                        VectCar.stream().map((vector) -> {
                            vector.exibirDados();
                            return vector;
                        }).forEachOrdered((_item) -> {
                            System.out.println("------------");
                        });
                    }
                    break;
                case 4:
                    /**
                     * if (VectPerson.isEmpty() == true) {
                     * System.out.println("nenhuma pessoa cadastrada"); } else {
                     * for (Pessoa vector : VectPerson) { vector.exibirDados();
                     * System.out.println("------------"); }
                    *
                     */

                    System.out.println("1-LISTAR INSTRUTOR");
                    System.out.println("2-LISTAR ATENDENTE");
                    System.out.println("3-LISTAR ALUNO");
                    int m = dados.nextInt();

                    switch (m) {

                        case 1:
                            for (Pessoa vector : VectPerson) {
                                if ("instrutor".equals(vector.getFlag())) {
                                    vector.exibirDados();
                                    System.out.println("------------");
                                }
                            }
                            
                            break;

                        case 2:
                            VectPerson.forEach((vector) -> {
                                if ("atendente".equals(vector.getFlag())) {
                                    vector.exibirDados();
                                    System.out.println("------------");
                                } 
                            });
                            break;

                        case 3:
                            VectPerson.forEach((vector) -> {
                                if ("aluno".equals(vector.getFlag())) {
                                    vector.exibirDados();
                                    System.out.println("------------");
                                } 
                            });
                            break;

                    }
            }
        } while (i != 0);
    }
}
