package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class NumbersComponentsTest {

  @Test
  public void partOneTest() {
    NumbersComponents numbersComponents = new NumbersComponentes();

    String result = numbersComponents.getLeftLine();

    Assert.assertEquals("|", result);
  }
}
