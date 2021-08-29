package object.icecream.sort;

public class Icecream {
	
	public static Object compareIcecream;
	String icecreamType;
	
	public Icecream(String str) {
		this.icecreamType = str;
	}
	
	public String getIcecreamType() {
		return icecreamType;
	}
	
	@Override
	public String toString() {
		return (this.getIcecreamType() + " Ice Cream");
	}
	
	public static int compare(Icecream ice1, Icecream ice2) {
		return ice1.icecreamType.compareTo(ice2.icecreamType);
	}

}
