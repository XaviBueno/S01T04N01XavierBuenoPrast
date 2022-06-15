package ex03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExepcioTest {
	ExcepcioForaLimits myExcepcio=new ExcepcioForaLimits();
	//En cas de que es produeixi l'excepció el test surt com vàlid
	@Test 
	void exepcioTest() {
		assertThrows(ArrayIndexOutOfBoundsException.class,
				()->{myExcepcio.excepcio();});
		
	}

}
