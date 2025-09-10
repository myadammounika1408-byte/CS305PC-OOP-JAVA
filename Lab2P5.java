import java.util.Scanner;
class Lab2P5{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int count = 0;
		for(int i = 1;i<=m;i++){
			if(m%i==0)
			count++;
		}
		if(count == 2)
		System.out.println("Prime Number");
		else
		System.out.println("Not Prime Number");
	}
}
