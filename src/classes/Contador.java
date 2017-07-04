package classes;

public class Contador {
	private static long z;

	public static void adicionar(long i) {
		z += i;
	}
	
	public static long getContador() {
		return z;
	}

	public static void resetar() {
		z = 0;
	}
}
