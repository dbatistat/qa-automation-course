package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.exceptions.NumberComponentNotFounException;
import edu.alsie.tdd.int2lcd.numbercomponent.BlankNumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.CenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.LeftLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightLineComponent;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public class NumbersWithValuesTest {

  @Test
  public void testGetNumberOneWidth3Height2() throws NumberComponentNotFounException {
    NumbersAbstract numbers = new NumbersWithValues(3, 2);

    List<NumberComponent> oneComponents = numbers.getNumber(1);

    Assert.assertEquals(BlankNumberComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(3).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(4).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(5).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(6).getClass());
  }

  @Test
  public void testGetNumberOneWidth1Height1() throws NumberComponentNotFounException {
    NumbersAbstract numbers = new NumbersWithValues(1, 1);

    List<NumberComponent> oneComponents = numbers.getNumber(1);

    Assert.assertEquals(BlankNumberComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
  }

  @Test
  public void testGetNumberTwoWidh3Height2() throws NumberComponentNotFounException {
    NumbersAbstract numbers = new NumbersWithValues(3, 2);

    List<NumberComponent> oneComponents = numbers.getNumber(2);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(3).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(4).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(5).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(6).getClass());
  }

  @Test
  public void testGetNumberTwoWidh3Height3() throws NumberComponentNotFounException {
    NumbersAbstract numbers = new NumbersWithValues(3, 3);

    List<NumberComponent> oneComponents = numbers.getNumber(2);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(2).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(3).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(4).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(5).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(6).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(7).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(8).getClass());
  }

  @Test
  public void testGetNumberTwoWidh1Height1() throws NumberComponentNotFounException {
    NumbersAbstract numbers = new NumbersWithValues(1, 1);

    List<NumberComponent> oneComponents = numbers.getNumber(2);

    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(0).getClass());
    Assert.assertEquals(RightLineComponent.class, oneComponents.get(1).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(3).getClass());
    Assert.assertEquals(LeftLineComponent.class, oneComponents.get(5).getClass());
    Assert.assertEquals(CenterLineComponent.class, oneComponents.get(6).getClass());
  }
}
