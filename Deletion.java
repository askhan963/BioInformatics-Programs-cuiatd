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
public class Deletion {
 public static void main(String[] args) {
              System.out.println("Enter Sequence : ");
        Scanner in= new Scanner(System.in);
        String s1 = in.nextLine();
        s1 = s1.toUpperCase();
        System.out.println("Enter sequence you want to Delete : ");
       String s2 = in.nextLine();
       s2 = s2.toUpperCase();
    String min = s2,max =s1;
    String newString = delete(max,min);
     System.out.println("Original Sequence : "+s1);
     System.out.println("After Deletion "+newString);
     
      
 } 
 public static String delete(String max,String min){
           StringBuffer sbf = new StringBuffer();
           sbf = sbf.append(max);
           
        int f=0;
         for (int i = 0; i < max.length() - min.length(); i++) {
             if(max.substring(i, i+min.length()).equals(min)){
              sbf = sbf.delete(i, i+(min.length()));
                 f++;
             }
             
         }
         if(f==0){
             System.out.println("No match found.");
            
         }
     return sbf.toString();
 }
}
