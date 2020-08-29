package recursividad;

public class RecursividadA {

	 public static float division(float a,float b) {
		 if(b>a) {
			 return 0;
		 }
		 else {
			 return 1 + division(a-b, b);
		 }
	 }
	 
}
