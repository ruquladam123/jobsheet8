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
public class makingstar6 {
    public static void main(String [] args){
        Scanner dam = new Scanner(System.in);
        int sisiJ;
        System.out.print("Masukan nilai sisi jajargenjang : ");
        sisiJ = dam.nextInt();
        
        for (int i = 1 ; i <= sisiJ ; i++  ){
            for (int j = sisiJ ; j >= i  ; j--){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ;  k++){
                System.out.print("*");
            }
            for (int l = 1 ; l <= i - 1 ; l++ ){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    
}
