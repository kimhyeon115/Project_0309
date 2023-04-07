package Package_1;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		CompleteCalc completecalc= (CompleteCalc)calc;
		completecalc.showInfo();
		completecalc.description();
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr2)); 
	}

}
