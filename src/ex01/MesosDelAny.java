package ex01;

import java.util.ArrayList;
public class MesosDelAny {
	
	private ArrayList<String> mesos;

	public  MesosDelAny( ){
		
		ArrayList<String> elsmesos= new ArrayList<String>();
		
		elsmesos.add("Gener");
		elsmesos.add("Febrer");
		elsmesos.add("Març");
		elsmesos.add("Abril");
		elsmesos.add("Maig");
		elsmesos.add("Juny");
		elsmesos.add("Juliol");
		elsmesos.add("Agost");
		elsmesos.add("Setembre");
		elsmesos.add("Octubre");
		elsmesos.add("Novembre");
		elsmesos.add("Desembre");
		
		mesos=elsmesos;
		
	}
	public ArrayList<String> getMesos(){
		return mesos;
	}
}
