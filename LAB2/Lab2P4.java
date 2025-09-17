import java.util.Scanner;
class Lab2P4{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println((m&n)+","+(m|n)+","+(m^n));



	}
}
