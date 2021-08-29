package object.icecream.sort;

import java.util.List;
import object.icecream.dao.IcecreamData;

public class IcecreamSort {
	
	static IcecreamData icecreamData = new IcecreamData();
	
	public static List<Icecream> sortIcecream() {
		
		List<Icecream> icecreamList = icecreamData.getIcecreams();
		
		icecreamList.sort(Icecream::compare);
		
		return icecreamList;
	}

}

