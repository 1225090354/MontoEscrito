import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontoEscritoTest {
	
	@Test
	public void ConvertidTest () {
		String resultado = MontoEscrito.Convertir(4, "");
		String esperado = "CUATRO PESOS";
		assertEquals(esperado, resultado);
		}

}
