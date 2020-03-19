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
