
public class Mall extends Business 
{
	int numRentedUnits;
	double medianUnitSize;
	int numParkingSpaces;
	
	public Mall()
	{
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor)
	
	public void Draw()
	{
		System.out.println("Drawing code for Mall");
	}//end Draw
	
	public String displayData()
	{
		return "Project name: " + projectName + "\nComplete address: " + completeAddress + "\nTotal square feet: " 
				+ totalSquareFeet + "\nOccupancy group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nRentable units: " 
				+ super.getNumRentableUnits() + "\nNumber of rented units: " + getNumRentedUnits() 
				+ "\nMedian unit size: " + getMedianUnitSize() + "\nNumber of parking spaces: " + getNumParkingSpaces();
	}

	//start getters/setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	//end getters/setters

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
}//end class
