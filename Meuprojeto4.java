package com.mycompany.meuprojeto4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Meuprojeto4 {

    public static void main(String[] args) {
     String nome;  
    int L, result_A = 0, result_B = 0, A, idade, B = 0;    
    for (L=1; L<=50;L++) {
      //painel para digitar o nome
      nome = JOptionPane.showInputDialog("Digite o seu nome: ");
      //painel para digitar a idade      
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));    
      //painel para digitar a nota
      A = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 a 3 como você classifica o nosso atendimento, sendo: 1 - EXCELENTE, 2 - BOM ou 3 - RUIM. "));
      
      //if de contagem dos feedbacks positivos
        if (A ==1) {
           result_A += A; 
           JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback " +nome);
        }
        //if do feedback numero 2. Só foi utilizado para dar a mensagem ao usuario 
        else if (A ==2) {   
          JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback " +nome);
                    }
        //if do feedback numero 3. Nele foi necessario utilizar uma conta de divisão para chegar ao valor desejado
        else if (A ==3) {
            B += A;
            result_B = B / 3; 
            JOptionPane.showMessageDialog(null,"Obrigado pelo seu feedback " +nome);
        } 
        //else utilizado para dar uma mensagem de erro caso o usuario digitar um valor invalido
        else {
            JOptionPane.showMessageDialog(null,"ERRO: Digite uma nota válida.");
           }
        }
    //aqui eu utilizei um painel para dar o total de pessoas que deram feedbacks negativos e positivos
    JOptionPane.showMessageDialog(null, "Total de pessoas que deixaram um feedback positivo: "+result_A);
    JOptionPane.showMessageDialog(null, "Total de pessoas que deixaram um feedback negativo: "+result_B);
    }
}  
