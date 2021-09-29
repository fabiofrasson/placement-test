package Ex6;

public class NumericInput extends TextInput {

  public NumericInput(String value) {
    super(value);
  }

  @Override
  public void add(char c) {
    if (Character.isDigit(c)) {
      value += c;
    }
  }
}
