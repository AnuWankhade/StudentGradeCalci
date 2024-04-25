import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentGradeClaci extends JFrame{
	
	int marks_obtained=0;
	
	Scanner sc=new Scanner(System.in);
	
	//Taking and adding all the marks
	public int marksObtainedCalci(int num_Of_Subjects) 
	{
		System.out.println("Enter marks obtained (out of 100) in each subject one by one");
		  for(int i=1;i<=num_Of_Subjects;i++) {
			System.out.println("Subject "+i+" ");
			int marks=sc.nextInt();
			marks_obtained += marks;
			}
		return marks_obtained;  
      }

	//calculating average Percentage
    public int averagePercentage(int total_marks,int num_of_Subjects)	
    {
    	return marks_obtained/num_of_Subjects;
    }
        
	//calculating Grade  
    public String GradeCalci(int avgP)
    {
    	switch(avgP/10) {
    	case 10: return "A"; 
    	case 9 : return "B"; 
    	case 8 : return "C"; 
    	case 7 : return "D"; 
    	case 6 : return "E"; 
    	case 5 : return "F"; 
    	
    	}
		return null;	
	}
 
    
}
