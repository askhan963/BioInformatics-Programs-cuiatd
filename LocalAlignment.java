package local.alignment;

import java.util.Scanner;

public class LocalAlignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sequence 1: ");
        String s1 = input.nextLine();
        System.out.print("Enter Sequence 2: ");
        String s2 = input.nextLine();
        System.out.print("Enter Gap: ");
        int gap = input.nextInt();
        System.out.print("Enter Match: ");
        int match = input.nextInt();
        System.out.print("Enter mismatch: ");
        int mismatch = input.nextInt();
        int diag = 0;
        int score_x = 0;
        int score_y = 0;
        int[][] ary = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            ary[i][0] = ary[i - 1][0] + gap;
        }
        for (int j = 1; j <= s2.length(); j++) {
            ary[0][j] = ary[0][j - 1] + gap;
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (ary[i - 1] == ary[j - 1]) {
                    diag = ary[i - 1][j - 1] + match;
                } else {
                    diag = ary[i - 1][j - 1] + mismatch;
                }
                score_x = ary[i][j - 1] + gap;
                score_y = ary[i - 1][j] + gap;
                ary[i][j] = Math.max(Math.max(diag, score_x), score_y);
            }
        }

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (ary[i][j] < 0) {
                    ary[i][j] = 0;
                }
            }
        }
        System.out.println("============================================");
        for (int i = 0; i < s1.length(); i++) {
            System.out.print("\t" + s1.charAt(i));
        }
        System.out.print("\t");
        for (int i = 0; i < s1.length(); i++) {

            if (i == 3) {
                for (int j = 0; j < s2.length(); j++) {
                    System.out.print("\n" + s2.charAt(j));
                    for (i = 0; i < s1.length(); i++) {
                        System.out.print("\t" + ary[j][i]);
                    }
                }
            }
        }
        System.out.println("\n============================================");
        System.out.println("============================================");
    }

}
