package recursividad;


public class RecursividadD {
	
	public int sumarArray(int inicio, int fin, int[] array) {
		
		if (inicio == fin ) {
			return array[inicio];
		}
		else {
			int mitad = (inicio+fin)/2;
			int x = sumarArray(inicio, mitad, array);
			int y = sumarArray(mitad+1, fin, array);
			
			return x+y;
		}
	}

}
