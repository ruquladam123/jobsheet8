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
public class MAKINGSTAR_5 {
    public static void main (String [] args ){
        int sisiG;
        Scanner iyd = new Scanner(System.in);
        System.out.print("Masukan sisi jajaargenjang : ");
        sisiG = iyd.nextInt();
        
        for (int i = 0 ; i < sisiG ; i++){
            for (int j = sisiG ; j > i ; j--){
                
                System.out.print(" ");
            }
        for (int k = 0  ; k < sisiG ; k++ ){
            System.out.print(" * ");
    }
        System.out.println("");
        }
        
        
    }
    
}
