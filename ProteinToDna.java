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
public class ProteinToDna {
 public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       System.out.println("Enter Protein Sequence: ");
     String pro = in.nextLine();
     pro = pro.toUpperCase();
     String rna = proToDna(pro);
     System.out.println("RNA to Protein sequence is: "+rna);
     
 }    
 public static String proToDna(String pro){
     String dna="";
     for (int i = 0; i < pro.length(); i++) {
         if(pro.charAt(i)=='F'){
             dna+="UUU";
         }
         else  if(pro.charAt(i)=='L'){
              dna+="UUA";
         }
           else  if(pro.charAt(i)=='I'){
              dna+="AUU";
         }
             else  if(pro.charAt(i)=='M'){
              dna+="AUG";
         }
              else   if(pro.charAt(i)=='V'){
              dna+="GUU";
         }
                else   if(pro.charAt(i)=='S'){
              dna+="UCU";
         }
                   else  if(pro.charAt(i)=='P'){
              dna+="CCU";
         }
                     else  if(pro.charAt(i)=='T'){
              dna+="ACU";
         }
                       else  if(pro.charAt(i)=='A'){
              dna+="GCU";
         }
                         else  if(pro.charAt(i)=='Y'){
              dna+="UAG";
         }
                         else    if(pro.charAt(i)=='*'){
              dna+="UAA";
         }
                           else    if(pro.charAt(i)=='H'){
              dna+="CAU";
         }
                           else      if(pro.charAt(i)=='Q'){
              dna+="CAA";
         }
                                    else      if(pro.charAt(i)=='N'){
              dna+="AAU";
         }
                                    else      if(pro.charAt(i)=='K'){
              dna+="AAA";
         }
                                    else      if(pro.charAt(i)=='D'){
              dna+="GAU";
         }
                                    else      if(pro.charAt(i)=='E'){
              dna+="GAA";
         }
                                    else      if(pro.charAt(i)=='C'){
              dna+="UGU";
         }
                                    else      if(pro.charAt(i)=='W'){
              dna+="UGG";
         }
                                    else      if(pro.charAt(i)=='R'){
              dna+="CGU";
         }
                                    else      if(pro.charAt(i)=='G'){
              dna+="GGU";
         }
     }
     return dna;
 }
}
