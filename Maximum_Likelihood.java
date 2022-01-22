package maximum_likelihood;

import java.util.Scanner;

public class Maximum_Likelihood {

    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        Scanner input = new Scanner(System.in);
        int array[][] = new int[4][4];
        String x = "1234";
        String y = "ABCD";
        System.out.println("============Maximum Liklihood=========");
        System.out.println("======================================");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("At " + y.charAt(i) + " - " + x.charAt(j));
                array[i][j] = input.nextInt();
            }

        }

        System.out.print("\t");
        for (i = 0; i < 4; i++) {
            System.out.print(x.charAt(i) + "\t");
            if (i == 3) {
                for (j = 0; j < 4; j++) {
                    System.out.print("\n" + y.charAt(j));
                    for (i = 0; i < 4; i++) {
                        System.out.print("\t" + array[j][i]);
                    }

                }
            }
        }
        System.out.println("\n=====================================");
        System.out.println("=====================================");

    }
}
