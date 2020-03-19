
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
		for (int i = 0; i < compoundList.size(); i++) {
			Compound compoundClone=compoundList.get(i); //searching through arraylist of compound objects
			String compoundID=compoundClone.toString(); //getting string of the compound's ID
			if(compoundID.equals(ID)) { 
				Plate plate=new Plate(plateID); //new plate object
				plate.setWellID(); //set the well ID field in plate object
				Well well=new Well(plate.getWellID(), plate, compoundClone); //new well object
				compoundClone.AddPlate(plate); //add the plate object and well object into an hashmap of arraylists in the compound object
				compoundClone.AddWell(plate, well);
			}
		}
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
		Compound compound=getCompound(ID); //gets compound 
		Plate plate=compound.findPlate(ID); //gets plate
		String updatedPlates=wells.trim(); 
		String[] platesArray=updatedPlates.split(","); //splits the wells string to break down the number of wells
		for(int i=0; i<platesArray.length; i++) {
			String newPlateString=platesArray[i]; 
			//newPlateString=newPlateString.substring(0);//handle the space
			newPlateString=newPlateString.trim();
			Plate newPlate=new Plate(newPlateString);  //create a new plate
			newPlate.setWellID(); //set the well ID of that plate
			Well newWell=new Well(newPlate.getWellID(), newPlate, compound); //new well object
			newWell.setContents(plate.getContents()); //transferring of the content
			newWell.setContentFromPlate(plate);
			compound.AddWell(plate, newWell); //adding the new wells into the compound object
		}
	}
	
	/**
	 * This is a helper method that returns the correct compound.
	 * @param plateID
	 * @return
	 */
	public static Compound getCompound(String plateID) {
		Compound compound=null;
		for (int i = 0; i < compoundList.size(); i++) {
			compound=compoundList.get(i);
			if(compound.findPlate(plateID)!=null) {
				return compound;
			}
		}
		return null;
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
		Compound compound=null;
		for (int i = 0; i < compoundList.size(); i++) {
			compound=compoundList.get(i);
			boolean answer=compound.findWell(ID);
			if(answer==true) {
				return compound;
			}
		}
		return null;
	}
	
	/**
	 * This is a method that prints out the end prompt. 
	 */
	public static void finish() {
		System.out.println("\nThank you! Have a great day!");
	}
}
