import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author tlsimala
 * 
 * This is the Compound Class which keeps track of plates and wells as well as finds them.
 *
 */
public class Compound {
	private String ID;
	private HashMap<Plate, ArrayList<Well>> storage;
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
	  ArrayList<Well> wellList=new ArrayList<Well>();
	  storage.put(plate, wellList);
	}
	
	/**
	 * This method adds a well into the arraylist
	 * @param plate
	 * @param well
	 */
	public void AddWell(Plate plate, Well well) {
	   ArrayList<Well> cloneWellList=storage.get(plate);
	   cloneWellList.add(well);
	}
	
	/**
	 * This methods determines whether or not the well is in this particular compound
	 * @param wellID
	 * @return true or false
	 */
	public boolean findWell(String wellID) {
	  Set<Plate> plateSet=storage.keySet(); //a set of plates
	   for(Plate plate: plateSet) {
		ArrayList<Well> wellList=storage.get(plate);
		for(Well well: wellList) { //going through the well list for the plates
		   if(well.getPlateID().equals(wellID)) {
			return true;
	           }
	         }
	      }
		return false;
	}
	
	/**
	 * This finds the plate within the compound and returns it
	 * @param plateID
	 * @return Plate
	 */
	public Plate findPlate(String plateID) {
	  Set<Plate> plateSet=storage.keySet();
	  Plate clonePlate=null;
	   for(Plate plate: plateSet) {
	      if(plate.getFullID().equals(plateID)) {
		clonePlate=plate;
		}
	     }
		return clonePlate;   
	}
	
	/**
	 * This is a toString method which returns the ID as a string
	 * @return the compound ID
	 */
	public String toString() {
	   return ID;
	}
}
