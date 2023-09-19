package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Sep 18, 2023
 */
public class CookieShop {
	public static List getAvailibleBrands(CookieType type) {
		List cookieBrands = new ArrayList();
		
		if(type.equals(CookieType.OATMEAL)) {
			cookieBrands.add("Little Debbie");
			cookieBrands.add("Archway");
			cookieBrands.add("Keebler");
			cookieBrands.add("Lenny & Larry's");
			cookieBrands.add("Back to Nature");
		}else if(type.equals(CookieType.SNICKERDOODLE)) {
			cookieBrands.add("Enjoy Life");
			cookieBrands.add("High Key");
			cookieBrands.add("Rip Van");
			cookieBrands.add("Lenny & Larry's");
			cookieBrands.add("Keebler");
		}else if(type.equals(CookieType.SUGAR)) {
			cookieBrands.add("LoftHouse");
			cookieBrands.add("Betty Crocker");
			cookieBrands.add("Lenny & Larry's");
			cookieBrands.add("Keebler");
			cookieBrands.add("Pillsbury");
		}else {
			cookieBrands.add("No Cookies for You!");
		}
		return cookieBrands;
	}

}
