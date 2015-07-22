package com.acloudysky.worldgreetings;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Greetings utility class.
 * It defines greetings in different languages.
 * @author mmiele
 *
 */
public class Greetings {
	
	// Key value pairs collection.
	private Map<String, String> table;
	
	/**
	 * Initialize a key value pair collection as a Hashtable.
	 */
	public Greetings() {	
		table = new Hashtable<String, String>();
		table.put("Italian", "Buongiorno");
		table.put("Spanish", "Buenos Dias");
		table.put("English", "Good Morning");
		table.put("French",  "Bonjour");	
		table.put("German",  "Guten Morgen");
	}

	public Map<String, String> getTable() {
		return table;
	}

	public void setTable(Map<String, String> table) {
		this.table = table;
	}
	
	/**
	 * 
	 * It loops through the hashtable to obtain greetings
	 * based on the selected language.
	 * @param language The language to use for greetings.
	 * @return
	 */
	public  String greeting(String language) {
		String greeting = "no greeting found";
		Iterator<Entry<String, String>> entries = table.entrySet().iterator();
		while (entries.hasNext()) {
				Entry<String, String> thisEntry = (Entry<String, String>) entries.next();
				Object key = thisEntry.getKey();
				Object value = thisEntry.getValue();
				if ((String) key == language) 
					greeting = (String) value;
		}
		
		return greeting;
	}

}
