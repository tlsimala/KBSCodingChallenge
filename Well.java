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
		this.plateID=plate.getFullID();
	}
	
	/**
	 * This method gets the contents of the well
	 * @return
	 */
	public String getContents() {
		return contents;
	}
	
	/**
	 * This method sets the contents of the well
	 * @param contentString
	 */
	public void setContents(String contentString) {
		contents=contentString;
	}
	
	/**
	 * This method returns the plate it received contents from
	 * @return plate
	 */
	public Plate getContentFromPlate() {
		return contentFromPlate;
	}
	
	/**
	 * This method sets the plate the well received contents from
	 * @param plate
	 */
	public void setContentFromPlate(Plate plate) {
		this.contentFromPlate=plate;
	}
	
	/**
	 * This method gets the wellID
	 * @return wellID
	 */
	public String getID() {
		return ID;
	}
	
	/**
	 * This method gets the plate ID it is assigned to
	 * @return plateID
	 */
	public String getPlateID() {
		return plateID.toString();
	}
	
	/**
	 * This method gets the compound it belongs to
	 * @return ID of compound
	 */
	public String getCompound() {
		return compoundID.toString();
	}
}
