package minAndMaxDigitFromNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindOutMinAndMaxDigit {
	public ArrayList<Integer> findoutMaxAndMin(int data) {
		
        ArrayList<Integer> lt = new ArrayList<Integer>();
		int index=0;
		while(data>0) {
			int temp = data%10;
			//8489324;
			 lt.add(temp);
			data = data/10;
			index++;
		}
		Collections.sort(lt);
		return lt;
	}

}
