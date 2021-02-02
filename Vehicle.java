package OOp.practice.Concepts;

public class Vehicle {
   // public String name="";    
    //public String color="";
    //public String model="";
    //public String company="";
    
	  private String name="";    
	  private String color="";
	  private String model="";
	  private String company="";
	  private String engine="800";
	  public static  int count =0; //Purpose of Static KeyWord is benefit to key record 
	  
	  
   //!To protect user to get property use protect keyword
    
    
    
    public Vehicle() {   //this an empty constructor,if it doen't created it created by compiler.
    	  count++;               //it also called Empty Constructor.
    }
    
    public Vehicle(String name,String color,String model,String company,String engine) {   //Parameterized Constructor
    	 this.name=name;
    	 this.color=color;
    	 this.model=model;
    	 this.company=company;
    	 this.engine=engine;
    	 count++;
    	 
    }
    //Constructor Overlaoding:Two constructor With Same name but Different Parameters
    public void setName(String name) {
    	this.name=name;
    }
    public void setcolor(String color) {
    	this.color=color;
    }
    public void setmodel(String model) {
    	this.model=model;
    }
    public void setcompany(String company) {
    	this.company=company;
    }
    public void setEngine(String engine) {
    this.engine=engine;
    }
    public String getName() {
    	return this.name;
    }
    public String getcolor() {
    	return this.color;
    }
    public String getmodel() {
    	return this.model;
    }
    public String getcompany() {
    	return this.company;
    }
    private String getEngine() {   //This Function Is Only For utility purpose,you can't access outSide
    	return this.engine;        //AnyThing you need to inside A SPECIFIC FUNCTION HAS TO BE PRICATE
    }
    public int getSpeed() {
    	String a=getEngine();
    	if(a=="800") {
    		return 90;
    	}else {
    		return 120;
   	 }	
    }
    public String getInfo() {
    	return "This is a Vehicle!";
    }
    public static String getVehicle() {
    	return "You have set thae color of Vehicle";
    }
    //Meaning Of Public Key id For help of Accessing This Class When you are outSide,Here I am accessing Vehicle Class While I am in Test_Main Class
}
