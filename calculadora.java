
public class Calculadora {

	public static void main(String[] args) {
		
		String operacao = "sub";
		double op1 = 4;
		double op2 = 2;
		
		
		switch(operacao) {
		
		case "soma":
			System.out.println(op1+op2);
			break;
			
		case "sub":
			System.out.println(op1-op2);
			break;
		
		case "multi":
			System.out.println(op1*op2);
			break;

		case "div":
			System.out.println(op1/op2);
			break;
			
		}
	}
}
