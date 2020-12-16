package ex100;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {
	public static void main (String[] args)
	{
		Map<String, String> dic = new HashMap < String, String>();
		dic.put("Apple", "りんご");	
		dic.put("Orange", "みかん");	
		dic.put("Watermelon", "スイカ");	
		
		Scanner scn = new Scanner (System.in);
		System.out.print("Input > ");
		String inp = scn.next();
		dic.put(inp, "りんご");	
		String op = dic.get(inp);
		System.out.println("Nilai > " + op);
		
		System.out.println(dic.containsValue("りんご"));
		for (Map.Entry<String, String> m : dic.entrySet())
		{
			System.out.println ( "key " + m.getKey() + " value = " + m.getValue());
		} 
	}
}
