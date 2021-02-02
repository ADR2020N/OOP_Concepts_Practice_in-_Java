package OOp.practice.Concepts;

public class Bike extends Vehicle{
	private boolean fourstroke=true;         //Polymolophism mean One object Have Different Forms
	 

	 public Bike(String name,String color,String model,String company,String engine,boolean fourstroke) {
		 super(name,color,model,company,engine);
	 	this.fourstroke=fourstroke;
	 }
	 public void setFourstroke(boolean fourstroke) {
	    	this.fourstroke=fourstroke;
	    } 
	 public boolean getFourstroke() {
	    	return this.fourstroke;
	    }
	 public String getInfo() {
	    	return "This is a Bike!";
	    }
	   
	 
 }



