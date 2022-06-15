package ex01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
class MesosDelAnyTest {
	
	//Aquest test comprova que el número de mesoe es 12
	@Test
	 void testNumMesos() {
		
	
		int numMesosEsperats=12;
		MesosDelAny mesos= new MesosDelAny();
		
		assertEquals(numMesosEsperats,mesos.getMesos().size());
		
	}
	// Aquest test comprova que el mes d'agost hi és a la posició 7
	@Test
	void testAgost() {
		MesosDelAny mesos= new MesosDelAny();
			
		assertEquals(7,mesos.getMesos().indexOf("Agost"));
		
	}
	
	@Test
	//comprova que l'array retornat no és nul
	void testMesNull() {
		boolean isNull=false;
		MesosDelAny mesos =new MesosDelAny();
		ArrayList<String> llistaMesos=mesos.getMesos();
		
		if (llistaMesos==null) {
			isNull=true;
		}
		assertEquals(false,isNull);
	}
	
}