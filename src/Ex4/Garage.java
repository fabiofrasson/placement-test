package Ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

  private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

  public void StartVehicleRepair(Vehicle x) {
    this.vehicles.add(x);
  }

  public void CloseVehicleRepair(Vehicle x) {
    this.vehicles.remove(x);
  }

  // Returns the sum of all the repaired cars in the garage
  public String CalculateSumOfAllRepairsInGarage() {

    double sum = 0;

    for (Vehicle vehicle : vehicles) {
      sum += vehicle.getTotalRepairCost();
    }

    return "Total sum of all repairs in garage is EUR " + sum;
  }

  // Returns the count of all the trailers in the garage
  public String CalculateCountOfAllTrailersInGarage() {

    int trailersInGarage = 0;

    List<Truck> trucks =
        vehicles.stream()
            .filter(vehicle -> vehicle instanceof Truck)
            .map(vehicle -> (Truck) vehicle)
            .collect(Collectors.toList());

    for (Truck truck : trucks) {
      if (truck.hasTrailer()) trailersInGarage += 1;
    }

    return "Total count of trailers in garage is " + trailersInGarage;
  }
}
