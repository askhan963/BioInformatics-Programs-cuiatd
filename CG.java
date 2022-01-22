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
public class CG {
        public static void main(String[] args) {
            int cg=0;
        double cgper;
        System.out.println("Enter RNA/RNA : ");
        Scanner in= new Scanner(System.in);
        String rna = in.nextLine();
        rna = rna.toUpperCase();
          for (int i = 0; i < rna.length() -1; i++) {
            if(rna.charAt(i)=='C' && rna.charAt(i+1)=='G'){
                cg++;
            }  
        }
            System.out.println("Number CGs Are: "+cg);
             cgper = cg;
            cgper = (double)100*(cgper/rna.length());
            System.out.println("CG % is : "+cgper);
            
        
        }
    
}
