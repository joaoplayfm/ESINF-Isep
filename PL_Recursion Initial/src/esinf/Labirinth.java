/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

/**
 *
 * @author nunotmalheiro
 */
public class Labirinth {
    
    /**
     *
     * @param actual the labirinth in its actual (marked) form 
     * @param y coordinate y in the labirinth
     * @param x coordinate x in the labirinth
     * @return the marked labirinth or null if there is no way
     */
    public static int [][] check(int [][] actual, int y, int x) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String retrunString(String word) {
        if(word.length() == 0) return "";
        return word.charAt(0) + retrunString(word.substring(1));
    }

    public static String invertString(String word) {
        if(word.length() == 0) return "";
        return word.charAt(word.length() - 1) + invertString(word.substring(0, word.length() - 1));
    }


    public static boolean isPalindrome(String word) {
        if(word.length() < 2) return true;
        if(word.charAt(0) != word.charAt(word.length() - 1 )) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static boolean isPalindromeWithNumbers(int number) {
        if(number < 10) return true;
        return number == resverseNumber(number, 0);
    }


    public static int resverseNumber(int initNumber, int reverseNumber) {
        if(initNumber <= 0) return reverseNumber;
        int lastDigit = initNumber % 10;
        reverseNumber = (reverseNumber * 10) + lastDigit;
        return resverseNumber(initNumber / 10, reverseNumber);
    }

    public static int greatestCommonDivisor(int maior, int menor) {
        int resto = maior % menor;
        if(resto == 0) return menor;
        return greatestCommonDivisor(menor, resto);
    }

    public static int[][] findRoute(int[][] map, int x, int y) {

        // Place 9 on Arrival
        map[y][x] = 9;

        //printMatrix(map);
        //System.out.println("----------------------------------------------------");

        // Winning Condition
        if(y == map.length -1 && x == map[y].length - 1) {
            return map;
        }

        // Go TOP
        if(y - 1 >= 0 && map[y - 1][x] == 1) {
            if(findRoute(map, x, y - 1) != null) return map;
        }

        // Go RIGHT
        if(x + 1 < map[y].length && map[y][x + 1] == 1) {
            if(findRoute(map, x + 1, y) != null) return map;
        }

        // Go BOTTOM
        if(y + 1 < map.length && map[y + 1][x] == 1) {
            if(findRoute(map, x, y + 1) != null) return map;
        }

        // Go LEFT
        if(x - 1 >= 0 && map[y][x - 1] == 1) {
            if(findRoute(map, x - 1, y) != null) return map;
        }

        // Back-tracking
        map[y][x] = 2;
        return null;
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("---- 1a ----");
        String word = retrunString("ISEP");
        System.out.println(word);
        System.out.println("---- 1b ----");
        String word2 = invertString("ISEP");
        System.out.println(word2);
        System.out.println("---- 2 ----");
        System.out.println(isPalindromeWithNumbers(22));
        System.out.println("---- 3 ----");
        int number = greatestCommonDivisor(99, 37);
        System.out.println(number);
        System.out.println("---- 4 ----");
        int[][] map = {
                { 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 },
                { 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };
        int[][] discoveredMap = findRoute(map, 0, 0);
        printMatrix(discoveredMap);
    }

}
