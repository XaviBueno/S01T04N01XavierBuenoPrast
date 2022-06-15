package ex03;

//Classe amb mètode que llança una execepció ArrayIndexOutOfBoundsException
public class ExcepcioForaLimits {
	
	public void excepcio() throws ArrayIndexOutOfBoundsException{
		
		 int[]llistaNums= {1,2,3,4};
		 
		 llistaNums[7]=10;
		
	}

}
