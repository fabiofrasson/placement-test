package Ex3;

public class MyClass {

  private int instanceCount = 0;

  private String name;

  public MyClass(String name) {
    instanceCount++;
    this.name = name;
  }

  public int getInstanceCount() {
    return instanceCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
