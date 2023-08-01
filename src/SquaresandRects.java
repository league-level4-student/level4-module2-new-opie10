import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SquaresandRects {
	
public static List<Integer> sqInRect(int lng, int wdth, ArrayList<Integer>sides) {
	
		if (lng==wdth) {
			return null;
		}
		if (wdth>lng) {
			int sw = wdth;
			wdth=lng;
			lng = sw;
		}
		int longest = lng;
		int shortest = wdth;
		if (shortest!=1) {
			sides.add(shortest);
		int	newlong = longest-shortest;
		sqInRect(newlong,shortest,sides);
		}
		if(shortest==1) {
			for (int i = 0; i <longest; i++) {
				sides.add(1);
			}
		}
		 
		return sides;
		
}

}
