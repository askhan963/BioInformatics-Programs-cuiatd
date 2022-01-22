/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Translation;

/**
 *
 * @author fa20-bcs-120
 */
import java.util.Scanner;
public class PCR {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
             System.out.println("Enter Sequence 1: ");
      
      String  s1 = in.nextLine();
         System.out.println("Enter sequence 2: ");
         String s2 = in.nextLine();
         String min="",max="";
         if(s1.length() < s2.length()){
             min = s1;
             max = s2;
         }
         else if(s2.length() < s1.length()){
             min = s2;
             max = s1;
         }
         String com_min="";
         min = min.toUpperCase();
         max = max.toUpperCase();
         for (int i = 0; i < min.length(); i++) {
           if(min.charAt(i)=='A'){
               com_min+="T";
           }
         else  if(min.charAt(i)=='T'){
               com_min+="A";
           }
           if(min.charAt(i)=='C'){
               com_min+="G";
           }
           if(min.charAt(i)=='G'){
               com_min+="C";
           }
       }
                  int f=0;
         for (int i = 0; i < max.length() - min.length(); i++) {
             if(max.substring(i, i+com_min.length()).equals(com_min)){
                 System.out.println("Found at index : "+i);
                 f++;
             }
             
         }
         if(f==0){
             System.out.println("No match found.");
         }
       }
   }    

