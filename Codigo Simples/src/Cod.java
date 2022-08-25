import java.util.Locale;
import java.util.Scanner;

public class Cod {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

            double tt, raio2, resultado;
            
            Locale.setDefault(Locale.US);
            
		     tt = 3.14159;
	         raio2 = sc.nextDouble();
			
		     resultado = tt * 2 * raio2;
            

			System.out.printf("A = %.4f%n", resultado);

			sc.close();
		}
}
