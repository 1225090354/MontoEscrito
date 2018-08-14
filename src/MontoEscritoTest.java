import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MontoEscritoTest {
	
	//Nombre : Juan Jose Quiceno Marin; 
	//Codigo : 1225090354;
	
	@Test
	public void Convertir1Test () {
		String resultado = MontoEscrito.convertir("8");
		String esperado = "OCHO";
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void Convertir2Test () {
		String resultado = MontoEscrito.convertir("16");
		String esperado = "DIESISEIS";
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void Convertir3Test () {
		String resultado = MontoEscrito.convertir("848");
		String esperado = "OCHOCIENTOS CUARENTA Y OCHO";
		assertEquals(esperado, resultado);
		}
	
	@Test
	public void Convertir4Test () {
		String resultado = MontoEscrito.convertir("8486");
		String esperado = "OCHOMIL CUATROCIENTOS OCHENTA Y SEIS";
		assertEquals(esperado, resultado);
		}

}
