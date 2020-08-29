package recursividad;

public class RecursividadB {
	
	public  int Potencia(int a, int b) {
		if (b==1) {
			return a;
		}
		else if (b==0) {
			return 1;
		}
		
		else {
			return a*Potencia(a, b-1);
		}
	}
}
