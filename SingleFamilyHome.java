
public class SingleFamilyHome extends Residential 
{
	boolean garage;
	
	public SingleFamilyHome()
	{
		garage = false;
	}//end empty argument constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor))
	
	public void Draw()
	{
		System.out.println("Drawing code for SingleFamilyHome");
	}//end Draw
	
	public String displayData()
	{
		return "Project name: " + projectName + "\nComplete address: " + completeAddress + "\nTotal square feet: " 
				+ totalSquareFeet + "\nOccupancy group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of bedrooms: "
				+ super.getNumBedrooms() + "\nNumber of bathrooms: " + super.getNumBathrooms() + "\nLaundry room: " + super.isLaundryRoom() 
				+ "\nGarrage: " + isGarage();
	}//end displayData

	//start getters/setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	//end getters/setters

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
}//end class
