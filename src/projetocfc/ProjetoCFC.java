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
public class ProjetoCFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        aluno Aluno = new aluno("AB","JOAO","1234656789","10/8/99");
        
        
        System.out.println("dados: "+ Aluno.getNome());
    }
    
}
