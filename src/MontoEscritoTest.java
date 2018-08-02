import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontoEscritoTest {
	
	@Test
	public void ConvertidTest () {
		String resultado = MontoEscrito.Convertir(486, "");
		String esperado = "CUATROCIENTOS OCHENTA Y SEIS";
		assertEquals(esperado, resultado);
		}

}
