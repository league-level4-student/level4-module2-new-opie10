
public class CodingChallenge {
public static void main(String[] args) {
	String s = " ";
	Double per =infectPercent(s);
	System.out.println(per);
}
public static double infectPercent(String s) {
	if (s.contains("0")==false && s.contains("1")==false) {
		return 0.0;
	}
	Double percent = 0.0;
	Double infected = 0.0;
	Double population =0.0;
	String continents[]= s.split("X");
	
		for (int i = 0; i < continents.length; i++) {
			System.out.println(continents[i]);
			population = population+continents[i].length();
			for (int j = 0; j < continents[i].length(); j++) {
				
				if (continents[i].charAt(j)=='1') {
					
					infected = infected +continents[i].length();
					break;
				}
			}
		}
		
			
		
		Double per =  (infected/population);
		 percent = per*100;
	return percent;
		
		
}
}
