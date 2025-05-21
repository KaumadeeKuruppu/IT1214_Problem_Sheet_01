public class Student{
	private int studentId;
	private String name;
	private int day;


Student(int studentId,String name,int day){
	this.studentId=studentId;
	this.name=name;
	this.day=day;
}

public void setName(String name){
	this.name=name;}

public String getName(){
	return name;}
	
public void setStudentID(int studentId){
	this.studentId=studentId;}
	
public int getStudentId(){
	return studentId;}


public void setDay(int day){
	this.day=day;}
	
public int getDay(){
	return day;}
	}

class Classroom{
	private Student[] stuarr=new Student[10];
	private int stucount=0;
	
 void addStudent(Student studets){
	if(stucount<stuarr.length){
		stuarr[stucount]=studets;
		stucount++;
	}
	else{
		System.out.println("Limit is over");
	}	
}
 void updateAttend(int studentId,int updays){
	 for(int i=0; i<stucount;i++){
		 if(stuarr[i].getStudentId()==studentId){
			 stuarr[i].setDay(updays);
				return;
				}
			}
		
System.out.println("Student ID: "+studentId+" is not found");}

  void displayDetails(){
	 System.out.println("Student_ID	Name		Days_Attended");
	 for(int i=0;i<stucount;i++){
		System.out.println(stuarr[i].getStudentId()+"\t\t"+stuarr[i].getName()+"\t"+stuarr[i].getDay()); 
	 }
	 	 
}}
 
 class StuAttendance{
 public static void main(String[]args){
	 Classroom cl=new Classroom();
	 
	 cl.addStudent(new Student(101,"Alice Smith",12));
	  cl.addStudent(new Student(102,"Bob Jones",15));
	   cl.addStudent(new Student(103,"Carol Lee",10));  
	   
	   cl.updateAttend(102,16);
	   cl.updateAttend(104,13);
	   
	   cl.displayDetails();
 }
}







