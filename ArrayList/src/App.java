import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		//Adding
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));
		
		//Indexed for loop Iteration
		System.out.println("\nIteration #1");
		for(int i=0; i< numbers.size(); i++)
			System.out.println(numbers.get(i));
		
		//Removing Items
				//fast as last item,no need reorder the array
				numbers.remove(numbers.size() - 1);
				
				//slow,need to reorder the index
				numbers.remove(0);
		
		System.out.println("\nIteration #2");
		for(Integer value : numbers)
			System.out.println(value);
		
		//List interface
		List<String> values = new ArrayList<String>();
		
		values.add("testData");
		values.add("testData1");
		values.add("testData2");

		for(String value : values)
			System.out.println(value);
	}

}
