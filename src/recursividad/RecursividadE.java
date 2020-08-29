package recursividad;

public class RecursividadE {

	

	public int contarPares(int[] array, int posicion) {
		int cantidadPares = 0;
		if (posicion == array.length - 1) {
			System.out.println("La cantidad de numeros pares en el arreglo es: " + cantidadPares);
		} else {
			if (array[posicion] % 2 == 0) {
				cantidadPares++;
			}
			
		    return cantidadPares + contarPares(array, posicion + 1);
		}
		return 1;
	}
}
