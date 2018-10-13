import java.math.BigDecimal;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("ECLIPSE ");
		System.out.println("Pruebas en Git and GitHub");
		System.out.println("Practicando en Java con Visual Studio Code");
		System.out.println("Practicando en Java con Eclipse");
		System.out.println("13/10/18");
		int a = 5;
		int b = 6;
		int c = a + b;
		String num = "10";
		System.out.println(c);
		System.out.println(Integer.parseInt(num)+c);

		System.out.println("-------------------------------");
		System.out.println("CICLO FOR");
		for(int i=0; i<=10; i++) {
			if(i == 10) {
				System.out.println(i);
			}else {
				System.out.print(i+", ");
			}
		}
		
		System.out.println("CLICLO WHILE");
		int i = 0;
		while(i <= 10) {
			if(i == 10) {
				System.out.println(i);
			}else {
				System.out.print(i+", ");
			}
			i++;
		}
		
		System.out.println("CLICLO DO WHILE");
		int y = 0;
		do {
			if(y == 10) {
				System.out.println(y);
			}else {
				System.out.print(y+", ");
			}
			y++;
		}while(y<=10);
		
		System.out.println("-------------------------------");
		
		BigDecimal f = new BigDecimal(5);
		BigDecimal v = new BigDecimal(2);
		
		String ope = Operaciones(f, v, "-");
		System.out.print(ope);
	}
	
	public static String Operaciones(BigDecimal a, BigDecimal b, String x) {
		BigDecimal c = BigDecimal.ZERO;
		if(x.equals("+")) {
			c = a.add(b);
		}else if(x.equals("-")) {
			c = a.subtract(b);
		}else if(x.equals("*")) {
			c = a.multiply(b);
		}else if(x.equals("/")){
			if(b == BigDecimal.ZERO) {
				return "NO SE PUEDE DIVIDIR ENTRE UN NUMERO 0";
			}
			c = a.divide(b);
		}
		return c.toString();
	}

}
