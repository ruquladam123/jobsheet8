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
public class star_2 {
    public  static void main(String [] args){
        int tinggi;
        Scanner iyd = new Scanner(System.in);
        
        System.out.print("Masukan nilai tinggi segitiga : ");
        tinggi = iyd.nextInt();
        for (int a = 1 ; a<= tinggi; a ++){
            for (int b = tinggi ;  b <= a ; b++){
                
                System.out.print("*");
            }
            System.out.println("");
            
        }
    }
    
}
