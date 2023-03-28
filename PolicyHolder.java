public class PolicyHolder {
   String firstName;
   String lastName;
   int age;
   String smokingStatus;
   double height;
   double weight;
   
   /**
   No-arg constructor
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param userFirstName for firstName
   @param userLastName for lastName
   @param userSmokingStatus for smokingStatus
   @param userHeight for height (in inches)
   @param userWeight for weight (in pounds)
   */
   public PolicyHolder(String userFirstName, String userLastName, int userAge, String userSmokingStatus, double userHeight, double userWeight) {
      firstName = userFirstName;
      lastName = userLastName;
      age = userAge;
      smokingStatus = userSmokingStatus;
      height = userHeight;
      weight = userWeight;
   }
   
   /**
   Copy constructor thatr returns a copy of the PolicyHolder object
   @param policyHolderObject The PolicyHolder to return a copy of
   */
   public PolicyHolder(PolicyHolder policyHolderObject) {
      this.firstName = policyHolderObject.getFirstName();
      this.lastName = policyHolderObject.getLastName();
      this.age = policyHolderObject.getAge();
      this.smokingStatus = policyHolderObject.getSmokingStatus();
      this.height = policyHolderObject.getHeight();
      this.weight = policyHolderObject.getWeight();
   }
   
   //setters//
   
   public void setFirstName(String userFirstName) { //@param userFirstName
      firstName = userFirstName;
   }
   
   public void setLastName(String userLastName) { //@param userLastName
      lastName = userLastName;
   }
   
   public void setAge(int userAge) { //@param userAge
      age = userAge;
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

  //getters//
   
   public String getFirstName() { //@return firstName
      return firstName;
  }
   
  public String getLastName() { //@return lastName
     return lastName;
  }
   
   public int getAge() { //@return age
      return age;
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
   
   /**
   Calculate the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double calculateBMI() { //@return calculated BMI
      final double CONVFACTOR = 703;
      
      return ((weight * CONVFACTOR) / (height * height));
   }
   
   /**
   @return A String that describes the PolicyHolder
   */
   public String toString() {
      return String.format("Policyholder's First Name: " + firstName + 
                           "\nPolicyholder's Last Name: " + lastName + 
                           "\nPolicyholder's Age: " + age +
                           "\nPolicyholder's Smoking Status(Y/N): " + smokingStatus +
                           "\nPolicyholder's Height: " + height + " inches" +
                           "\nPolicyholder's Weight: " + weight + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , calculateBMI());
   }
}