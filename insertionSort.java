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
public class insertionSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] tabInt = {6,5,3,7,2,4};
        int i,j,data_sisip;
        
        for(i=1; i<6; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        for(i=0; i<6; i++){ 
            System.out.print(tabInt[i]+" ");
        }
    }
}