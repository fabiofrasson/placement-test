package Ex1;

public class Counter {

  public static void main(String[] args) {
    int counter = 200;

    for (int i = 1; i <= counter; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("M35");
      } else if (i % 3 == 0) {
        System.out.println("M3");
      } else if (i % 5 == 0) {
        System.out.println("M5");
      } else {
        System.out.println(i);
      }
    }
  }
}
