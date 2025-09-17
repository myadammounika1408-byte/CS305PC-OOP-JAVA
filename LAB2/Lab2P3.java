import java.util.Scanner;
class Lab2P3{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
	        
	        String op = sc.nextLine();
	        var str = switch(op){
	        	case "++" -> "Hello";
	        	case "++" , "--" , "+" , "-" -> "Not good";
	        	default -> "sorry";
		};
		System.out.println("Result is:" +str);

   }
}
