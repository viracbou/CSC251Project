// this is a demo of the Policy Class
import java.io.*;
import java.util.*;

public class Project_virac_bou
{
   public static void main(String[] args) throws FileNotFoundException
   {
      //open a File for reading, by creating a File object
      File file = new File("PolicyInformation.txt");   
      
      //create a Scanner object ot use the file for reading
      Scanner inputFile = new Scanner(file); //use the file object as source of input
    
      //declaration of variables to hold different types of data.
      int policyNum = 0, age = 0;
      String policyNum_str, provider, firstName, lastName, age_str, smoker, height_str, weight_str;
      double height = 0.0, weight = 0.0, bmi = 0.0;
      int isSmoker = 0, isNotSmoker = 0;
      
      while(inputFile.hasNext())
      {
         //read in one line of the file at a time, and store it into String variables
         policyNum_str = inputFile.nextLine(); //reads the policy number
         provider = inputFile.nextLine(); //reads the provider name
         firstName = inputFile.nextLine(); //reads the first name
         lastName = inputFile.nextLine(); //reads the last name
         age_str = inputFile.nextLine(); //reads the age
         smoker = inputFile.nextLine(); //reads the smoking status
         height_str = inputFile.nextLine(); //reads the height
         weight_str = inputFile.nextLine(); //reads the weight
         if(inputFile.hasNext())
         {
            inputFile.nextLine();//this handles the case where we reach the end of the file - makes sure we don't get an exception
         }
         
         //convert policy number, age, height and weight
         policyNum = Integer.parseInt(policyNum_str); //convert policy number string to integer
         age = Integer.parseInt(age_str); //convert age string to interger
         height = Double.parseDouble(height_str); //convert height string to double
         weight = Double.parseDouble(weight_str); //convert weight string to double  
         
         //calculating bmi
         bmi = ((weight*703)/(height*height));
         
         //calculating policy cost
         double policyCost = 600.0; //base cost of policy
         double ageFee = 75;
         double smokerFee = 100;
         double bmiMax = 35;
         if(age>50) 
            policyCost+=ageFee; //calculating policy if age > 50 years old
         if(smoker.equalsIgnoreCase("smoker")) 
            policyCost+=smokerFee; //calculating policyCost if user is a smoker
         if(bmi>bmiMax) 
            policyCost+=(45.81-bmiMax)*20; //calculating policyCost if user is over bmi limit
                           
         //Print lines of data
         System.out.println("Policy Number: " + policyNum);
         System.out.println("Provider Name: " + provider);
         System.out.println("Policyholder's First Name: " + firstName);
         System.out.println("Policyholder's Last Name: " + lastName);
         System.out.println("Policyholder's Age: " + age);
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + smoker);
         System.out.printf("Policyholder's Height: %.1f\n", height);
         System.out.printf("Policyholder's Weight: %.1f\n", weight);
         System.out.printf("Policyholder's BMI: %.2f\n", bmi);
         System.out.printf("Policy Price: $%.2f\n\n", policyCost);
         
         if(smoker.equalsIgnoreCase("smoker"))
            isSmoker++;
         else 
            isNotSmoker++;   
      } 
       
      System.out.println("The number of policies with a smoker is: " + isSmoker);
      System.out.println("The number of policies with a non-smoker is: " + isNotSmoker); 
   }
   
   
}