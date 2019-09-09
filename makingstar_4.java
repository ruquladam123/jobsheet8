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
public class makingstar_4 {
    public static void main(String [] args){
      int tinggi,b,a,c;
        Scanner iyd = new Scanner (System.in);
        
        System.out.print("Masukan tinnginya Sloerrr : ");
        tinggi = iyd.nextInt();
        
        for( a = tinggi ; a >= 1 ; a--){
            for ( b = tinggi ; b>a ; b--){
                System.out.print(" ");
            }
            for ( c = 1 ; c <= b ; c++ ){
                System.out.print("*");
            
        }
             System.out.println();
        
            
        }

        
    }
    
}
