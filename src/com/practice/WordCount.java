package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordCount {
	public static void main(String[] args) {
		String str = "I love my india india my love I love Love";
		
		String[] array = str.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String s : array){
			if(map.containsKey(s)){
				map.put(s,(map.get(s)+1));
			}else{
				map.put(s,1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
}
