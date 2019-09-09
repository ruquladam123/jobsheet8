/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makingstar;

/**
 *
 * @author In your dream
 */
import java.util.Scanner;
public class star_3 {
    public static void main(String [] args){
        int tinggi;
        Scanner iyd = new Scanner (System.in);
        
        System.out.print("Masukan tinnginya Sloerrr : ");
        tinggi = iyd.nextInt();
        
        for(int a = 1 ; a <= tinggi ; a++){
            for (int b = tinggi ; b>=a ; b--){
                System.out.print(" ");
            }
            for (int  c = 1 ; c <= a ; c++ ){
                System.out.print("*");
            
        }
             System.out.println();
        
            
        }
       
        
    }
    
}
