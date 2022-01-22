/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Translation;

import java.util.Scanner;

/**
 *
 * @author hyperlink
 */
public class NewClass {
    public static void main(String[] args) {
        double  ary [][]= new double [3][3];
        String s = "ABC";
       ary[1][0]= 12;
       ary[2][0]= 113;
       ary[2][1]= 203;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ary[i][j]+"\t");
            }
            System.out.println("");
        }
        double ary1 [][] =new double[2][2];
        System.out.println("");
        ary1[1][0]=(ary[1][0]+ary[2][0])/2;
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ary1[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
