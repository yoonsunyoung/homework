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
		
		int menuNum;
		menuNum = scan.nextInt();
		
		return menuNum;
	}
	
	
	public static int add(int addFirstNum, int addSecondNum){		
		return addFirstNum + addSecondNum;
	}
	
	public static int subtract(int subtractionFirstNum, int subtractionSecondNum){		
		return subtractionFirstNum - subtractionSecondNum;
	}

	
	public static void main(String[] args) {
		
		int menuNum, firstInput, lastInput;
		int result = 0;
		
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
					result = add(firstInput, lastInput);
					break;
				case 2:
					result = subtract(firstInput, lastInput);
					break;
				}
				
				System.out.println("The result is "+ result);
			}	
		
		}while(menuNum != 4);
	}

}