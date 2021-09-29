package Ex5;

public class Main {

  public static void main(String[] args) {

    Motorcycle motorcycle = new Motorcycle("Kawasaki", 760.0);

    System.out.println(motorcycle.getWheelCount());

    System.out.println(motorcycle.isValid());
  }
}
