package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Sep 14, 2023
 */
public class BoozeShop {
	public static List getAvailableBrands(BoozeType type) {
		List brands = new ArrayList();
		
		if(type.equals(BoozeType.WINE)) {
			brands.add("Adrianna Vineyard");
			brands.add(("J. P. Chenet"));
			brands.add("Barefoot Cellars");
			brands.add("Franzia");
			brands.add("Carlo Rossi");
		}else if(type.equals(BoozeType.WHISKEY)) {
			brands.add("Jack Daniels");
			brands.add("Johnnie Walker");
			brands.add("Crown Royal");
			brands.add("Makers Mark");
			brands.add("Wild Turkey");
		}else if(type.equals(BoozeType.BEER)) {
			brands.add("Bud Light");
			brands.add("Corona");
			brands.add("John Adams");
			brands.add("Coors Light");
			brands.add("Stella Artois");
		}else {
			brands.add("No booze for you");
		}
		return brands;
	}

}
