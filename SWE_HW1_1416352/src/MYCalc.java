import java.util.Scanner;
public class MYCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=0;
		Scanner scan = new Scanner(System.in);
		int inserted_menu=0;
		System.out.print("[ ID: 1416352] \r[ Name: LEE MINA ] \r");
		do{
			System.out.print("\r");
			System.out.print("1. Add two numbers \r");
			System.out.print("2. Subtract two numbers \r");
			System.out.print("3. Multiply two numbers \r");
			System.out.print("4. Quit \r ");
			System.out.print("\r");
			System.out.print("> ");
			inserted_menu = scan.nextInt();

			System.out.print("\r");
			if(inserted_menu!=4){
				System.out.println("Input two numbers");
				System.out.print("number1 : ");
				number1 = scan.nextInt();
				System.out.print("number2 : ");
				number2 = scan.nextInt();
			}
		}while(inserted_menu!=4);
		
		System.out.print("\r");
	}

}
