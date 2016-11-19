import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		if(linkedHashSet.isEmpty())
			System.out.println("set is empty!");
		
		linkedHashSet.add("snake");
		linkedHashSet.add("dog");
		linkedHashSet.add("mouse");
		linkedHashSet.add("cat");
		
		//Adding duplicate item does nothing
		linkedHashSet.add("mouse");
		
		if(linkedHashSet.isEmpty())
			System.out.println("set is empty!");
		
		System.out.println(linkedHashSet);
		
		//Iteration
		for(String element : linkedHashSet)
			System.out.println(element);
	
		//contain given item
		if(linkedHashSet.contains("ascf"))
			System.out.println("ascf contains");
		if(linkedHashSet.contains("dog"))
			System.out.println("dog contains");
		
		// set contains some common elements of linkedHashSet and some new one
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("snake");
		set.add("dog");
		set.add("mouse");
		set.add("cat");
		set.add("bear");
		set.add("cow");
		
		/// testing intersection
		Set<String> intersection = new LinkedHashSet<String>(linkedHashSet);
		intersection.retainAll(set);
		System.out.println(intersection);
		
		// difference
		Set<String> difference = new LinkedHashSet<String>(set);
		difference.removeAll(linkedHashSet);
		System.out.println(difference);
		
	}

}
