public class Main {

    public static void main(String[] args) {

        Convertor convertor = new convertor();
        Calculator calculator = new Calculator(convertor);

        calculator.startCalculator();  // Start the application.
    }
}
