package app1;
import java.util.Scanner;
public class fact {
	static int factorial(int n){
		if (n==0)
			return(1);
		else
			return(n*factorial(n-1));
	}
public static void main(String[] args) {
	int f=1;
	Scanner sc=new Scanner(System.in); 
System.out.println("Enter the number");
int n= sc.nextInt();
f=factorial(n);
System.out.println("The factorial of"+n+"is"+f);
}
}


