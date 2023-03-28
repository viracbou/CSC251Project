import java.util.Scanner; 
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_virac_bou{ //open the class container
   public static void main(String[] args) throws IOException { //open the main method   
      String policyNumber, provider, firstName, lastName, smokingStatus, fileInput; //Declaration of variables
      int age, numSmokers = 0;
      double height, weight;
            
      //Create an array list to store objects. The ArrayList will hold Policy objects.
      ArrayList<Policy> policyList = new ArrayList<Policy>();
            
      //Create and open the file
      File file = new File("PolicyInformation.txt");                           
      Scanner inputFile = new Scanner(file);   
      
      while(inputFile.hasNext()) { //open loop
         policyNumber = inputFile.nextLine();
         provider = inputFile.nextLine();    
         firstName = inputFile.nextLine();     
         lastName = inputFile.nextLine(); 
         age = inputFile.nextInt(); 
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine(); 
         height = inputFile.nextDouble();         
         weight = inputFile.nextDouble();  
         
         //make sure we haven't hit the end of the file before trying to skip the blank line      
         if(inputFile.hasNext())
               inputFile.nextLine();
         if(inputFile.hasNext())
               inputFile.nextLine();
           
         //create a PolicyHolder and Policy object to add to ArrayList
         policyList.add(new Policy(policyNumber, provider, new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight)));

         
      } //close while loop
         
      //use a for loop to display the output
      for (Policy policy : policyList) {
         System.out.println(policy);
         System.out.println();
         if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) //smoker count
            numSmokers++;
      }
      
      //print out number of Policy objects
      System.out.println("There were " + Policy.numOfPolicies + " Policy objects created.");
      
      System.out.println("The number of policies with a smoker is: " + numSmokers); //print out the total number of smokers
      System.out.println("The number of policies with a smoker is: " + (policyList.size() - numSmokers) ); //print out the total number on non-smokers
      
   } //close main
} //close the class container