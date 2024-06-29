package edu.thompson.secondweek;
public class MyJavaClass {

    public static void main(String [] args) {

      // Variable structure
      // Type indetify = value(optional);
      // Example:

      String surname = "Thompson";
      int yearOrBirthday = 1983;
      double heigh = 1.73;
      boolean isAlive = true;

      String firstName = "Carlos";
      String secondName = "Eduardo";

      // Call method fullName
      String fullName= fullName(firstName, secondName);

      System.out.println(fullName);

      // Rules variable: Should be:
        // Contain only letters, _ (underline), $(dolar symbol) or number 0 to 9.
        // Need to start with letter, _ or $, never with number
        // Start with lowercase letters
        // Don't be contain space
        // Don't use key words java reserved
        // Name unique don't repeat

        // Valid Examples
        int _number = 9;
        int $number = 0;
        int number$one = 1;
        int number1 = 1;
        int number_one = 1;

        // Invalid Examples
          // int 1number = 1;
          // int number&one = 1;
          // int number one = 1;
          // int long = 10;
      }

      // Method structure
      // TypeReturn nameMethod Param(s)
      // Example:
  
    public static String fullName(String firstName, String secondName) {
      return firstName.concat(" ").concat(secondName);
    } 
}
