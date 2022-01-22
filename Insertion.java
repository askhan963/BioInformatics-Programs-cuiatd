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
public class Insertion {
  public static void main(String[] args) {
         System.out.println("Enter Sequence : ");
        Scanner in= new Scanner(System.in);
        String s1 = in.nextLine();
        s1 = s1.toUpperCase();
        System.out.println("Enter sequence you want to Insert : ");
       String s2 = in.nextLine();
       s2 = s2.toUpperCase();
       System.out.println("Enter index at which Sequence is to be Entered: ");
       int index = in.nextInt();
      String newString = insertString(s1,s2,index);
      System.out.println("Original Sequence Was : "+s1);
      System.out.println("New String After Insertion: "+newString);
       
       
  }   
   public static String insertString(
        String originalString,
        String stringToBeInserted,
        int index)
    {
        String newString = new String();
  
        for (int i = 0; i < originalString.length(); i++) {
            newString += originalString.charAt(i);
            if (i == index) {
                newString += stringToBeInserted;
            }
        }
        return newString;
    }
}
