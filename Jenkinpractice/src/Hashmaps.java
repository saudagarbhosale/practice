import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		
		HashMap <Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "saudagar");
		map.put(2, "bhosale");
		map.put(3, "raj");
		map.put(4, "namit");
		
		System.out.println(map);
		System.out.println(map.get(4));
		
		System.out.println(map.keySet());
		map.containsKey(map);

	}

}
