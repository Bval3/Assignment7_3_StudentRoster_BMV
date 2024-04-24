/**
 * @author Benjamin Valenzuela
 * @version 1.0
 */
import java.io.IOException;
import java.util.Scanner;
public class Application {
	
private static StudentRoster str = new StudentRoster(5);

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		greet(); 
		select(scnr);

	}
	public static void greet() {
		
		System.out.println("Welcome, user. Please select an option from the menu below");
		
	}
	
	

	public static void select(Scanner scnr) {
		double gpa; 
		int count = 0;
		String first; 
		String last; 
		String CAdre;
		String HAdre;
		String pnumber;
		System.out.println("MAIN MENU:");
		System.out.println("0 - Enter information for a new student");
		System.out.println("1 - Print the student roster");
		System.out.println("2 - Search for student info by name");
		System.out.println("3 - Save the student roster to disk");
		System.out.println("4 - Read the student roster from disk");
		System.out.println("5 - Exit");
		
		int input = scnr.nextInt();
		scnr.nextLine();
		while (input !=5) {
		
		if (input == 0) {
			if (count < 5) {
			count++;
			System.out.println("Enter your current adress");
			CAdre = scnr.nextLine();
			System.out.println("Enter your home adress");
			HAdre = scnr.nextLine();
			System.out.println("Enter your phone number");
			pnumber = scnr.nextLine();
			System.out.println("Enter your first name");			
			first = scnr.nextLine();
			System.out.println("Enter your last name");
			last = scnr.nextLine();
			System.out.println("Enter your gpa");
			gpa = scnr.nextDouble();
			Student ns = new Student(CAdre, HAdre, pnumber, first, last, gpa);
			str.add(count, ns);
			}
			else {
			System.out.println("Max students entered");
			}
		}
			else if (input == 1) {
				if (count > 0) {
					System.out.println("Printing student roster...");
					str.printer(count);
				}
				else {
					System.out.println("must enter information into roster first");
				}
		}		
			else if (input == 2) {
			System.out.println("Enter the student's first name");
			String tfname = scnr.next();
			System.out.println("Enter the student's last name");
			String tlname = scnr.next();
			str.rostersearch(tfname, tlname, count);
		}
			else if (input == 3) {
			System.out.println("Saving student roster to disk...");
			if (count == 5) {
			try {
				str.printofile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else {
				Student populate = new Student();
				while (count < 5) {
					++count;
					str.add(count, populate);
				}
				try {
					str.printofile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
			else if (input == 4) {
			count = 5; 
			System.out.println("Retreiving student roster from disk..."); 
			str.readfile();
		}
			else if (input < 0 || input > 5) {
			System.out.println("Not an option, try again");
		}
		System.out.println("MAIN MENU:");
		System.out.println("0 - Enter information for a new student");
		System.out.println("1 - Print the student roster");
		System.out.println("2 - Search for student info by name");
		System.out.println("3 - Save the student roster to disk");
		System.out.println("4 - Read the student roster from disk");
		System.out.println("5 - Exit");
		
		input = scnr.nextInt();
		scnr.nextLine();
		
			}
		System.out.println("Exited");
		}

}
