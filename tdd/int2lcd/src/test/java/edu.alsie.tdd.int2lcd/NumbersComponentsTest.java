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
  public void testGetAleftLineNumberComponent() {
    NumbersComponents numbersComponents = new NumbersComponents();

    String result = numbersComponents.getLeftLine();

    Assert.assertEquals("|", result);
  }
}
