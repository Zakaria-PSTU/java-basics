import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "HashValue1");
		map.put(2, "HashValue2");
		map.put(3, "HashValue3");
		map.put(4, "HashValue4");
		
		map.put(4, "Hash Value OverWritten");
		
		String text = map.get(4);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}

}
