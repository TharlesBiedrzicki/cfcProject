/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocfc;
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
        
        
        endereço end = new endereço("rua",1223, "camaqua","rs");
   
        aluno Aluno = new aluno("AB","JOAO","1234656789","10/8/99", end);
        
        Aluno.exibirDados();
        
        
  
  
    Vector carros = new Vector();
    carros.add(new carro ("IAI1234", "Onix", "Branco", 4, 70, 4));
    carros.add(new carro ("IAE2345", "Gol", "cinza", 2, 65, 4));    

      for(int i=0; i<carros.size(); i++){
     carro c = (carro) carros.get(i);
     c.exibirDados();
}
    

}
}