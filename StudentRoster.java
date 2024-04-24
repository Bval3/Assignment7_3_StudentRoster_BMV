/**
 * @author Benjamin Valenzuela
 * @version 1.0
 */
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class StudentRoster {
private int numstudents;
private Student[] Roster; 

public StudentRoster () {
	numstudents = 0;
	Roster = new Student [numstudents];
}
	
public StudentRoster ( int nums) {
	numstudents = nums;
	Roster = new Student [numstudents];	
}

public  void add(Integer snum, Student s) {
	int temp = snum -1;
	Roster[temp] = s;
}

public void readfile() {
	 try {
	      File Rosterfile = new File("Roster.txt");
	      Scanner filescanner = new Scanner(Rosterfile);
	      int i = 0;
	      while (filescanner.hasNextLine()&& i < 5) {
	    	Roster[i] = new Student();
		    String cadres = filescanner.nextLine();
	        Roster[i].setcadress(cadres);
	        String hadres = filescanner.nextLine();
	        Roster[i].sethadress(hadres);
	        String p = filescanner.nextLine();
	        Roster[i].setphonenum(p);
	        String fnm = filescanner.nextLine();
	        Roster[i].setfname(fnm);
	        String lnm = filescanner.nextLine();
	        Roster[i].setlname(lnm);
	        double gpa = filescanner.nextDouble();
	        Roster[i].setgpa(gpa);
	        filescanner.nextLine();
	        ++i;
	      }
	      filescanner.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	 System.out.println("Student roster succesfully read from disk");
}

public void printofile() throws IOException{
File WrittenRoster = new File("Roster.txt");
FileWriter fw = new FileWriter(WrittenRoster);
PrintWriter pw = new PrintWriter(fw);
for (int i = 0; i < 5; ++i) {
	pw.printf(Roster[i].getcadress()+"%n");
	pw.printf(Roster[i].gethadress()+"%n");
	pw.printf(Roster[i].getphonenum()+"%n");
	pw.printf(Roster[i].getfname()+"%n");
	pw.printf(Roster[i].getlname()+"%n");
	pw.printf(Roster[i].getgpa()+"%n");
}

pw.close();
	
	
}
	
public void printer(int count) {
	int inc = 1;
	int i = 0;
	while(i < count) {
	System.out.println("----");
	System.out.println("Student "+inc);
	System.out.println("GPA: "+Roster[i].getgpa());
	System.out.println("First name: "+Roster[i].getfname());
	System.out.println("Last name: "+Roster[i].getlname());
	System.out.println("Current adress: "+Roster[i].getcadress());
	System.out.println("Home adress: "+Roster[i].gethadress());
	System.out.println("Phone number: "+Roster[i].getphonenum());
	System.out.println("----");
	++i;
	++inc;
		}
	}

public void rostersearch(String first, String last, int cnt) {
    for (int i = 0; i < cnt; ++i) {
        if (Roster[i].getfname().equals(first) && Roster[i].getlname().equals(last)) {
            System.out.println("Student found!");
            System.out.println("----");
            System.out.println("GPA: " + Roster[i].getgpa());
            System.out.println("First name: " + Roster[i].getfname());
            System.out.println("Last name: " + Roster[i].getlname());
        	System.out.println("Current adress: "+Roster[i].getcadress());
        	System.out.println("Home adress: "+Roster[i].gethadress());
        	System.out.println("Phone number: "+Roster[i].getphonenum());
            System.out.println("----");
            return;
        }
    }
    System.out.println("Student not found.");
}
	

}
