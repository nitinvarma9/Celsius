import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        String trash;
        boolean correct = false;
        // fahrenheit = (celsius * 9/5) + 32
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter the temperature in Celsius");

            if (in.hasNextDouble()) {
                correct = true;
                celsius = in.nextDouble();
                in.nextLine();

                fahrenheit = (celsius * 9 / 5) + 32;

                System.out.printf("The temperature in fahrenheit is %.2f ", fahrenheit);
            } else {
                trash = in.nextLine();
                System.out.println("You entered an invalid value " + trash);

            }
        }while (!correct);
    }
}