package io.github.girirajvyas.coursera.algorithmictoolbox.week1;

import org.junit.Assert;
import org.junit.Test;
import io.github.girirajvyas.coursera.algorithmictoolbox.week1.SumOfTwoDigits;

public class SumOfTwoDigitsTest {

  @Test
  public void sumTest() {
    Integer firstDigit = 1;
    Integer secondDigit = 2;
    
    Integer sum = SumOfTwoDigits.sum(firstDigit, secondDigit);
    Assert.assertEquals(3, sum.intValue());
  }
  
  
}
