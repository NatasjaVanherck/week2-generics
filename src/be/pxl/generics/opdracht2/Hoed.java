package be.pxl.generics.opdracht2;

public class Hoed<T extends Dier> {

	private T dier;
	private boolean leegOfNiet = false;
	
	public Hoed(T dier){
		this.dier = dier;
	}
	
	public T kijk(){
		if(leegOfNiet){
			leegOfNiet = false;
			return dier;
		} else {
			leegOfNiet = true;
			return null;
		}
		
	}
}
