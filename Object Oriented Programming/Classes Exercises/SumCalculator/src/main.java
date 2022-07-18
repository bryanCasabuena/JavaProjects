
public class main {

	public static void main(String[] args) {
		
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4.0);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(0);
		System.out.println("multliply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

}
