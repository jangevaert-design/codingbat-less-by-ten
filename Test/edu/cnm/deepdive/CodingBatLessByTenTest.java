package edu.cnm.deepdive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatLessByTenTest {

  private static int[][] lessByTenParams = {
      {1, 7, 11},
      {1, 7, 10},
      {11, 1, 7},
      {10, 7, 1},
      {10, 2, 2},
      {2, 11, 11},
      {3, 3, 30},
      {3, 3, 3},
      {10, 1, 11},
      {10, 11, 1},
      {10, 11, 2},
      {3, 30, 3},
      {2, 2, -8},
      {2, 8, 12}
  };

  private static boolean[] lessByTenExpected = {
  true,
  false,
  true,
  false,
  true,
  false,
  true,
  false,
  true,
  true,
  false,
  true,
  true,
  true
  };

  @Test
  void lessByTen() {
    for (int i = 0; i < lessByTenParams.length; i++) {
      boolean actual = CodingBatLessByTen.lessBy10(lessByTenParams[i][0], lessByTenParams[i][1],
          lessByTenParams[i][2]);
      Assertions.assertEquals(lessByTenExpected[i], actual);

    }
  }


}