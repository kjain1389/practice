package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class MySorter implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		
		Map.Entry<String, Integer> entry1 = (Map.Entry<String, Integer>)o1;
		Map.Entry<String, Integer> entry2 = (Map.Entry<String, Integer>)o2;
		
		return entry2.getValue().compareTo(entry1.getValue());
	}
}

public class MapOrderByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Rahul", 38);
		map.put("Amol", 21);
		map.put("Prachie", 79);
		map.put("Sheetal", 12);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> arrayList = new ArrayList<Entry<String, Integer>>(entrySet);
		
		Collections.sort(arrayList, new MySorter());
		
		for (Entry<String, Integer> entry : arrayList) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		System.out.println("=========================");
		map.forEach( (i,k)->System.out.println(i+"========================="+k));
		System.out.println("=========================");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
	}
}
