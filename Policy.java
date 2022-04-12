public class Policy
{
   //fields
   private int policyNum, age;
   private String provider, firstName, lastName, smoker;
   private double height, weight;

   
   //default constructor
   public Policy()
   {
      policyNum = 0;
      provider = "";
      age = 0;
      firstName = "";
      lastName = "";
      height = 0.0;
      weight = 0.0;
      smoker = "";
   }
   /**
      overloaded constructor
      @param pn for Policy Number
      @param p for provider
      @param a for age
      @param fn for first name
      @param ln for last name
      @param s for smoker
      @param h for height
      @param w for weight
   */
   public Policy(int pn, String p, String fn, String ln, int a, String s, double h, double w) 
   {
      policyNum = pn;
      provider = p;
      firstName = fn;
      lastName = ln;
      age = a;
      smoker = s;
      height = h;
      weight = w;
   }
   
   /**
      setter for policyNum
      @param pn The policy number of the user.
   */
   
   public void setPolicyNum(int pn)
   {
      policyNum = pn;
   }
   
   /**
      setter for provider
      @param p The provider of the user.
   */
   
   public void setProvider(String p)
   {
      provider = p;
   }
   
   /**
      setter for age
      @param a The age of the user.
   */
   
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      setter for firstName
      @param fn The first name of the user.
   */
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   
   /**
      setter for lastName
      @param ln The last name of the user.
   */
   
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   
   /**
      setter for height
      @param h The height of the user.
   */
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
      setter for weight
      @param w The weight of the user.
   */
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
      setter for smoker
      @param s The status of being a smoker.
   */
   
   public void setSmoker(String s)
   {
      smoker = s;
   }
   
   /**
      getter for policyNum
      @return The value of the policy number.
   */
   
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      getter for provider
      @return The provider of the user.
   */
   
   public String getProvider()
   {
      return provider;
   } 
   
   /**
      getter for age
      @return The age of the user.
   */
   
   public int getAge()
   {
      return age;
   }
   
   /**
      getter for firstName
      @return The first name of the user.
   */
   
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
      getter for lastName
      @return The last name of the user.
   */
   
   public String getLastName()
   {
      return lastName;
   }
   
   /**
      getter for height
      @return The height of the user.
   */
   
   public double getHeight()
   {
      return height;
   }
   
   /**
      getter for weight
      @return The weight of the user.
   */
   
   public double getWeight()
   {
      return weight;
   }
   
   /**
      getter for smoker
      @return The smoking status of the user.
   */
   
   public String getSmoker()
   {
      return smoker;
   }
   
   /**
      getter for bmi
      @return The bmi of the user.
   */
   
   public double getBmi()
   {
      return ((weight*703)/(height*height));
   }
   
   /**
      method for insurance cost
      @return The cost of the policy.
   */
   
   public double getPolicyCost()
   {
      double policyCost = 600.0; //base cost of policy
      double ageFee = 75;
      double smokerFee = 100;
      double bmiMax = 35;
      if(age>50) 
         policyCost+=ageFee; //calculating policy if age > 50 years old
      if(smoker.equalsIgnoreCase("smoker")) 
         policyCost+=smokerFee; //calculating policyCost if user is a smoker
      if(getBmi()>bmiMax) 
         policyCost+=(45.81-bmiMax)*20; //calculating policyCost if user is over bmi limit
      
      return policyCost;
   }
}