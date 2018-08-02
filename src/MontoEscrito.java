public class MontoEscrito {
	
	public static void main (String args[]) {
		short entrada = 95;
		String salida = "";
		String salida2 = Convertir(entrada, salida);
		System.out.print(salida2);
	}
 
	public static String Convertir (short entrada, String salida) {
        
		int cifras = Integer.toString(entrada).length();
		String[][] numero09 = {{"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE"}};
		String[][] numero1020 = {{"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUICE", "DIESISEIS", "DIESISIETE", "DIESIOCHO", "DIESINUEVE", "VEINTE"}};
		String[][] numero00 = {{"CERO", "DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"}};
		
		if (cifras == 1) {
			//Es del 0 al 9
			for (short i = 0;i<=9;i++) {
				if(i == entrada) {salida = numero09[0][i] + " PESOS";};
			}
		}else if (cifras == 2) {
			//Es del 10 al 99
			int numero = entrada;
			int segundo;
		    int primero;
						
	        segundo = numero%10;

	        numero = numero/10;
	        primero = numero%10;
	        
	        if(entrada <= 20) {
	        	for (short i = 0;i<=20;i++) {				
					if(i == entrada) {salida = numero1020[0][i-10] + " PESOS";};
	        	}
	        }else if (entrada > 20) {
	        	salida = numero00[0][primero] + " Y " + numero09[0][segundo]; 
	        }
	        
			
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


