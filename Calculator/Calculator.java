/**
 * @author James MacKenzie
 */

public class Calculator implements ICalculator {
  @Override
  public double addition(double value1, double value2) {
    return value1 + value2;
  }

  @Override
  public double subtraction(double value1, double value2) {
    return value1 - value2;
  }

  @Override
  public double division(double value1, double value2) {
    return value1 / value2;
  }

  @Override
  public double multiplication(double value1, double value2) {
    return value1 * value2;
  }

  @Override
  public void display() {

  }
}
