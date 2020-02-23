package io.github.girirajvyas.coursera.algorithmictoolbox.week1;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MaxPairwiseProductTest {

  int[] numbers = {1, 2, 3, 4, 5};
  long[] numbers2 = {3000000, 400000};
  long[] numbers3 = {1000, 900};
  @Before
  public void setup() {

  }

  @Test
  public void findPairWithMaxProductNaiveTest() {
    int maxProductNaive = MaxPairwiseProduct.findPairWithMaxProductNaive(numbers);
    assertEquals(20, maxProductNaive);
  }

  @Test
  public void findPairWithMaxProductWithCorrectDataTypeTest() {
    long maxProductNaive = MaxPairwiseProduct.findPairWithMaxProductWithCorrectDataType(numbers2);
    assertEquals(1200000000000l, maxProductNaive);
  }

  @Test
  public void findPairWithMaxProductWithCorrectDataTypeFastTest() {
    long maxProductNaive = MaxPairwiseProduct.findPairWithMaxProductWithCorrectDataTypeFast(numbers3);
    assertEquals(900000, maxProductNaive);
  }

}
