package Ex4;

public class Car implements Vehicle {

  private String name;
  private double totalRepairCost;

  public Car() {}

  public Car(String name, double totalRepairCost) {
    this.name = name;
    this.totalRepairCost = totalRepairCost;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getWheelCount() {
    return 4;
  }

  @Override
  public double getTotalRepairCost() {
    return this.totalRepairCost;
  }
}
