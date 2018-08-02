
public class MontoEscrito {
 short entrada = 2;
 
	public static String Convertir (short entrada, String salida) {
		int cifras = Integer.toString(entrada).length();
		
		if (cifras == 1) {
			//Es del 0 al 9
			if(entrada == 1) {salida = "UN";}
			if(entrada == 2) {salida = "DOS";}
			if(entrada == 3) {salida = "TRES";}
			if(entrada == 4) {salida = "CUATRO";}
			if(entrada == 5) {salida = "CINCO";}
			if(entrada == 6) {salida = "SEIS";}
			if(entrada == 7) {salida = "SIETE";}
			if(entrada == 8) {salida = "OCHO";}
			if(entrada == 9) {salida = "NUEVE";}
		}else if (cifras == 2) {
			//Es del 10 al 99
			
		}else if (cifras == 3) {
			//Es del 100 al 999
			
		}else if (cifras == 4) {
			// Es del 1000 al 9999
			
		}else {
			System.out.print("El programa no soporta esta cantidad de cifras");
		}
		
		
		
		
		
		
		return salida;
		
	}
	
}
