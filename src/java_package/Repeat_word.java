package java_package;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat_word {

	public static void main(String[] args) {
		
		String s1 ="Afaan Afan Afaan won back Afan Won";
		String s =s1.toLowerCase();
		
		
		Map<String,Integer> m = new LinkedHashMap<String,Integer>();
		
		
		
		String[]sp =s.split(" ");
		
		for(String st:sp) {
			if(m.containsKey(st)) {
				Integer value =m.get(st);
				m.put(st, value+1);
				
			}
			else {
				m.put(st, 1);
			}
			//System.out.println(st);
		}
		Set<Entry<String,Integer>>entryset = m.entrySet();
		
		for(Entry<String,Integer>entry : entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
		
		
		
	}

}
