package org.mycompany;


import java.util.HashMap;
import java.util.Map;

public class StringCache {

    private Map<String, Long> cache;

    public StringCache(){
        this.cache = new HashMap<>();
    }

    public boolean isItemCached(String string){
        if(string == null){
            throw new RuntimeException("Null string");
        }
        if(cache.containsKey(string)){
            System.out.println("String " + string + " found in cache");
            return true;
        } else {
            System.out.println("String " + string + " not found in cache");            
            return false;
        }
    }
    public void addItem (String string) {
    	long uniqueCharactersCount = string
                .chars()
                .distinct()
                .count();
        cache.put(string, uniqueCharactersCount);
    }

}
