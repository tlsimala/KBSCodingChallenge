import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tlsimala
 * 
 * This is the KaleidoClientCode class which allows the user to 
 * register a compound, assign a compound to a plate, transfer content from plates and wells, 
 * and request compounds.
 *
 */
public class KaleidoClientCode {

	public static ArrayList<Compound> compoundList=new ArrayList<Compound>(); //an arraylist that holds compound objects
	
	/**
	 * The main method which prompts the user with an opening message.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Awesome Kaleido Employees!\nThis is the Kaleido Registration Client for your Compound, Plate, and Well registration needs!");
		prompt();
	}
	
	/**
	 * A method which continues the prompt from the main method and prompts the user for information.
	 */
	public static void prompt() {
		System.out.println("\nType 1 to Register a Compound ID."+"\n"+"Type 2 to Assign a CompoundID to a Plate."+"\n"+"Type 3 to Transfer Contents from Plates to Wells."+"\n"+
				"Type 4 to Request a Compound ID."+"\n"+"Type 0 to Finish the session.\n");
		collectInput();
	}
	
	/**
	 * This method collects the users choices and calls the appropriate methods.
	 */
	public static void collectInput() {
		Scanner scanner=new Scanner(System.in);
		int command=scanner.nextInt();

		switch(command) {
		case 1:
			registration(scanner);
			break;
		case 2:
			assignment(scanner);
			break;
		case 3:
			transfer(scanner);
			break;
		case 4:
			request(scanner);
			break;
		case 0:
			finish();
			scanner.close();
			break;
		}
	}
	
		
	/**
	 * This method registers a CompoundID
	 * @param scanner
	 */
	public static void registration(Scanner scanner) {
	 System.out.print("\nPlease Enter the Compound ID you want to Register: ");
	 String ID=scanner.next();
	 Compound newCompound=new Compound(ID); //creates new compound object
	 compoundList.add(newCompound); //adds compound object to arraylist of compound objects
	 System.out.println("Compound "+ID+" has been registered."+"\n");
	 prompt(); 
	}
	
	/**
	 * This method assigns a CompoundID to a Plate
	 * @param scanner
	 */
	public static void assignment(Scanner scanner) {
          System.out.print("\nPlease Enter the Compound ID you want to Assign: ");
	  String ID=scanner.next();
	  System.out.print("Please Enter the Plate you want to Assign "+ID+" to: ");
	  String plateID=scanner.next();
	  assignmentHelper(ID, plateID); //calls a helper method 
	  System.out.println("Compound "+ID+" has been assigned to Plate "+plateID+".\n");
	  prompt();
	}
	
	/**
	 * This is a helper method for the assignment method that creates a new plate and well object
	 * and then adds it into the specific compound object. 
	 * @param ID
	 * @param plateID
	 */
	public static void assignmentHelper(String ID, String plateID) {

	}
	

	/**
	 * This method is to transfer content to and from a number of Wells. 
	 * @param scanner
	 */
	public static void transfer(Scanner scanner) {
	 System.out.print("\nPlease Enter the Well you want to Transfer contents from: ");
	 String ID=scanner.next();
	 System.out.print("Please Enter the Well/Wells you want to Transfer contents to: ");
	 scanner.nextLine();
	 String wells=scanner.nextLine();
	 transferHelper(ID, wells); //calls a helper method
	 System.out.println("Well "+ID+" contents has been Transferred to "+wells+".\n");
	 prompt();
	}
	
	/**
	 * This is the helper method which gets the compound the wells are located in and
	 * transfers the content.
	 * @param ID
	 * @param wells
	 */
	public static void transferHelper(String ID, String wells) {

	}
	
	/**
	 * This is a helper method that returns the correct compound.
	 * @param plateID
	 * @return
	 */
	public static Compound getCompound(String plateID) {

	}
	
	/**
	 * This is a method that gets the compoundId from a particular Well.
	 * @param scanner
	 */
	public static void request(Scanner scanner) {
	  System.out.print("\nPlease Enter the Well you want to Request a Compound from: ");
	  String ID=scanner.next();
	  Compound compound=requestHelper(ID); //calls a helper method
	  if(compound!=null) {
	     System.out.println("Well "+ ID+" belongs to Compound "+compound.toString()+".");
	   }
	   else {
	     System.out.println("That Well does not belong to a Compound.");
	   }
	   prompt();
	}
	
	/**
	 * This is a helper method that returns the compound the well is in.
	 * @param ID
	 * @return compound
	 */
	public static Compound requestHelper(String ID) {

	}
	
	/**
	 * This is a method that prints out the end prompt. 
	 */
	public static void finish() {
	   System.out.println("\nThank you! Have a great day!");
	}
}
