import java.util.*;
public class RunBloodData {

    public static void main (String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	BloodData bd = new BloodData();
    	System.out.print("Enter blood type of patient: ");
    	String pb = sc.nextLine();
    		
    	if (pb.equals("O")){
    		System.out.print("Enter the Rhesus factor( + or - ): ");
    		String rf = sc.nextLine();
    		if(rf.equals("+")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("-")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("")){
    			bd.Display();
    		}
    		else{
    			System.out.println("Invalid Input");
    		}
    	}
    	else if(pb.equals("A")){
    		System.out.print("Enter the Rhesus factor( + or - ): ");
    		String rf = sc.nextLine();
    		if(rf.equals("+")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("-")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("")){
    			bd.Display();
    		}
    		else{
    			System.out.println("Invalid Input");
    		}
    	}
    	else if(pb.equals("AB")){
    		System.out.print("Enter the Rhesus factor( + or - ): ");
    		String rf = sc.nextLine();
    		if(rf.equals("+")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("-")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("")){
    			bd.Display();
    		}
    		else{
    			System.out.println("Invalid Input");
    		}
    	}
    	else if(pb.equals("B")){
    		System.out.print("Enter the Rhesus factor( + or - ): ");
    		String rf = sc.nextLine();
    		if(rf.equals("+")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("-")){
    			bd.BloodData(pb,rf);
    			bd.Display();
    		}
    		else if(rf.equals("")){
    			bd.Display();
    		}
    		else{
    			System.out.println("Invalid Input");
    		}
    	}
    	else if(pb.equals("")){
    		System.out.print("Enter the Rhesus factor( + or - ): ");
    		String rf = sc.nextLine();
    		if(rf.equals("")){
    			bd.Display();
    		}
    		else{
    			System.out.println("Invalid Input");
    		}		
    	}
    	else{
    		System.out.println("Invalid Input");
    	}
    }
}