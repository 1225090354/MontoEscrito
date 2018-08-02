import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontoEscritoTest {
	
	@Test
	public void ConvertidTest () {
		String resultado = MontoEscrito.Convertir(8486, "");
		String esperado = "OCHOMIL CUATROCIENTOS OCHENTA Y SEIS";
		assertEquals(esperado, resultado);
		}

}
