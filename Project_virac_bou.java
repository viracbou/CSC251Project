// this is a demo of the Policy Class
import java.util.Scanner;
public class Project_virac_bou
{
   public static void main(String[] args)
   {
      int policyNum, age;
      String provider, firstName, lastName, smoker;
      double height, weight;

      Scanner keyboard = new Scanner(System.in); //declare scanner object
      
      System.out.print("Please enter the Policy Number: "); 
      policyNum = keyboard.nextInt();   
      keyboard.nextLine();    
        
      System.out.print("Please enter the Provider Name: ");
      provider = keyboard.nextLine();
           
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
          
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
           
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine(); 
           
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoker = keyboard.nextLine();
      
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //creation of new object using overloaded constructor in the policy class
      Policy user = new Policy(policyNum, provider, firstName, lastName, age, smoker, height, weight);
      
      //output of results using methods of the policy class 
      System.out.print("\nPolicy Number: "+ user.getPolicyNum());
      System.out.print("\nProvider Name: "+ user.getProvider());
      System.out.print("\nPolicyholder's First Name: "+ user.getFirstName());
      System.out.print("\nPolicyholder's Last Name: "+ user.getLastName());
      System.out.print("\nPolicyholder's Age: "+ user.getAge());
      System.out.print("\nPolicyholder's Smoking Status: "+ user.getSmoker());
      System.out.printf("\nPolicyholder's Height: %.1f inches", user.getHeight());
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", user.getWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", user.getBmi());
      System.out.printf("\nPolicy Price: $%,.2f", user.getPolicyCost());
   }
}