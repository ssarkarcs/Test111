
public class Residential extends Building 
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential()
	{
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor

	public void Draw()
	{
		System.out.println("Drawing code for Residential");
	}//end draw
	
	public String displayData()
	{
		return "Project name: " + projectName + "\nComplete address: " + completeAddress + "\nTotal square feet: " 
				+ totalSquareFeet + "\nOccupancy group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of bedrooms: "
				+ getNumBedrooms() + "\nNumber of bathrooms: " + getNumBathrooms() + "\nLaundry room: " + isLaundryRoom();
	}//end displayData
	
	//start getters/setters
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	//end getters/setters

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}//end toString
}//end class
