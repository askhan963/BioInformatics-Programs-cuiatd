/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Translation;

import java.util.Scanner;

/**
 *
 * @author fa20-bcs-120
 */
public class LowerToUper {
    public static void main(String[] args) {
             System.out.println("Enter RNA/DNA : ");
        Scanner in= new Scanner(System.in);
        String rna = in.nextLine();
        rna = rna.toUpperCase();
        System.out.println("RNA/DNA In upper case : "+rna);
    }
}
