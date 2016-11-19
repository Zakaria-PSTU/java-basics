import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		testMap(treeMap);
	}
	
	public static void testMap(Map<Integer,String> map){
		map.put(0, "hello");
		map.put(6, "hello6");
		map.put(3, "hello3");
		map.put(5, "hello5");
		map.put(2, "hello2");
		map.put(1, "hello1");
		
		for(Integer key: map.keySet())
		{
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
