package object.icecream.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import object.icecream.dao.IcecreamData;
import object.icecream.sort.Icecream;


public class IcecreamOptionals {

	
public static void main(String[] args) {
	
	icecreamB();

}
	
	public static Icecream icecreamA(Optional<Icecream> icecream) {
	
		return icecream.orElseThrow(() -> 
		new NoSuchElementException("Icecream not found."));
	
}

	public static void icecreamB() {   
	 
		Optional<Icecream> optional = Optional.of(IcecreamData.icecreams.get(3)); 
	
			System.out.println(icecreamA(optional)); 
	 
			try { 
				icecreamA(Optional.empty());
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
}



}
