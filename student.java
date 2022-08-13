package sum;

public class student 
{
	// declaring variables
   String studentName; 
   int studentRoll;
   float markSub1;
   float markSub2;
   float totalSum;
   float totalAvg;
   
   //functions or methods
   void calculateSum()
   {
	   totalSum=markSub1+markSub2;
   }
   void calculateAvg()
   {
	   totalAvg=totalSum/2;
   }
   
   public static void main(String[] args)
   {
	student student1 = new student(); //object creation
	student1.studentName = "aksara";
	student1.studentRoll = 1;
	student1.markSub1 = 55;
	student1.markSub2 = 80;
	student1.calculateSum();
	student1.calculateAvg();
	
	System.out.println("marks sum and average");
	System.out.println("=====================");
	System.out.println("student name:");
	System.out.println(student1.studentName);
	System.out.println("student roll no:");
	System.out.println(student1.studentRoll);
	System.out.println("marks of subject1:");
	System.out.println(student1.markSub1);
	System.out.println("marks of subject2");
	System.out.println(student1.markSub2);
	System.out.println("total:");
	System.out.println(student1.totalSum);
	System.out.println("average:");
	System.out.println(student1.totalAvg);
	
   }
}
