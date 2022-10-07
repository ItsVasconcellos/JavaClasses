/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5_exercise3;

/**
 *
 * @author Fernando
 */
public class CompareNumbers {
    private int a, b, c, d,e;
    public static int compareTwo(int a, int b){
        int x = Math.max(a,b);
        return x;
    }
    public static int compareThree(int a, int b,int c){
        int x = Math.max(a,b);
        return Math.max(x,c);
    }
    public static int compareFour(int a, int b,int c, int d){
        int x = Math.max(a,b);
        int y = Math.max(c, d);
        return Math.max(x,y);
    }
    public static int compareFive(int a, int b, int c, int d, int e){
        int x = Math.max(a,b);
        int y = Math.max(c, d);
        int z = Math.max(x,y);
        return z;
    }
}
