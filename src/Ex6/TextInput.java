package Ex6;

public class TextInput {

  protected String value;

  public TextInput(String value) {
    this.value = value;
  }

  public void add(char c) {
    value += c;
  }

  public String getValue() {
    return "Value is: " + value;
  }
}
