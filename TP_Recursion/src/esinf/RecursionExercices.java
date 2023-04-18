/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;


/**
 *
 */
public class RecursionExercices {
    //TP1
    public static void process (Integer a[], int liminf, int limsup) {

        int i=liminf ; int j=limsup-1 ;
        while (i < j) {
            int temp=a[i] ;
            a[i]=a[j] ;
            a[j]=temp ; i++ ; j-- ;
        }
    }
    public static void example (Integer a[], int li, int ls)
    {
        if (li < ls) {
            process (a,li,ls);
            ls=ls/2;
            example (a,li,ls);
        }
    }
    
    /**
     *
     * @param m first parcel
     * @param n second parcel
     * @return the sum of the two parcels
     */
    public static int sum(int m, int n) {
        if (n > m)
            sum(m , n);
            if (n == 0)
                return m;
            return sum(m + 1, n - 1);
        }


    /**
     *
     * @param num number in decimal base
     * @return the number converted to binary base
     */
    public static String decimalToBinary(Integer num) {
        if(num == 0)
            return num.toString();

        int resto = num % 2;

        return decimalToBinary(num/2) + resto; //resto + decimalToBinary(valor da divisão)


    }
    
    /**
     *
     * @param d number to check
     * @return true if the number is a prime, false otherwise
     */
    public static boolean isPrime(int d) {
        return isPrime(d,2);
    }

    private static boolean isPrime(int d, int i) {
        if(d < i){
            return false;
        }
        if(i == d){
            return true;
        }
        if(d % i == 0){
            return false;
        }
        return isPrime(d, i +1);
    }
    
    /**
     *
     * @param word word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 2));
        System.out.println(decimalToBinary(6));
        System.out.println(isPrime(4));

    }
}
