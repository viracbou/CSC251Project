import java.util.Scanner;

public class Project_virac_bou{
   public static void main(String[] args) {
      String policyNumber, provider, firstName, lastName, smokingStatus; //Declaration of variables
      int age;
      double height, weight;
      Scanner keyboard = new Scanner(System.in); //Create a Scanner object for user input
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      provider = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine(); // consume Newline
      while(age < 0) { //Input validation
         System.out.print("Age can't be less than 0. Please enter the Policyholder's Age: ");
         age = keyboard.nextInt();
         keyboard.nextLine(); // consume Newline
      }
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      while(!smokingStatus.equalsIgnoreCase("smoker") && !smokingStatus.equalsIgnoreCase("non-smoker")) { //Input validation
         System.out.print("Invalid input. Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokingStatus = keyboard.nextLine();
      }
      
      System.out.print("Please enter the Policyholder's Height: ");
      height = keyboard.nextDouble();
      while(height < 0) {
         System.out.print("Height can't be less than 0. Please enter the Policyholder's Height: ");
         height = keyboard.nextDouble();
      }
      
      System.out.print("Please enter the policyholder's Weight: ");
      weight = keyboard.nextDouble();
      while(weight < 0) {
         System.out.print("Weight can't be less than 0. Please enter the Policyholder's Weight: ");
         weight = keyboard.nextDouble();
      }
      
      //Create a Policy object
      Policy user = new Policy(policyNumber, provider, firstName, lastName, age, smokingStatus, height, weight);
      
      ////////////Output///////////
      System.out.println();
      System.out.println("Policy Number: " + user.getPolicyNumber());
      System.out.println("Provider Name: " + user.getProvider());
      System.out.println("Policyholder's First Name: " + user.getFirstName());
      System.out.println("Policyholder's Last Name: " + user.getLastName());
      System.out.println("Policyholder's Age: " + user.getAge());
      System.out.println("Policyholder's Smoking Status: " + user.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f inches", user.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", user.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", user.calculateBMI());
      System.out.printf("\nPolicy Price: $%,.2f", user.calculatePrice());
   }
}