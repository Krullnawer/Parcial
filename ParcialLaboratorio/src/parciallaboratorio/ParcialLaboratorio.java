/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallaboratorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class ParcialLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
        int valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el otro numero"));
        
        if(valor%2==0){
            System.out.println("Este numero es par: "+valor);
        }else{
            System.out.println("Este numero es impar: "+valor);
        }
        
        if(valor<valor2){
            System.out.println("Este primer valor es menor que el segundo " +valor +"<"+valor2);
        }else if(valor>valor2){
             System.out.println("Este primer valor es mayor que el segundo " +valor +">"+valor2);
        }else{
             System.out.println("los 2 valores son iguales " +valor +"="+valor2);
        }
               
        
    }
    
}
