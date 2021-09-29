package Ex3;

public class Main {

  public static void main(String[] args) {

    MyClass x = new MyClass("X");
    MyClass y = new MyClass("Y");
    MyClass z = new MyClass("Z");

    System.out.println(x.getName() + " : " + x.getInstanceCount());
    System.out.println(y.getName() + " : " + y.getInstanceCount());
    System.out.println(z.getName() + " : " + z.getInstanceCount());

    x.setName("ZZZ");
    System.out.println(x.getName() + " : " + x.getInstanceCount());
  }
}
