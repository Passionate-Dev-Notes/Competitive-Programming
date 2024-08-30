package listProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AdditionLogic{
	public List<Integer> listValueIncreamentByone(List<Integer> list){
		int size = list.size();
		System.out.println("Size"+size);
		int inloop =1;
		
		while(size>0) {
			int n = size;
			
			while(inloop> 0) {
				// 2,3,9
				inloop--;
				int temp = list.get(n-1);
				int sumTemp= temp+1;
				int div = sumTemp % 10;
				list.add(n-1,div);
				System.out.println("Sum%10 -"+div);
				sumTemp = sumTemp/10;
				inloop = sumTemp;
				System.out.println("Sum /10 -"+sumTemp);
				
				n--;
				size--;
			}
			inloop++;
			
		}
		return list;
		
	}
}

public class AddingOneOnExistingLastNumber {

	public static void main(String[] args) {
		List<Integer> addition = new ArrayList<Integer>();
		addition.add(2);
		addition.add(3);
		addition.add(9);
		AdditionLogic obj = new AdditionLogic();
	    List<Integer> value	=obj.listValueIncreamentByone(addition);
	    System.out.println(value);
		/*
		 * Iterator it = value.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
		
	}

}
