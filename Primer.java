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
public class Primer {
     public static void main(String[] args) {
         System.out.println("Enter Sequence 1: ");
         Scanner in = new Scanner(System.in);
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
         int f=0;
         int a =0;
//         max = max.substring(1, 1+min.length());
//         System.out.println(max);
         for (int i = 0; i < max.length() ; i++) {
             a = max.indexOf(min, a);
//             if(max.substring(i, i+min.length()).equals(min)){
//                 System.out.println("Found at index : "+i);
//                 f++;
//             }
 if(a==-1){
        
             break;
         }
System.out.println(a);
a++;

             
         }
        if(a==-1){
            System.out.println("no found.");
        }
     
     }
     }
    

