import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("El numero es divisible entre 2");
		}else {
			System.out.println("El numero no es divisible entre 2");
		}

	}

}
