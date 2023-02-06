public class Policy {
   private String policyNumber, provider, firstName, lastName, smokingStatus; //Declaration of fields
   private int age;
   private double height, weight;
   
   public Policy() { // Default/no-arg constructor
      policyNumber = "";
      provider= "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /**Overloaded Constructor
      @param userPolicyNum for policyNumber
      @param userProvider for provider
      @param userFirstName for firstName
      @param userLastName for lastName
      @param userSmokingStatus for smokingStatus
      @param userHeight for height (in inches)
      @param userWeight for weight (in pounds)
   */
   public Policy(String userPolicyNumber, String userProvider, String userFirstName, String userLastName, String userSmokingStatus, double userHeight, double userWeight) {
      policyNumber = userPolicyNumber;
      provider = userProvider;
      firstName = userFirstName;
      lastName = userLastName;
      smokingStatus = userSmokingStatus;
      height = userHeight;
      weight = userWeight;
   }
   
   /////////////Setters//////////////
   public void setPolicyNumber(String userPolicyNumber) { //@param userPolicyNumber
      policyNumber = userPolicyNumber;
   }
   
   public void setProvider(String userProvider) { //@param userProvider
      provider = userProvider;
   }
   
   public void setFirstName(String userFirstName) { //@param userFirstName
      firstName = userFirstName;
   }
   
   public void setLastName(String userLastName) { //@param userLastName
      lastName = userLastName;
   }
   
   public void setSmokingStatus(String userSmokingStatus) { //@param userSmokingStatus
      smokingStatus = userSmokingStatus;
   }
   
   public void setHeight(double userHeight) { //@param userHeight (in inches)
      height = userHeight;
   }
   
   public void setWeight(double userWeight) { //@param userWEight (in pounds)
      weight = userWeight;
   }
   
   /////////////Getters//////////////
   public String getPolicyNumber() { //@return policyNumber
      return policyNumber;
   }
   
   public String getProvider() { //@return provider
      return provider;
   }
   
   public String getFirstName() { //@return firstName
      return firstName;
   }
   
   public String getLastName() { //@return lastName
      return lastName;
   }
   
   public String getSmokingStatus() { //@return smokingStatus
      return smokingStatus;
   }
   
   public double getHeight() { //@return height
      return height;
   }
   
   public double getWeight() { //@return weight
      return weight;
   }
   
   public double calculateBMI() { //@return calculated BMI
      return ((weight * 703) / (height * height));
   }
   
   public double calculatePrice() { //@return calucated price of the insturance policy
      final int BASE_FEE, MAX_AGE, AGE_FEE, SMOKER_FEE, MAX_BMI;
      final double BMI_FEE;
      MAX_AGE = 50;
      BASE_FEE = 600;
      AGE_FEE = 75;
      SMOKER_FEE = 100;
      MAX_BMI = 35;
      BMI_FEE = ((calculateBMI() - MAX_BMI) *20);
      double total = (double)BASE_FEE;
      
      if(age > MAX_AGE) { //testing for additonal fees
         total += AGE_FEE;
      }
      else if(smokingStatus.equalsIgnoreCase("smoker")) {
         total += SMOKER_FEE;
      }
      else if(calculateBMI() > MAX_BMI) {
         total += BMI_FEE;
      }
      return total;
   }
}