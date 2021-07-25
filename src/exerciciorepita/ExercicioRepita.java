/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jazz
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int s=0;
        int i=0;
        int p=0, r=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: (valor 0 interrompe)</html>"));
            s = s + n;
            if(n>100){ 
                i++;
            }if(n%2==0){
                p++;
            }if(n%2==1){
                r++;
            }
        }while(n!=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado"+"<br>Somatorio: "+s+"<br>Valores acima de 100: "+i+"<br>Valores pares: "+p+"<br>Valores impares: "+r);
    }
    
}
