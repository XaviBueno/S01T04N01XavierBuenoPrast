package ex02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;



class CalculoDniTest {
	

	
	@ParameterizedTest
	@CsvSource({
		"36976062,'C'",
		"40602796,'E'",
		"25678900,'K'",
		"65879632,'L'",
		"15789321,'M'",
		"67896521,'S'",
		"78965127,'D'",
		"81756302,'L'",
		"50874563,'N'",
		"92187967,'B'"})
	
	public void calculoDniTest(int numDni, char lletra) {
		
		CalculoDni dniObj= new CalculoDni();
		assertEquals(dniObj.lletraDni(numDni),lletra);
	}

}
