
public class StringPractice {

	public static void main(String[] args) {
		
		String s1="Laxmi:Saudagar:Bhosale";
		
		String Array[]=s1.split(":");
		
		for (String r:Array)
		{
			System.out.print(r);
		}
 		
		String s="saudagar";
		String a="Laxmi";
		
		int l = s.length();
		System.out.println();
		System.out.println(l);
		System.out.println(s.toUpperCase());
		System.out.println(s.equalsIgnoreCase(a));
		System.out.println(s.concat(a));
		System.out.println(s.substring(4,7));
		System.out.println(s.substring(2));
		System.out.println(s.lastIndexOf('r'));
		System.out.println(s.charAt(5));
		
	}

}
