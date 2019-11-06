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
  Vector <Automovel> VectCar = new Vector();
  Vector <Pessoa> VectPerson = new Vector();
  
        Scanner dados = new Scanner(System.in);

        System.out.println("1-CADASTRAR VEICULO");
        System.out.println("2-CADASTRAR ALUNO");
        System.out.println("3-CADASTRAR FUNCIONARIO");
        int i = dados.nextInt();
        switch (i) {
            case 1:
                System.out.println("1-CARRO");
                System.out.println("2-MOTO");
                System.out.println("3-ONIBUS");
                int j = dados.nextInt();
         
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
                switch (j) {
                    case 1:
                   System.out.println("Nº portas: ");
                int portas = dados.nextInt();
                Carro car = new Carro(modelo, cor, placa, CVs,pneus, portas );
                VectCar.add(car);
                        break;
                    case 2:
                  System.out.println("Nº cilindradas: ");
                int cilindradas = dados.nextInt();
                Moto moto = new Moto(modelo, cor, placa, CVs,pneus,cilindradas );
                VectCar.add(moto);
                        break;
                    case 3:
                         System.out.println("Nº lugares: ");
                int lugares = dados.nextInt();
                Onibus bus = new Onibus(modelo, cor, placa, CVs,pneus, lugares );
                VectCar.add(bus);
                        break;
                }

                break;
            case 2:
        System.out.println("nome: ");
       String Nome = dados.next();
        System.out.println("CPF: ");
        String Cpf = dados.next();
        System.out.println("Nascimento(xx/xx/xxxx): ");
        String Nascimento = dados.next();
        System.out.println("categoria hablitação: ");
        String CatHab = dados.next();
        
        Endereco end = new Endereco();
        end.inserir();
        
        Aluno aluno =new Aluno(Nome, Cpf, Nascimento, CatHab,end);
        
                break;
            case 3:
                System.out.println("1-INSTRUTOR");
                System.out.println("2-ATENDENTE");
                  int k = dados.nextInt();
                switch (k) {
                    case 1:
         System.out.println("nome: ");
       String Nome = dados.next();
        System.out.println("CPF: ");
        String Cpf = dados.next();
        System.out.println("Nascimento(xx/xx/xxxx): ");
        String Nascimento = dados.next();
        System.out.println("Cod ID: ");
        String codID = dados.next();
        
        Endereco end = new Endereco();
        end.inserir();
                        break;
                    case 2:
                        
                        break;
                }
                break;
        }

        /**
         * Vector carros = new Vector(); carros.add(new Carro ("IAI1234",
         * "Onix", "Branco", 4, 70, 4)); carros.add(new Carro ("IAE2345", "Gol",
         * "cinza", 2, 65, 4)); * Carro c = (Carro) carros.get(0);
         *
         * System.out.println("nome: "); String Nome = dados.next();
         * System.out.println("CPF: "); String Cpf = dados.next();
         * System.out.println("Nascimento(xx/xx/xxxx): "); String Nascimento =
         * dados.next(); System.out.println("categoria hablitação: "); String
         * CatHab = dados.next(); Endereco end = new Endereco("rua",1223,
         * "camaqua","rs");
         *
         * Instrutor instru = new Instrutor
         * ("JOAO","1234656789","10/8/99","a12", end, c );
         *
         * instru.exibirDados();
         *
         *
         *
         */
    }
}
