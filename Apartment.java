
public class Apartment extends Residential
{
	int numRentableUnits;
	double avgUnitSize;
	boolean parkingAvailable;
	
	public Apartment()
	{
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}//end empty argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup)
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor)
	
	public void Draw()
	{
		System.out.println("Drawing code for Apartment");
	}//end Draw
	
	public String displayData()
	{
		return "Project name: " + projectName + "\nComplete address: " + completeAddress + "\nTotal square feet: " 
				+ totalSquareFeet + "\nOccupancy group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nNumber of bedrooms: "
				+ super.getNumBedrooms() + "\nNumber of bathrooms: " + super.getNumBathrooms() + "\nLaundry room: " 
				+ super.isLaundryRoom() + "\nRentable units: " + getNumRentableUnits() + "\nAverage unit size: " 
				+ getAvgUnitSize() + "\nParking available: " + isParkingAvailable();
	}//end displayData

	//start getters/setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	//end getters/setters

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
}//end class
