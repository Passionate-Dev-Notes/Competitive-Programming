package ArrayDublicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArraysDublicate {
	
	    public static ArrayList<Integer> duplicates(int[] arr) {
	        ArrayList<Integer> dublicate = new ArrayList<>();
	        HashSet<Integer> seen = new HashSet<>();
	        HashSet<Integer> added = new HashSet<>();
	        
	        for(int num : arr){
	            if(seen.contains(num)){
	                if(!added.contains(num)){
	                    dublicate.add(num);
	                    added.add(num);
	                }
	            }
	            else{
	                seen.add(num);
	            }
	        }
	        if(dublicate.isEmpty()){
	            ArrayList<Integer> noDublicates = new ArrayList<>();
	            noDublicates.add(-1);
	            return noDublicates;
	        }
	        Collections.sort(dublicate);
	        return dublicate;
	        
	        
	    }
	}



