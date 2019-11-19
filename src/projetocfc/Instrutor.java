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
public class Instrutor extends Pessoa{
    private String codID;
    protected Automovel auto;
       Vector<Pessoa> VectPerson = new Vector();
    Vector<Automovel> VectCar = new Vector();
 Scanner dados = new Scanner(System.in);
 
    public Instrutor(String flag, String nome, String cpf, String nascimento, String codID, Endereco end, Automovel auto) {
     super(flag, nome, cpf, nascimento,end);
     this.auto = auto;
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
  public void exibirDados(){
      System.out.println("nome: "+ this.getNome());
      System.out.println("codigo identificação: "+ this.getId());
      System.out.println("placa carro associado: "+this.auto.getPlaca());
      System.out.println("modelo: "+ this.auto.getModelo());
      System.out.println(this.end.toString());
  }  
      public void inserir(){
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
        endereco.inserir();
          System.out.println("Digite a placa do carro para este instrutor: ");
                          String  placa = dados.next();
                            for (int l = 0; l < VectCar.size(); l++) {
                                String placaVeic = VectCar.get(l).placa;
                                Automovel car = VectCar.get(l);
                                if (placaVeic.equals(placa)) {
                                    Instrutor inst = new Instrutor(flag, nome, CPF, nascimento, codID, end, car);
                                    VectPerson.add(inst);
                                }
    }
}
