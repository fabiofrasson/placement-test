package Ex6;

public class Main {

  public static void main(String[] args) {

    TextInput input = new NumericInput("");

    input.add('1');
    input.add('a');
    input.add('0');
    input.add('~');

    System.out.println(input.getValue());
  }
}
