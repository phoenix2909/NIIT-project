package app1;

public class Manager {
	public static void main(String[] args) {
		Twowheeler t1=new Twowheeler();
		int s1=t1.getcost();
		int s2=t1.getspeed();
		System.out.println("Cost of two wheeler is= $"+s1);
		System.out.println("Speed of two wheeler is="+s2 +"kmph");
		Threevehicle t2=new Threevehicle();
		int v1=t2.getcost();
		int v2=t2.getspeed();
		System.out.println("Cost of three wheeler is= $"+v1);
		System.out.println("Speed of three wheeler is="+v2 +"kmph");
		Fourwheeler f1=new Fourwheeler();
		int fw1=f1.getcost();
		int fw2=f1.getspeed();
		System.out.println("Cost of four wheeler is= $"+fw1);
		System.out.println("Speed of four wheeler is="+fw2 +"kmph");
	}

}
