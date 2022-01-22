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
public class ProteinToRna {
     public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       System.out.println("Enter Protein Sequence: ");
     String pro = in.nextLine();
     pro = pro.toUpperCase();
     String rna = proToDna(pro);
     System.out.println("DNA of Protein sequence is: "+rna);
     
 }    
 public static String proToDna(String pro){
     String dna="";
     for (int i = 0; i < pro.length(); i++) {
         if(pro.charAt(i)=='F'){
             dna+="TTT";
         }
         else  if(pro.charAt(i)=='L'){
              dna+="TTA";
         }
           else  if(pro.charAt(i)=='I'){
              dna+="ATT";
         }
             else  if(pro.charAt(i)=='M'){
              dna+="ATG";
         }
              else   if(pro.charAt(i)=='V'){
              dna+="GTT";
         }
                else   if(pro.charAt(i)=='S'){
              dna+="TCT";
         }
                   else  if(pro.charAt(i)=='P'){
              dna+="CCT";
         }
                     else  if(pro.charAt(i)=='T'){
              dna+="ACT";
         }
                       else  if(pro.charAt(i)=='A'){
              dna+="GCT";
         }
                         else  if(pro.charAt(i)=='Y'){
              dna+="TAG";
         }
                         else    if(pro.charAt(i)=='*'){
              dna+="TAA";
         }
                           else    if(pro.charAt(i)=='H'){
              dna+="CAT";
         }
                           else      if(pro.charAt(i)=='Q'){
              dna+="CAA";
         }
                                    else      if(pro.charAt(i)=='N'){
              dna+="AAT";
         }
                                    else      if(pro.charAt(i)=='K'){
              dna+="AAA";
         }
                                    else      if(pro.charAt(i)=='D'){
              dna+="GAT";
         }
                                    else      if(pro.charAt(i)=='E'){
              dna+="GAA";
         }
                                    else      if(pro.charAt(i)=='C'){
              dna+="TGT";
         }
                                    else      if(pro.charAt(i)=='W'){
              dna+="TGG";
         }
                                    else      if(pro.charAt(i)=='R'){
              dna+="CGT";
         }
                                    else      if(pro.charAt(i)=='G'){
              dna+="GGT";
         }
     }
     return dna;
 }
}
