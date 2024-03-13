// 1- Escreva um programa que faz a leitura de um numero inteiro e um numero real. Caso o numero inteiro seja menor do que o numero real, o programa deve imprimir uma mensagem dizendo 
//isso ao usuario. Caso contrario, o programa somente termina.

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        int numInteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um nÃºmero inteiro: "));
        double numReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um nÃºmero real: "));
        
        if (numInteiro < numReal) {
            JOptionPane.showMessageDialog(null, "O nÃºmero inteiro Ã© menor que o nÃºmero real.");
        }
    }
}
