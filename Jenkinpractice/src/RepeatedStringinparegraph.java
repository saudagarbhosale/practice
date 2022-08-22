import java.util.HashMap;
import java.util.Set;

public class RepeatedStringinparegraph {

	public static void main(String[] args) {
		String para="abc abc abcd efg abc efg abcd efg sau lax";
		
	String	ar[]=para.split(" ");
    HashMap<String, Integer> map=new HashMap<String, Integer>();
    
     for(int i=0; ar.length-1>=i; i++)
     {
    	 String s=ar[i];
    	 if(map.containsKey(s))
    	 {
    		 map.put(s,map.get(s)+1);
    	 }
    	 else
    	 {
    		 map.put(s, 1);
    	 }
     }
     System.out.println(map);
     
     Set<String> se = map.keySet();
     System.out.println(se);

	}

}
