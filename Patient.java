import java.time.LocalDate;
import java.time.Period;

/**
 * This class represents a Patient and maintains important health information about the patient.
 * Note: This class assumes values passed to the set methods are correct.
 * REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!
 * 
 * @author Wisam Al-Humairi
 * @see Patient
 * @author Wisam Al-Humairi
 * @version 17.0.5
 * @since June 13th, 2023
 */
public class Patient {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private double height;
    private double weight;

    /**
     * Constructs a new Patient object with the given information.
     *
     * @param firstName  the first name of the patient
     * @param lastName   the last name of the patient
     * @param gender     the gender of the patient
     * @param birthYear  the birth year of the patient
     * @param birthMonth the birth month of the patient
     * @param birthDay   the birth day of the patient
     * @param height     the height of the patient in inches
     * @param weight     the weight of the patient in pounds
     */
    public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay,
                   double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Returns the first name of the patient.
     *
     * @return the first name of the patient
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the patient.
     *
     * @param firstName the first name of the patient
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the patient.
     *
     * @return the last name of the patient
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the patient.
     *
     * @param lastName the last name of the patient
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the gender of the patient.
     *
     * @return the gender of the patient
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the patient.
     *
     * @param gender the gender of the patient
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the birth year of the patient.
     *
     * @return the birth year of the patient
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the birth year of the patient.
     *
     * @param birthYear the birth year of the patient
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Returns the birth month of the patient.
     *
     * @return the birth month of the patient
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Sets the birth month of the patient.
     *
     * @param birthMonth the birth month of the patient
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * Returns the birth day of the patient.
     *
     * @return the birth day of the patient
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the birth day of the patient.
     *
     * @param birthDay the birth day of the patient
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * Returns the height of the patient in inches.
     *
     * @return the height of the patient in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the patient in inches.
     *
     * @param height the height of the patient in inches
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the weight of the patient in pounds.
     *
     * @return the weight of the patient in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the patient in pounds.
     *
     * @param weight the weight of the patient in pounds
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates and returns the Body Mass Index (BMI) of the patient.
     *
     * @return the BMI of the patient
     */
    public double getBMI() {
        return (getWeight() * 703) / (getHeight() * getHeight());
    }

    /**
     * Calculates and returns the age of the patient.
     *
     * @return the age of the patient
     */
    public int getAge() {
    	
        LocalDate patientsBirthDate = LocalDate.of(getBirthYear(), getBirthMonth(), getBirthDay());
        LocalDate currentDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        int patientAge = Period.between(patientsBirthDate, currentDate).getYears();
		return patientAge;
    }

    /**
     * Calculates and returns the maximum heart rate of the patient.
     *
     * @return the maximum heart rate of the patient
     */
    public int getMaximumHeartRate() {
        return (220 - getAge());
    }

    /**
     * Calculates and returns the target heart rate range of the patient.
     *
     * @return the target heart rate range of the patient
     */
    public String getTargetHeartRateRange() {
        double targetMinimumHeartRate = 0.5 * getMaximumHeartRate();
        double targetMaximumHeartRate = 0.85 * getMaximumHeartRate();
        return (targetMinimumHeartRate + " - " + targetMaximumHeartRate);
    }
    /**
     * Calculates and returns the wrong Body Mass Index (BMI) of the patient.
     *
     * @return the wrong BMI of the patient
     */
    public double getBMIError() {
        return (getWeight() * 600) / (getHeight() * getHeight());
    }

    /**
     * Displays all the health data of the patient.
     */
    public void displayMyHealthData() {
        System.out.printf("Health Data%nFirst name: %s%nLast name: %s%nGender: %s%nBirth year: %d%nBirth month: %d%nBirth day: %d%nHeight: %.1f inch%nWeight: %.1f pound%nYour age: %d%nMaximum Heart rate: %d%nTarget heart rate range: %s%nBMI: %.1f%n",
                firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight, getAge(), getMaximumHeartRate(), getTargetHeartRateRange(), getBMI());

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }
}
