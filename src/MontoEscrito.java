public class MontoEscrito {
	//Nombre : Juan Jose Quiceno Marin ;
	//Codigo : 1225090354;
	
	public static void main (String args[]) {
		String entrada = "9789";
		String salida = convertir(entrada);
		System.out.print(salida);
	}
 
	public static String convertir (String entrada) {
        int cifras = entrada.length();
        String salida = "";
		String[] numero01 = {"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUICE", "DIESISEIS", "DIESISIETE", "DIESIOCHO", "DIESINUEVE", "VEINTE"};
		String[] numero02 = {"CERO", "DIEZ", "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA"};
		String[] numero03= {"CERO", "CIEN", "DOCIENTOS", "TRECIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
		//Se crea vector para almacena los numero separados
		int numero[] = new int[cifras];
		for (int c = 0;c < cifras; c++) {
			numero[c] = Integer.parseInt(entrada.split("")[c]);
		}
		
		if (cifras == 1) {
			//Es del 0 al 9
			salida = numero01[Integer.parseInt(entrada)];
		}else if (cifras == 2) {
			//Es del 10 al 99
	        if(Integer.parseInt(entrada) <= 20) {
	        	salida = numero01[Integer.parseInt(entrada)];
	        }else if (Integer.parseInt(entrada)> 20) {
	        	salida = numero02[numero[0]] + " Y " + numero01[numero[1]]; 
	        }
		}else if (cifras == 3) {
			//Es del 100 al 999
	        salida = numero03[numero[0]] + " " + numero02[numero[1]] + " Y " + numero01[numero[2]];
	        
		}else if (cifras == 4) {
			// Es del 1000 al 9999
	        salida = numero01[numero[0]] + "MIL " + numero03[numero[1]] + " " + numero02[numero[2]] + " Y " + numero01[numero[3]];
		}else {
			System.out.print("El programa no soporta esta cantidad de cifras");
		}
		
		return salida;
		
	}

}


