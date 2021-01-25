
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JFernandes
 */
public class Soma {
    /*public static void main(String[] args) {
           // ao invés de 
           int a;
           a = 10;
           use //
           int a = 10;
           int b = 20;
           System.out.println(a + b);        
    } */
    
    /*public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(null, "Entre com um int: ");
        System.out.println(valor1);
        int a = Integer.parseInt(valor1);
        String valor2 = JOptionPane.showInputDialog(null, "Entre com um int: ");
        int b = Integer.parseInt(valor2);
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma é " + soma);
        
    }*/
    
    
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Entre com um int: ");
        int a = Integer.parseInt(valor);
        valor = JOptionPane.showInputDialog(null, "Entre com um int: ");
        int b = Integer.parseInt(valor);       
        JOptionPane.showMessageDialog(null, "O valor da soma é " + (a + b));
        
    }
    
}
