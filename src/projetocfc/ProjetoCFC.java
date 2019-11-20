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

                    switch (j) {
                        case 1:
                            
                            Carro car = new Carro();
                            Carro carro = car.inserir();
                            VectCar.add(carro);
                            break;
                        case 2:

                            Moto moto = new Moto();
                            Moto bike = moto.inserir();
                            VectCar.add(bike);
                            break;
                        case 3:

                            Onibus bus = new Onibus();
                            Onibus onibus = bus.inserir();
                            VectCar.add(onibus);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("1-INSTRUTOR");
                    System.out.println("2-ATENDENTE");
                    System.out.println("3-ALUNO");
                    int k = dados.nextInt();
              
                    switch (k) {
                        case 1:
                           
                            Instrutor inst = new Instrutor();
                            inst.inserir(VectCar, VectPerson);
                            VectPerson.add(inst);
                            break;

                        case 2:
                          
                            Atendente atend = new Atendente();
                            atend.inserir();
                            VectPerson.add(atend);
                            break;

                        case 3:
                           
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
                        }).forEachOrdered((item) -> {
                            System.out.println("------------");
                        });
                    }
                    break;
                case 4:

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
