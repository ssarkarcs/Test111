
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//start Building test
		Building building1 = new Building("Hill House", "123 Elm Street, Louisille, Kentucky 40241", 2200, "Residential", "R1");
		building1.Draw();
		building1.setProjectName("Hill House");
		building1.getProjectName();
		building1.setCompleteAddress("123 Elm Street, Louisille, Kentucky 40241");
		building1.getCompleteAddress();
		building1.setTotalSquareFeet(2200);
		building1.getTotalSquareFeet();
		building1.setOccupancyGroup("Residential");
		building1.getOccupancyGroup();
		building1.setSubgroup("R1");
		building1.getSubgroup();
		System.out.println(building1.displayData()+"\n");
		System.out.println(building1.toString()+"\n");
		//end Building test
		
		//start Residential test
		Residential res = new Residential("Johnson House", "4495 Warsham Lane, Monticello, Kentucky 42633", 900, "Residential", "R2");
		res.Draw();
		res.setProjectName("Johnson House");
		res.getProjectName();
		res.setCompleteAddress("4495 Warsham Lane, Monticello, Kentucky 42633");
		res.getCompleteAddress();
		res.setTotalSquareFeet(900);
		res.getTotalSquareFeet();
		res.setOccupancyGroup("Residential");
		res.getOccupancyGroup();
		res.setSubgroup("R1");
		res.getSubgroup();
		res.setNumBathrooms(1);
		res.getNumBathrooms();
		res.setNumBedrooms(1);
		res.getNumBedrooms();
		res.setLaundryRoom(false);
		res.isLaundryRoom();
		System.out.println(res.displayData()+"\n");
		System.out.println(res.toString()+"\n");
		//end Residential test
		
		//start Business test		
		Business bus1 = new Business("Data_Max", "9801 Enterprise Drive, Lexington, Kentucky 40502", 5400, "Business", "B");
		bus1.Draw();
		bus1.setProjectName("Data_Max");
		bus1.getProjectName();
		bus1.setCompleteAddress("9801 Enterprise Drive, Lexington, Kentucky 40502");
		bus1.getCompleteAddress();
		bus1.setTotalSquareFeet(5400);
		bus1.getTotalSquareFeet();
		bus1.setOccupancyGroup("Business");
		bus1.getOccupancyGroup();
		bus1.setSubgroup("B");
		bus1.getSubgroup();
		bus1.setNumRentableUnits(2);
		bus1.getNumRentableUnits();
		System.out.println(bus1.displayData()+"\n");
		System.out.println(bus1.toString()+"\n");
		//end Business test
		
		//start Single Family Home test
		SingleFamilyHome sfh = new SingleFamilyHome("Jones House", "451 Oak Drive, Louisville, Kentucky 40018", 1700.5, "Residential", "R1");
		sfh.Draw();
		sfh.setProjectName("Jones House");
		sfh.getProjectName();
		sfh.setCompleteAddress("451 Oak Drive, Louisville, Kentucky 40018");
		sfh.getCompleteAddress();
		sfh.setTotalSquareFeet(1700.5);
		sfh.getTotalSquareFeet();
		sfh.setOccupancyGroup("Residential");
		sfh.getOccupancyGroup();
		sfh.setSubgroup("R1");
		sfh.getSubgroup();
		sfh.setNumBathrooms(3);
		sfh.getNumBathrooms();
		sfh.setNumBedrooms(5);
		sfh.getNumBathrooms();
		sfh.setLaundryRoom(true);
		sfh.isLaundryRoom();
		sfh.setGarage(true);
		sfh.isGarage();
		System.out.println(sfh.displayData()+"\n");
		System.out.println(sfh.toString()+"\n");
		//end Single Family Home test
		
		//start Apartment test
		Apartment apt = new Apartment("Smith Apartment", "45 Baker Street Apt. 5, Louisville, Kentucky 40027", 1100.0, "Residential", "R2");
		apt.Draw();
		apt.setProjectName("Smith Apartment");
		apt.getProjectName();
		apt.setCompleteAddress("45 Baker Street Apt. 5, Louisville, Kentucky 40027");
		apt.getCompleteAddress();
		apt.setTotalSquareFeet(1100);
		apt.getTotalSquareFeet();
		apt.setOccupancyGroup("Residential");
		apt.getOccupancyGroup();
		apt.setSubgroup("R2");
		apt.getSubgroup();
		apt.setNumBathrooms(1);
		apt.getNumBathrooms();
		apt.setNumBedrooms(2);
		apt.getNumBedrooms();
		apt.setLaundryRoom(false);
		apt.isLaundryRoom();
		apt.setNumRentableUnits(5);
		apt.getNumRentableUnits();
		apt.setAvgUnitSize(1200);
		apt.getAvgUnitSize();
		apt.setParkingAvailable(false);
		apt.isParkingAvailable();
		System.out.println(apt.displayData()+"\n");
		System.out.println(apt.toString()+"\n");
		//end Apartment test
		
		//start Mall test
		Mall triMall = new Mall("Tri-county Mall", "5800 Business Road, Lexington, Kentucky 40503", 9800, "Mercantile", "M");
		triMall.Draw();
		triMall.setProjectName("Tri-county Mall");
		triMall.getProjectName();
		triMall.setCompleteAddress("5800 Business Road, Lexington, Kentucky 40503");
		triMall.getCompleteAddress();
		triMall.setTotalSquareFeet(9800);
		triMall.getTotalSquareFeet();
		triMall.setOccupancyGroup("Mercantile");
		triMall.getOccupancyGroup();
		triMall.setSubgroup("M");
		triMall.getSubgroup();
		triMall.setNumRentableUnits(18);
		triMall.getNumRentableUnits();
		triMall.setMedianUnitSize(2200);
		triMall.getMedianUnitSize();
		triMall.setNumParkingSpaces(500);
		triMall.getNumParkingSpaces();
		triMall.setNumRentedUnits(7);
		triMall.getNumRentedUnits();
		System.out.println(triMall.displayData()+"\n");
		System.out.println(triMall.toString()+"\n");
		//end Mall test
	}//end Main
}//end class