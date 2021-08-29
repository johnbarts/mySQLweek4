package object.icecream.stream;

import java.util.List;
import object.icecream.sort.Icecream;
import object.icecream.dao.IcecreamData;
import java.util.stream.Collectors;

public class IcecreamStream {

	public static void main(String[] args) {
		
		IcecreamData icecreamData1 = new IcecreamData();
		
		List<Icecream> icecreams1 = icecreamData1.getIcecreams();
		
		
		String icecreamStr = icecreams1.stream()
              .map(String::valueOf)
              .sorted()
              .collect(Collectors.joining(", "));
		
		
		System.out.println(icecreamStr);
		
		
		
		
		
	}

}
