package object.icecream.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import object.icecream.sort.Icecream;

public class IcecreamData {
	
	public static List<Icecream> icecreams = new ArrayList<Icecream>(List.of(new Icecream("Vanilla"), new Icecream("Chocolate"), 
			new Icecream("Mint"), new Icecream("Rocky Road"), new Icecream("Strawberry"), new Icecream("Pecan"), 
			new Icecream("Neapolitan"), new Icecream("Hazelnut"), new Icecream("Rum Raisin"), new Icecream("Butter Brickle"), 
			new Icecream("Cookie Dough"), new Icecream("Cookies and Cream"), new Icecream("Cotton Candy"), new Icecream("Cherry"), 
			new Icecream("Dulce de Leche"), new Icecream("Peppermint"), new Icecream("Cinnamon"), new Icecream("Maple Walnut"), 
			new Icecream("Pistachio"), new Icecream("Moosetracks"), new Icecream("Tutti Frutti"), new Icecream("Superman"), 
			new Icecream("Spumoni")));
	
	public List<Icecream> getIcecreams() {
		return icecreams;
	}
	
}

