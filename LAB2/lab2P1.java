import java.util.scanner;
class LAB2P1{
      public static void main(String...args){
              Scanner sc = new Scanner(System.in);
              int m = sc.nextInt();
              sc.nextLine();
              string op = sc.nextLine();
              switch(op){
                  	case "++":
                  	 	System.out.println(m++);
                  	 	System.out.println(++m);
                  	 	break;
                  	case "--":
                  		System.out.println(m--);
                  		System.out.println(--m);
                  		break;
                  	case "+":
                  		System.out.println(m+);
                   		break;
                   	case "-":
                   		System.out.println(m-);
                   		break;
                   	default:
                   		System.out.println("You have entered invalid operator");
                   		break;
                }
      }
}             
