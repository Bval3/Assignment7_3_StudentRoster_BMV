/**
 * @author Benjamin Valenzuela
 * @version 1.0
 */
public class Student {
	private double gpa; 
	private String firstname; 
	private  String lastname; 
	private String CAdress;
	private String HAdress;
	private String pnum;
	
	public Student () {
		gpa = 0.0;
		firstname = "";
		lastname = "";
		CAdress = "";
		HAdress = "";
		pnum = "";
	}
	
	public Student (String cadr, String hadr, String pn, String fn,String ln, double gp) {
		gpa = gp; 
		firstname = fn;
		lastname = ln; 
		CAdress = cadr;
		HAdress = hadr;
		pnum = pn;
	}
	public double getgpa () {
		return gpa;
	}
	public String getfname () {
		return firstname;
	}
 	public String getlname () {
 		return lastname;
 	}
	public String getcadress () {
		return CAdress;
		
	}
	public String gethadress () {
		return HAdress; 
		
	}
	public String getphonenum () {
		return pnum;
		
	}
	
	public void setphonenum(String p) {
		pnum = p;
		
	}
	
	public void setcadress(String cad) {
		CAdress = cad;
	}
	public void sethadress(String had) {
		HAdress = had; 
	}
	public void setfname(String f) {
		firstname = f;
	}
	public void setlname(String l) {
		lastname = l;
	}
	public void setgpa(Double num) {
		gpa = num;
	}
	
	

}
