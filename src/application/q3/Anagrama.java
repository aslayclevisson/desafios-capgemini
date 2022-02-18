package application.q3;

import java.util.ArrayList;
import java.util.List;

public class Anagrama {
	
	private List<String> listaPares = new ArrayList<>();
	
	public void anagrama(char[] cs) {
		
		if(cs.length() <= 1) {
			listaPares.add(cs);
		}
		else {
			for(char l : anagrama(cs.substring(1, cs.length()).toCharArray())) {
				for(int j = 0; j < cs.length(); j++) {
					listaPares.add(cs.substring(0, j) + cs.substring(0,1) + 
							);
				}
			}
		}
}
