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
   /*overloaded constructor
   @param pn for Policy Number
   @param p for provider
   @param a for age
   @param fn for first name
   @param ln for last name
   @param s for smoker
   @param h for height
   @param w for weight*/
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
   
   //setter for policyNum
   public void setPolicyNum(int pn)
   {
      policyNum = pn;
   }
   //setter for provider
   public void setProvider(String p)
   {
      provider = p;
   }
   //setter for age
   public void setAge(int a)
   {
      age = a;
   }
   //setter for firstName
   public void setFirstName(String fn)
   {
      firstName = fn;
   }
   //setter for lastName
   public void setLastName(String ln)
   {
      lastName = ln;
   }
   //setter for height
   public void setHeight(double h)
   {
      height = h;
   }
   //setter for weight
   public void setWeight(double w)
   {
      weight = w;
   }
   //setter for smoker
   public void setSmoker(String s)
   {
      smoker = s;
   }
   //getter for policyNum
   public int getPolicyNum()
   {
      return policyNum;
   }
   //getter for provider
   public String getProvider()
   {
      return provider;
   } 
   //getter for age
   public int getAge()
   {
      return age;
   }
   //getter for firstName
   public String getFirstName()
   {
      return firstName;
   }
   //getter for lastName
   public String getLastName()
   {
      return lastName;
   }
   //getter for height
   public double getHeight()
   {
      return height;
   }
   //getter for weight
   public double getWeight()
   {
      return weight;
   }
   //getter for smoker
   public String getSmoker()
   {
      return smoker;
   }
   //getter for bmi
   public double getBmi()
   {
      return ((weight*703)/(height*height));
   }
   //method for insurance cost
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