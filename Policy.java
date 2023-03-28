public class Policy {
   private String policyNumber, provider;
   private PolicyHolder ph;
   
   public static int numOfPolicies = 0; //static field to keep track of Policy objects
  
   public Policy() { // Default/no-arg constructor
      policyNumber = "";
      provider= "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }
   
   /**Overloaded Constructor
      @param policyNum for policyNumber
      @param provider for provider
      @param ph The PolicyHolder for the policy
   */
   public Policy(String policyNumber, String provider, PolicyHolder ph) {
      this.policyNumber = policyNumber;
      this.provider = provider;
      this.ph = new PolicyHolder(ph); //create a copy using the PolicyHolder's copy constructor
      numOfPolicies++;
   }
   
   /////////////Setters//////////////
   public void setPolicyNumber(String policyNumber) { //@param policyNumber
      this.policyNumber = policyNumber;
   }
   
   public void setProvider(String provider) { //@param userProvider
      this.provider = provider;
   }
   
   public void setPolicyHolder(PolicyHolder ph) {
      ph = new PolicyHolder(ph); //create a copy using the PolicyHolder's copy constructor
   }
   
      
   /////////////Getters//////////////
   public String getPolicyNumber() { //@return policyNumber
      return policyNumber;
   }
   
   public String getProvider() { //@return provider
      return provider;
   }
   
   public PolicyHolder getPolicyHolder() { //@return a copy of the PolicyHolder for the policy using the copy constructor
      return new PolicyHolder(ph);  
   }
     
   public double calculatePrice() { //@return calucated price of the insturance policy
      final int BASE_FEE, MAX_AGE, AGE_FEE, SMOKER_FEE, MAX_BMI;
      final double BMI_FEE;
      MAX_AGE = 50;
      BASE_FEE = 600;
      AGE_FEE = 75;
      SMOKER_FEE = 100;
      MAX_BMI = 35;
      BMI_FEE = ((ph.calculateBMI() - MAX_BMI) *20);
      double total; 
      total = BASE_FEE;
      
      if(ph.getAge() > MAX_AGE) { //testing for additonal fees
         total += AGE_FEE;
      }
      else if(ph.getSmokingStatus().equalsIgnoreCase("smoker")) {
         total += SMOKER_FEE;
      }
      else if(ph.calculateBMI() > MAX_BMI) {
         total += BMI_FEE;
      }
      return total;
   }
   
   /**
   @return A string that describes the Policy
   */
   public String toString() {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + provider +
                           "\n" + ph + //call PolicyHolder's toString() method
                           "\nPolicy Price: $%.2f", calculatePrice());
   }
}