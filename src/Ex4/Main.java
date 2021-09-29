package Ex4;

public class Main {

  public static void main(String[] args) {

    Garage garage = new Garage();

    Car car = new Car("Ford", 45.50);
    Car car2 = new Car("Volkswagen", 135.75);
    Car car3 = new Car("Honda", 72.0);

    Truck truck = new Truck("Chevrolet", 85.0, true);
    Truck truck2 = new Truck("Daimler", 90.0, true);
    Truck truck3 = new Truck("Fiat", 130.0, true);

    garage.StartVehicleRepair(car);
    garage.StartVehicleRepair(car2);
    garage.StartVehicleRepair(car3);
    garage.StartVehicleRepair(truck);
    garage.StartVehicleRepair(truck2);
    garage.StartVehicleRepair(truck3);

    System.out.println(garage.CalculateSumOfAllRepairsInGarage());

    System.out.println(garage.CalculateCountOfAllTrailersInGarage());
  }
}
