// класс для запуска калькулятора. Подерживает ввод пользователя

import java.util.Scanner;

public class InteractRunner{

	public static void main(String[] srgs){

		Scanner reader = new Scanner(System.in);
		
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.print("Enter first arg: ");
				int first = reader.nextInt();
				System.out.print("Enter second arg: ");
				int second = reader.nextInt();
				calc.add(first, second);
				System.out.println("Result: " + calc.getResult());
				calc.cleanResult();
				System.out.print("Exit yes/no: ");
				exit = reader.next();
			}
			
		} finally {
			reader.close();
		}

	}

}