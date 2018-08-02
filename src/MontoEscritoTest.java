import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontoEscritoTest {
	
	//Nombre : Juan Jose Quiceno Marin; 
	//Codigo : 1225090354;
	
	@Test
	public void ConvertirTest () {
		String resultado = MontoEscrito.Convertir(8486, "");
		String esperado = "OCHOMIL CUATROCIENTOS OCHENTA Y SEIS";
		assertEquals(esperado, resultado);
		}

}
