package app1;
import java.util.Scanner;
public class Login{
	String name; 
	String ag;
	String usr;
	String pwd;
	String eusr;
	String epwd;
	String getv;

	//validate name
		public boolean validatename(String n){
			String regex = "^[a-zA-Z]+$";
			n=n.trim();
			if (n.matches(regex))
			{
				return true;
			}
			else
			{
				System.out.println("Only characters allowed. Please re-enter the name");
				return false;
			}
			}
		
	//validate age
			public boolean validateage(String age){
				String regex = "^[0-9]+$";
				age=age.trim();
				if (age.matches(regex))
				{
					return true;
				}
				else
				{
					System.out.println("Only numbers allowed. Please re-enter the age");
					return false;
				}
				}

	//validate username
			public boolean validateusername(String usr){
			String regex = "^[a-zA-Z0-9]+$";
			usr=usr.trim();
			if (usr.length() > 6) 
			{
			System.out.println("Only 6 cha allowed. Re-enter the username");
			return false;
			}
			else 
				if (usr.matches(regex))
					{
					return true;
					}
					else
					{
					System.out.println("No Special cha allowed. Re-enter the username");
					return false;	
					}
					}

	//validate password
			public boolean validatepwd(String pwd){
			String regex = "^[a-zA-Z0-9@!_$*#]+$";
			pwd=pwd.trim();
			if (pwd.length() > 8)
			{
				System.out.println("Only 8 cha allowed. Re-enter the pwd");
				return false;
				}
				else 
					if (pwd.matches(regex))
						{
						return true;
						}
						else
						{
						System.out.println("Entered invalid cha. Re-enter the pwd");
						return false;	
						}
						}
			
			public boolean readName()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name");
				name = sc.next();
				boolean a=validatename(name);
				return a;
			}

			public boolean getage()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your age");
				ag = sc.next();
				boolean b=validateage(ag);
				return b;
			}
			
			public boolean getusr()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your Username");
				usr = sc.next();
				boolean c=validateusername(usr);
				return c;
			}
			
			public boolean getpwd()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your Password");
				pwd = sc.next();
				boolean d=validatepwd(pwd);
				return d;
			}
			
			public String entusr()
			{	
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the username");
				eusr = sc.next();
				return eusr;
			}
			
			public String entpwd()
			{	
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter the password");
				epwd = sc.next();
				return epwd;
			}
			
			public String getagain()
			{	
				Scanner sc = new Scanner(System.in);
				getv = sc.next();
				return getv;
			}
		public static void main(String[] args) {
			
	//Get name and validate
			Login r1 = new Login ();
			if(!r1.readName())
			{
				r1.readName();
			}
			System.out.println("Name : "+r1.name);

	//Get age and validate
			if (!r1.getage())
			{
				r1.getage();
			}
			System.out.println("Age : "+r1.ag);
			
			if (!r1.getusr())
			{
				r1.getusr();
			}
			System.out.println("Username: "+r1.usr);
			
			if (!r1.getpwd())
			{
				r1.getpwd();
			}
			System.out.println("Password: "+r1.pwd);

			
	// Final print
			System.out.println("Your Registration is sucess!");
			System.out.println("Login form");
			System.out.println("----------");		
		
			r1.entusr();
			r1.entpwd();
			
			System.out.println(r1.eusr + r1.epwd);
			
			if (r1.eusr.equals(r1.usr) && r1.epwd.equals(r1.pwd))
			{
				System.out.println("Your login is success! Your details are:");
				System.out.println("Name: " +r1.name);
				System.out.println("Age: " +r1.ag);
				System.out.println("User-name: " +r1.usr);
				System.out.println("Password: " +r1.pwd);
				System.out.println("Do you wish to register again? (Y/N)");
				r1.getagain();
			}
			else 
			{
				System.out.println("Your details are not found in database.");
			}
				
			if (r1.getv.equals("Y"))
			{
				r1.readName();
				r1.getage();
				r1.getusr();
				r1.getpwd();
				System.out.println("Your Registration is sucess!");
				System.out.println("Login form");
				System.out.println("----------");		
				r1.entusr();
				r1.entpwd();
			}else
			{
				System.out.println("Thanks for Registering.");
			}
			
		}		
}