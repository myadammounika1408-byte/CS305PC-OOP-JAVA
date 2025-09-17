import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
			Scanner s= new Scanner(System.in);
			int x=s.nextInt();
			String y=s.next();
			Lab3P4 l= new Lab3P4();
			Lab3P4 l1=new Lab3P4(x);
			Lab3P4 l2=new Lab3P4(y);
			Lab3P4 l3=new Lab3P4(x,y);	
	}
	Lab3P4(){
		System.out.println("Constructor without params");
	}
	Lab3P4(int x){
		System.out.println("Constructor with int params: "+x);
	}
	Lab3P4(String s){
		System.out.println("Constructor with String params: "+s);
	}
	Lab3P4(int x,String s){
		System.out.println("Constructor with int and String params: "+x+" "+s);
	}
}
