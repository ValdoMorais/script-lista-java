/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docentes;

import java.util.Scanner;

/**
 *
 * @author Yasmira
 */
public class Docentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        String lista []={"Dr. Belmiro","Dr. Vitorino","Dr. Micaela","Dr. Atija","Eng. Persson"};
        String [] cadeira = new String[lista.length];
        
        for (int i=0;i<lista.length; i++){
            System.out.println((1+i) + "-" + lista[i]);  
        }
        for (int i=0; i<cadeira.length; i++){
            System.out.println("Insira a Cadeira: ");
            cadeira[i] = myObj.nextLine(); 
        }
        for (int i = 0; i< lista.length; i++){
            
            System.out.println((1+i)+ "-" + lista[i] + "-"+ cadeira[i]);
        }
    }
    
}
