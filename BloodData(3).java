public class BloodData {
	
	static String bloodType;
    static String rhFactor;
    
    BloodData() {
    	bloodType = "O";
    	rhFactor = "+";
    }
    public void BloodData(String bt, String rh){
    	bloodType = bt;
    	rhFactor = rh;
    }
    public void Display(){
    	
    	System.out.println(bloodType+rhFactor+" is added to the blood bank.");
    	
    }
}