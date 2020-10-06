import java.util.Scanner;

// Create class

public class StudentDB {
	static Scanner s1=new Scanner(System.in);
	int rollno,total=0;
	float percent;
	int[] marks=new int[5];
	String grade;
	void getData() {
		System.out.println("Enter Rollno:");
		rollno=s1.nextInt();
		System.out.println("Enter Marks of student out of 100:");
		for(int i=0;i<5;i++) {
    		marks[i]=s1.nextInt();
    	}
	}
	void putData() {
		System.out.println("Rollno:"+rollno);
		for(int i=0;i<5;i++) {
    		total=total+marks[i];
    	}
	  System.out.println(total);
	  percent=(total*100)/500;
	  if(percent>=60) {
		  grade="First Class!";
	  }else if(percent>=50 && percent<=59){
		  grade="Second Class!";
	  }else if(percent>=40 && percent<=49){
		  grade="Pass!";
	  }else if(percent>0 && percent<40) {
		  grade="Fail!";
	  }
// 		Print statement added 
	  System.out.println("percentage:"+percent+"\n"+"Grade:"+grade);
	}
	
// 	Main function added
	
    public static void main(String args[]) {
	    
// 	    Print Count of student
	    
    	System.out.println("Enter count of Students:");
    	int cnt=s1.nextInt();
    	StudentDB students[]=new StudentDB[cnt];
    	for(int i=0;i<cnt;i++) {
    		students[i]=new StudentDB();
    	}
    	for(int i=0;i<cnt;i++) {
    		students[i].getData();
    	}
    	for(int i=0;i<cnt;i++) {
    		students[i].putData();
    	}
    }
}
