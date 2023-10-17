import java.util.Scanner;

/**
 * This class represents a test class for MyHealthData program. Asks the user to input their data
 * and display their Health data.
 * @see Patient
 * @author Wisam Al-Humairi
 * @see Patient
 * @author Wisam Al-Humairi
 * @version 17.0.5
 * @since June 13th, 2023
 */
public class MyHealthDataTest {

    /**
     * The main method of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String gender;
        int birthYear;
        int birthMonth;
        int birthDay;
        double height;
        double weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = input.nextLine();

        System.out.print("Enter your gender: ");
        gender = input.nextLine();

        System.out.print("Enter your year of birth: ");
        birthYear = input.nextInt();
        input.nextLine();

        System.out.print("Enter your month of birth: ");
        birthMonth = input.nextInt();
        input.nextLine();

        System.out.print("Enter your day of birth: ");
        birthDay = input.nextInt();
        input.nextLine();

        System.out.print("Enter your height: ");
        height = input.nextDouble();
        input.nextLine();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();
        input.nextLine();

        input.close();

        Patient patient = new Patient(firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight);
        System.out.println();
        patient.displayMyHealthData();
    }
}
