package ex02;


public class CalculoDni {

	
	//Mètode que calcula la lletra del DNI
	public char lletraDni(int dni) {
		int resto =dni%23;
		String lletras="TRWAGMYFPDXBNJZSQVHLCKE";
		return lletras.charAt(resto);
	}

}
