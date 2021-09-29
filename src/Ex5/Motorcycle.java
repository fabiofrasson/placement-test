package Ex5;

import Ex4.Car;
import Ex4.Vehicle;

public class Motorcycle extends Car implements Vehicle, IWarranty {

  public Motorcycle() {}

  public Motorcycle(String name, double totalRepairCost) {
    super(name, totalRepairCost);
  }

  @Override
  public int getWheelCount() {
    return 2;
  }

  @Override
  public boolean isValid() {
    return true;
  }
}
