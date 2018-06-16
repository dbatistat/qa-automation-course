package edu.alsie.tdd.int2lcd;

import edu.alsie.tdd.int2lcd.numbercomponent.BlankNumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.BothLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.CenterLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.LeftLineComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.NumberComponent;
import edu.alsie.tdd.int2lcd.numbercomponent.RightLineComponent;
import java.util.ArrayList;
import java.util.List;

/**
 * Description.
 *
 * @author David
 * @since 15/06/2018
 */
public final class NumbersWithValues extends NumbersAbstract {

  public NumbersWithValues(int witdh, int height) {
    this.witdh = witdh;
    this.height = height;
  }

  @Override
  protected List<NumberComponent> getOne() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new BlankNumberComponent(witdh));
    components.add(new RightLineComponent(witdh));
    components.add(new RightLineComponent(witdh));

    for(int i = 1; i <= height * 2; i++) {
      components.add(new RightLineComponent(witdh));
    }
    return components;
  }

  @Override
  protected List<NumberComponent> getTwo() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new LeftLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getThree() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getFour() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new BlankNumberComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new BothLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new RightLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getFive() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new LeftLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getSix() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new LeftLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new BothLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getSeven() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    components.add(new RightLineComponent(witdh));
    components.add(new RightLineComponent(witdh));

    for(int i = 1; i <= height * 2; i++) {
      components.add(new RightLineComponent(witdh));
    }
    return components;
  }

  @Override
  protected List<NumberComponent> getEight() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new BothLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new BothLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }

  @Override
  protected List<NumberComponent> getNine() {
    List<NumberComponent> components = new ArrayList<>(0);
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new BothLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    for(int i = 1; i <= height; i++) {
      components.add(new RightLineComponent(witdh));
    }
    components.add(new CenterLineComponent(witdh));
    return components;
  }
}
