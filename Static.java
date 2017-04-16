package app1;

public class Static {
static int i =90;
int j = 20;
public static void main(String[] args) {
	System.out.println(Static.i);
	Static obj1=new Static();
	System.out.println(obj1.j);
	obj1.j=30;
	Static obj2=new Static();
	System.out.println(obj2.j);
	System.out.println(obj1.j);
}
}
