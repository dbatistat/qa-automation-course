package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.exceptions.NumberComponentNotFounException;
import edu.alsie.tdd.int2lcd.numbercomponent.BlankNumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.BothCenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.CenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.LeftBottomLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightBottomLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightLineComponent;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description.
 *
 * @author David
 * @since 14/06/2018
 */
public class NumbersTest {

  @Test
  public void testGetNumberOne() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(1);

    Assert.assertEquals(BlankNumberComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberTwo() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(2);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightBottomLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(LeftBottomLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberThree() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(3);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightBottomLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightBottomLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberFour() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(4);

    Assert.assertEquals(BlankNumberComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(BothCenterLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberFive() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(5);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(LeftBottomLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightBottomLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberSix() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(6);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(LeftBottomLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(BothCenterLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberSeven() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(7);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberEight() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(8);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(BothCenterLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(BothCenterLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberNine() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    List<NumberComponent> oneComponents = numbers.getNumber(9);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(BothCenterLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightBottomLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test(expected = NumberComponentNotFounException.class)
  public void testGetOtherNumber() throws NumberComponentNotFounException {
    Numbers numbers = new Numbers();

    numbers.getNumber(10);
  }
}
