import java.util.*; 
import java.io.*;

public class Project_virac_bou{ //open the class container
   public static void main(String[] args) { //open the main method   
   
        /*The book uses the "throws IOException" option in the main method header. In this exercise we use a "try" and "catch" process. We "try" to open the file and process it, but if something goes wrong, 
        an IOException will be "thrown" and we can "catch" it and deal with the problem. By taking this approach instead of adding a "throws IOException" clause to the main method header, we can 
        gracefully handle problems related to reading the file without having our program crash. If a problem occurs while processing the file, the IOException is immediately "thrown", the code 
        immediately jumps to the "catch" block of code. The message in the "catch" block will display. */

      try 
      {
         String policyNumber, provider, firstName, lastName, smokingStatus, fileInput; //Declaration of variables
         int age, smokerCount = 0, nonSmokerCount = 0;
         double height, weight;
               
         /*Create an instance of the File class. Pass the string "PolicyInformation.txt" to the constructor. 
            This process creates a File object that represents the file PolicyInformation.txt.*/
         File file = new File("PolicyInformation.txt");
         
         /* Pass a reference to the File object as an argument to the Scanner class constructor (i.e., file) */                             
         Scanner inputFile = new Scanner(file);   
         
         //Create an array list to store objects. The ArrayList will hold Policy objects.
         ArrayList<Policy> policy = new ArrayList<Policy>();
         
         while(inputFile.hasNext()) { //open loop
            policyNumber = inputFile.nextLine();
            
            provider = inputFile.nextLine(); //read the next line of the file as a String and assign the input to the provider variable
            
            firstName = inputFile.nextLine(); //read the next line of the file as a String and assign the input to the firstName variable
            
            lastName = inputFile.nextLine(); //read the next line of the file as a String and assign the input to the lastName variable
            
            fileInput = inputFile.nextLine(); //read the next line of the file as a String
            age = Integer.parseInt(fileInput); //convert the input into a int and assign to the age variable

            
            smokingStatus = inputFile.nextLine(); //read the next line of the file as a String and assign the input to the smokingStatus variable

            if (smokingStatus.equalsIgnoreCase("smoker")) { //increments the count of the smoker's
               smokerCount++;
            }
            else { //increments the count of non smokers
               nonSmokerCount++;
            }
            
            fileInput = inputFile.nextLine();
            height = Double.parseDouble(fileInput);
            
            fileInput = inputFile.nextLine();
            weight = Double.parseDouble(fileInput);
            
            if(inputFile.hasNext()) { 
                  inputFile.nextLine();//skip the blank line if we have not reached the end of the file
            }
            
            /* Create a Policy object we are still under the while loop. Objects will be created as long as there are records
              in the file to read.*/
            Policy p = new Policy(policyNumber, provider, firstName, lastName, age, smokingStatus, height, weight);
            
            /* Add Course objects to the ArrayList (Note: courses is the reference variable for the ArrayList and p is the
               reference variable for the Policy objects)*/
            policy.add(p); 
            
         } //close while loop
         
         
         
         inputFile.close();//close the file 
          
         
         //use a for loop to display the output
         for (int i = 0; i <policy.size(); i++) {
            System.out.println("Policy Number: " + policy.get(i).getPolicyNumber()); //instance method - returns the policy number
            System.out.println("Provider Name: " + policy.get(i).getProvider()); //instance method - returns the provider name
            System.out.println("Policyholder's First Name: " + policy.get(i).getFirstName()); //instance method - returns the policyholder's first name
            System.out.println("Policyholder's Last Name: " + policy.get(i).getLastName()); //instance method - returns the policyholder's last name
            System.out.println("Policyholder's Age: " + policy.get(i).getAge()); //instance method - returns the policyholder's age
            System.out.println("Policyholder's Smoking Status: " + policy.get(i).getSmokingStatus()); //instance method - return the policyholder's smoking status
            System.out.printf("Policyholder's Height: %.1f inches", policy.get(i).getHeight()); //instance method - return the policyholder's height
            System.out.printf("\nPolicyholder's Weight: %.1f pounds", policy.get(i).getWeight()); //instance method - return the policyholder's weight
            System.out.printf("\nPolicyholder's BMI: %.2f", policy.get(i).calculateBMI()); //method that return the policyholder's bmi
            System.out.printf("\nPolicy Price: $%,.2f", policy.get(i).calculatePrice()); //method that return the policyholder's policy price
            System.out.println();
            System.out.println();
         }
         
         
         
      }//close the "try" block of code
      
      catch(IOException ex) {//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   } //close main
} //close the class container