import java.util.Scanner;

public class Calculator {
	public static int menu(){
		System.out.println("[ ID: 1413911 ]");
		System.out.println("[ Name: ������   ]");
		
		System.out.println("1. Add two numbers");
		System.out.println("2. Subtract two numbers");
		System.out.println("3. Multiply two numbers");
		System.out.println("4. Quit");
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		num = scan.nextInt();
		
		return num;
	}
	
	
	public static void add(int addFirstNum, int addSecondNum){		
		int result = addFirstNum + addSecondNum;		
		System.out.println(result);
	}

	
	public static void main(String[] args) {
		
		int menuNum, firstInput, lastInput;
		
		do{
			menuNum = menu();
			
			if(menuNum == 4){
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
			}
			else{
				Scanner scan = new Scanner(System.in);
				
				System.out.print("x: ");
				firstInput = scan.nextInt();
				
				System.out.print("y: ");
				lastInput = scan.nextInt();		
				
				switch(menuNum){
				case 1:
					add(firstInput, lastInput);
					break;
				}
			}	
		
		}while(menuNum != 4);
	}

}