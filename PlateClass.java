/**
 * @author tlsimala
 * 
 * This is the Plate Class which keeps track of plates and well ID it is paired with.
 *
 */
public class Plate {
	private String fullID;
	private String ID;
	private String wellID;
	private String contents;
	/**
	 * Constructor
	 * @param plateID
	 */
	public Plate(String plateID) {
		this.fullID=plateID;
		this.contents="Awesome and Specific Scientific Contents";
	}
  
	/**
	 * This method sets the Plate ID 
	 * for instance, *****.WellID and the Plate ID would be the string and astericks
	 * @param location
	 */
	public void setPlateID(int location) {
	  this.ID=fullID.substring(0, location);
	}

	/**
	 * This method sets the WellID 
	 */
	public void setWellID() {
	  int periodPoint=0;
	  for(int i=0; i<fullID.length(); i++) {
		if(fullID.charAt(i)=='.') {
			periodPoint=i;
			}
		}
	   wellID=fullID.substring(periodPoint, fullID.length());	
	}

	/**
	 * This method returns the plate ID
	 * @return plate ID
	 */
	public String getID() {
	  return ID;
	}

	/**
	 * This method returns the wellID
	 * @return wellID
	 */
	public String getWellID() {
	  return wellID;	
	}

	/**
	 * This method returns the contents of the plate
	 * @return
	 */
	public String getContents() {
	  return contents;	
	}

	/**
	 * This methods returns the fullID of the plate and well IDs 
	 * @return
	 */
	public String getFullID() {
	  return fullID;
	}
}
