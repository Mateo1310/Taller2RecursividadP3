package recursividad;

public class Program {

	public static void main(String[] args) {
		
		
		/*RecursividadA division = new RecursividadA();
		float x = RecursividadA.division(60, 15);
		System.out.println("resultado: "+x );
        */
		
		/*RecursividadB potencia = new RecursividadB();
		int resultado = potencia.Potencia(2, 3);
		System.out.println(resultado);
		*/
		
		/*RecursividadC factorial = new RecursividadC();
		int resultado = factorial.Factorial(5);
		System.out.println(resultado);
		*/
		
		/*int[] array= {1,3,4};
		RecursividadD suma = new RecursividadD();
		int resultado= suma.sumarArray(0, array.length-1, array);
		System.out.println(resultado);
		*/
		
		int[] array= {1,2,3,4,5,6};
		RecursividadE par = new RecursividadE();
		par.contarPares(array, 0);
		
	}

}
