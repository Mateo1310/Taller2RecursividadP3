package recursividad;

public class RecursividadC {
	 
	public int Factorial(int a) {
		   if (a > 0) {
			   int valorCalculado = a * Factorial(a-1);
			   return valorCalculado;
		   }
		   
		  return 1;
	   }
}
