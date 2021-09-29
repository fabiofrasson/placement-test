package Ex4;

public class Truck extends Car implements Vehicle {

  private boolean hasTrailer = false;

  public Truck(boolean hasTrailer) {
    this.hasTrailer = hasTrailer;
  }

  public Truck(String name, double totalRepairCost, boolean hasTrailer) {
    super(name, totalRepairCost);
    this.hasTrailer = hasTrailer;
  }

  public int getWheelCount() {
    return 6;
  }

  public boolean hasTrailer() {
    return this.hasTrailer;
  }
}
