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
public class jari {
    public static int ackermann(int m, int n) {
        if (m==0)return n+1;
        if (n==0)return ackermann(m-1,1);
            return ackermann(m-1, ackermann(m, n-1));
        
    }
    public static void main(String[] args) {
        int M=2;
        int N=1;
        System.out.println(ackermann(0, N));
    }
}
