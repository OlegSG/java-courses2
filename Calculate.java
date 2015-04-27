public class Calculate{

	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		System.out.println("Summ = " + summ);
		int diff = first - second;
		System.out.println("Diff = " + diff);
		int mult = first * second;
		System.out.println("Mult = " + mult);
		double divide = (double) (first / second);
		System.out.println("Divide = " + divide);		
		double degree = Math.pow(first, second);
		System.out.println("Degree " + first + "^" + second + " = " + degree);

	}
}