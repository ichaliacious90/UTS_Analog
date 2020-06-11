/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ADMIN
 */
public class uts1 {
    public static void main(String[] args) {
        int angka[] = {6,5,3,7,2,4};
        int i, j, tampung;
        
        for ( i = 1; i < angka.length; i++) {
            tampung = angka[i];
            j=i;
            while ((j>0) && angka[j-1]>tampung) {
                angka[j] = angka[j-1];
                j--;
            }
            angka[j]=tampung;
        }
        for (i = 0; i < angka.length; i++) {
            System.out.println(angka[i]+" ");   
            
        }
    }
    
}
