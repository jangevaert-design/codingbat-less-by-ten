package edu.cnm.deepdive;

/*

Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */

public class CodingBatLessByTen {

  public static void main(String[] args) {
    System.out.printf("With the ints %d, %d and %d the outcome is " + lessBy10(1, 7, 11) + ".\n",
        1, 7, 11);
    System.out.printf("With the ints %d, %d and %d the outcome is " + lessBy10(1, 7, 10) + ".\n",
        1, 7, 10);
    System.out.printf("With the ints %d, %d and %d the outcome is " + lessBy10(11, 1, 7) + ".\n",
        11, 1, 7);

  }

  public static boolean lessBy10(int a, int b, int c) {
    return (Math.abs(a -b) >= 10 || Math.abs(a -c) >= 10 || Math.abs(c -b) >= 10);
  }

}
