
import java.util.HashMap;

/**
 * @author tlsimala
 * 
 * This is the Compound Class which keeps track of plates and wells as well as finds them.
 *
 */
public class Compound {
	private String ID;
	private HashMap<Plate, ArrayList<Well>> storage;
  
  //First thoughts: TREE VS HASHMAP
  //do I go the hashmap route or do I make it like a tree? 
  //a tree would give better traversal time if I could sort by the numbers within the plate
  //tree nodes would allow me to keep the connection between the compound, plates, and wells 
  
  //hashmaps would allow for the unqiue plate and I could just throw all of the wells into the arraylist to keep track of them
  //this is not a good reason, but I like hashmaps a little bit more than trees and it seems like it would be more iterative
  //which may turn out to be more gross to debug in the end 
  
  //WELL OBJECT, PLATE OBJECT, COMPOUND OBJECT?
  //I think I want to make a class for well and plate objects because I believe if I was a scientist there is more than
  //meets the eye to wells and plates and that even if it isn't fit for this challenge, there is more ifnormation that
  //would be nice to store in them or reside in them already
  //also who doesn't love object oriented design hahaha 
  //also its always better to generalize the objects so you don't have to code more 
  

	/**
	 * The constructor
	 * @param idString
	 */
	public Compound(String idString) {
		this.ID=idString;
		this.storage=new HashMap<Plate, ArrayList<Well>>();
	}
	
	/**
	 * This method adds a plate into the hashmap
	 * @param plate
	 */
	public void AddPlate(Plate plate) {
		
	}
	
	/**
	 * This method adds a well into the arraylist
	 * @param plate
	 * @param well
	 */
	public void AddWell(Plate plate, Well well) {
		
	}
	
	/**
	 * This methods determines whether or not the well is in this particular compound
	 * @param wellID
	 * @return true or false
	 */
	public boolean findWell(String wellID) {
		
		return false;
	}
	
	/**
	 * This finds the plate within the compound and returns it
	 * @param plateID
	 * @return Plate
	 */
	public Plate findPlate(String plateID) {
		
		return null;   
	}
	
	/**
	 * This is a toString method which returns the ID as a string
	 * @return the compound ID
	 */
	public String toString() {
		return ID;
	}
}
