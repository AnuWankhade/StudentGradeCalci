import java.util.Scanner;

public class MainApp {

public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
    System.out.println("*****Welcome to Student Grade Calculator*****\n");
    
    //Taking input for how many subjects do you have
    System.out.println("Enter the number of Subjects : ");
    int n=sc.nextInt();
   
   
    StudentGradeClaci s1=new StudentGradeClaci();
    //taking and adding all the marks
    int Total_marks_obtained = s1.marksObtainedCalci(n);
    
    //Calculating average Percentage
    int avragePercentage = s1.averagePercentage(Total_marks_obtained, n);
    
    //Calculating grade
    String Grade = s1.GradeCalci(avragePercentage);
    
    
    System.out.println("Total marks Obtained:" +Total_marks_obtained);
    System.out.println("Average Percentage :"+avragePercentage);
    System.out.println("Grade :" +Grade);
}
}
