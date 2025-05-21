 class Vehical{
	private String licensePlate;
	private String name;
	private int hoursParked;

Vehical(String licensePlate,String name,int hoursParked){
	this.licensePlate=licensePlate;
	this.name=name;
	this.hoursParked=hoursParked;
}

public void setName(String name){
	this.name=name;}

public String getName(){
	return name;}
	
public void setLicense(String licensePlate){
	this.licensePlate=licensePlate;}
	
public String getLicense(){
	return licensePlate;}


public void setHoursPark(int hoursParked){
	this.hoursParked=hoursParked;}
	
public int getHours(){
	return hoursParked;}


}

class ParkingLot{
	private Vehical[] vehiarray=new Vehical[5];
	int vehicalcount=0;
	
void addVehical(Vehical vehicals){
	if(vehicalcount<vehiarray.length){
		vehiarray[vehicalcount]=vehicals;
		vehicalcount++;
	}
	else{
		System.out.println("Parking Limit is over");
	}
	
}

void removehical(String licensePlate) {
    for (int i = 0; i < vehicalcount; i++) 
	{ if (vehiarray[i].getLicense() == licensePlate)
		{  for (int j = i; j < vehicalcount - 1; j++)
			{ 
                vehiarray[j] = vehiarray[j + 1]; 
            }
            vehiarray[vehicalcount - 1] = null; 
            vehicalcount--; 
            return; 
        }
    }
    System.out.println("Licence Plate " + licensePlate + " is n");
}

  void displayDetails(){
	 for(int i=0;i<vehicalcount;i++){
		System.out.println("License: "+vehiarray[i].getLicense()+" Owner:"+vehiarray[i].getName()+" Hours: "+vehiarray[i].getHours()); 
	 }
	 	 
}	
	
}


 class VehicalParking{
 public static void main(String[]args){
	ParkingLot p1=new ParkingLot();
	 
	p1.addVehical(new Vehical("ABC123","John Doe",2));
	p1.addVehical(new Vehical("XYZ789","Jane Smith",4));
	p1.addVehical(new Vehical("LMN456","Bob Brownh",1));	 
	   
	 p1.removehical("XYZ789")  ;
	   
	   p1.displayDetails();
 }
}