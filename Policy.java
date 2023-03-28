public class Policy {
   private String policyNumber, provider;
   private PolicyHolder ph;
  
   public Policy() { // Default/no-arg constructor
      policyNumber = "";
      provider= "";
   }
   
   /**Overloaded Constructor
      @param userPolicyNum for policyNumber
      @param userProvider for provider
   */
   public Policy(String userPolicyNumber, String userProvider) {
      policyNumber = userPolicyNumber;
      provider = userProvider;
   }
   
   /////////////Setters//////////////
   public void setPolicyNumber(String userPolicyNumber) { //@param userPolicyNumber
      policyNumber = userPolicyNumber;
   }
   
   public void setProvider(String userProvider) { //@param userProvider
      provider = userProvider;
   }
   
      
   /////////////Getters//////////////
   public String getPolicyNumber() { //@return policyNumber
      return policyNumber;
   }
   
   public String getProvider() { //@return provider
      return provider;
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
      double total; 
      total = BASE_FEE;
      
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
   
   /**
   @return A string that describes the Policy
   */
   public String toString() {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + ph + //call PolicyHolder's toString() method
                           "\nPolicy Price: $%.2f", getPrice());
   }
}