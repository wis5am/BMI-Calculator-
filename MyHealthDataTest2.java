/**
 * The `MyHealthDataTest2` class contains test cases for the `getBMI()` method of the `Patient` class.
 * It demonstrates the execution of two test cases - one successful and one failed - to validate 
 * the correctness of the `getBMI()` method.
 * 
 * @author Wisam Al-Humairi
 * @see Patient
 * @author Wisam Al-Humairi
 * @version 17.0.5
 * @since June 13th, 2023
 */
public class MyHealthDataTest2 {

    /**
     * The main method that executes the test cases.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // First test case - Successful execution
        testSuccessfulExecution();

        // Second test case - Failed execution
        testFailedExecution();
    }

    /**
     * Test case for successful execution of the `getBMI()` method.
     * Creates a patient with valid height and weight, calculates the expected BMI,
     * and compares it with the actual BMI obtained from the `getBMI()` method.
     * Displays a success message if the test passes, or a failure message otherwise.
     */
    private static void testSuccessfulExecution() {
        // Create a patient with valid height and weight
        Patient patient = new Patient("James", "McDonald", "Male", 1976, 9, 15, 70.0, 200.0);

        // New variable with the expected BMI
        double expectedBMI = 28.69;
        /**
         * Calculates the actual BMI value by rounding the result of patient.getBMI() to two decimal places.
         * The calculated value is stored in the actualBMI variable.
         *
         * @param patient the Patient object for which the BMI is being calculated
         * @return the actual BMI value rounded to two decimal places
         */
        double actualBMI = Math.round(patient.getBMI() * 100.0) / 100.0;

        // Compare the expected BMI with the actual BMI from the getBMI() method
        if (expectedBMI == actualBMI) {
            System.out.println("Test 1: Successful execution - Test passed");
            System.out.printf("Expected BMI: %.2f%n", expectedBMI);
            System.out.printf("Actual BMI: %.2f%n", actualBMI);
        } else {
            System.out.println("Test 1: Error!!! Failed execution - Test failed");
            System.out.printf("Expected BMI: %.2f%n", expectedBMI);
            System.out.printf("Actual BMI: %.2f%n", actualBMI);
        }
    }

    /**
     * Test case for failed execution of the `getBMI()` method.
     * Creates a patient with invalid height and weight (zero values),
     * calculates the expected BMI, and compares it with the actual BMI obtained from the `getBMI()` method.
     * Displays a success message if the test passes, or a failure message otherwise.
     */
    private static void testFailedExecution() {
        // Create a patient with invalid height and weight (zero values)
    	Patient patient = new Patient("James", "McDonald", "Male", 1976, 9, 15, 70.0, 200.0);

    	// New variable with the expected BMI
        double expectedBMI = 28.69;
        /**
         * Calculates the actual BMI value by rounding the result of patient.getBMIError() to two decimal places.
         * The calculated value is stored in the actualBMI variable.
         *
         * @param patient the Patient object for which the BMI is being calculated
         * @return the actual BMI value rounded to two decimal places
         */
        double actualBMI = Math.round(patient.getBMIError() * 100.0) / 100.0;
        // Compare the expected BMI with the actual BMI from the getBMI() method
        if (expectedBMI == actualBMI) {
        	System.out.println("Test 2: Successful execution - Test passed");
            System.out.printf("Expected BMI: %.2f%n", expectedBMI);
            System.out.printf("Actual BMI: %.2f%n", actualBMI);
        } else {
            System.out.println("Test 2: Error!!! Failed execution - Test failed");
            System.out.printf("Expected BMI: %.2f%n", expectedBMI);
            System.out.printf("Actual BMI: %.2f%n", patient.getBMIError());
        }
        
    }
}
