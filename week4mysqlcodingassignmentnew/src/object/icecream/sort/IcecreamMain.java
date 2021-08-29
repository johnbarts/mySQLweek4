package object.icecream.sort;

import java.util.List;

public class IcecreamMain {

	public static void main(String[] args) {
		
		List<Icecream> sortedIcecream = IcecreamSort.sortIcecream();
		
		System.out.println(sortedIcecream);

	}

}
