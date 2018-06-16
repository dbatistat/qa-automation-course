package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.numbercomponent.NumbersComponents;
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

  @Test
  public void testGetAleftLineNumberWithBottonLineComponent() {
    NumbersComponents numbersComponents = new NumbersComponents();

    String result = numbersComponents.getLeftBottonLine();

    Assert.assertEquals("|_", result);
  }

  @Test
  public void testGetArightLineNumberWithBottonLineComponent() {
    NumbersComponents numbersComponents = new NumbersComponents();

    String result = numbersComponents.getRightBottonLine();

    Assert.assertEquals("_|", result);
  }

  @Test
  public void testGetBothLinesNumberWithBottonLineComponent() {
    NumbersComponents numbersComponents = new NumbersComponents();

    String result = numbersComponents.getBothBottonLine();

    Assert.assertEquals("|_|", result);
  }

  @Test
  public void testGetAcenterLineNumberComponent() {
    NumbersComponents numbersComponents = new NumbersComponents();

    String result = numbersComponents.getCenterLine();

    Assert.assertEquals("_", result);
  }
}
