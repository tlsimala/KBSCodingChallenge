/**
 * @author tlsimala
 * 
 * This is the Well Class which keeps track of well and the plateID it is assigned to. 
 *
 */
public class Well {

	private String ID;
	private Compound compoundID;
	private String plateID;
	private Plate contentFromPlate;
	private String contents;
	/**
	 * Constructor
	 * @param idString
	 * @param plate
	 * @param compound
	 */
	public Well(String idString, Plate plate, Compound compound) {
		this.ID=idString;
		this.compoundID=compound;
		this.plateID=plate.getID();
	}
	
	/**
	 * This method gets the contents of the well
	 * @return
	 */
	public String getContents() {
		
	}
	
	/**
	 * This method sets the contents of the well
	 * @param contentString
	 */
	public void setContents(String contentString) {
		
	}
	
	/**
	 * This method returns the plate it received contents from
	 * @return plate
	 */
	public Plate getContentFromPlate() {
		
	}
	
	/**
	 * This method sets the plate the well received contents from
	 * @param plate
	 */
	public void setContentFromPlate(Plate plate) {
		
	}
	
	/**
	 * This method gets the wellID
	 * @return wellID
	 */
	public String getID() {
		
	}
	
	/**
	 * This method gets the plate ID it is assigned to
	 * @return plateID
	 */
	public String getPlateID() {
		
	}
	
	/**
	 * This method gets the compound it belongs to
	 * @return ID of compound
	 */
	public String getCompound() {
		
	}
}
