import java.util.Scanner;
public class sampelwhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		int mg , fg;
		String fname, subject = " ";
		int process, average ; 
		int tp = 0, tf = 0;
		char exitChar;
		
		
	
		
		
		
		do {
			
			System.out.println("Enter Fname: ");
			fname = num.next();
			System.out.println("Subject: ");
			subject = num.next();
			System.out.println("Enter midterm grade:  ");
			mg = num.nextInt();
			System.out.println("Enter final grade:  ");
			fg = num.nextInt();
			
			average = (mg+fg)/2;
			
			System.out.println("Fname: "+fname);
			System.out.println("Subject: "+subject);
			System.out.println("average: "+average);
			
			if(average<=3) {
				tp++;
				System.out.println("PASSED");
			}
			else {
				tf++;
				System.out.println("FAILED");
			}

			System.out.println("Do you want to Continue press Y not ? press N");
			exitChar = num.next().charAt(0);
			
		}
			
		while((exitChar=='y')||(exitChar=='Y'));
			System.out.println("NUM OF PASSED: "+tp);
			System.out.println("NUM OF FAILED: "+tf);
			process = tp + tf ; 
			System.out.println("NUM OF PROCS STUD: "+process);
			
		
	
	
		
		
		
		
	
		
		
		
		

	}

}
