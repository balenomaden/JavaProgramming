package ex100;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {

	public static void main (String[] args)
	{
		//HashSet
		Set <String> set = new HashSet < String >();
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");
		System.out.print(set.size());
		System.out.println(" " + set);
		set.add("value6");
		System.out.print(set.size());
		System.out.println(" " + set);

		System.out.println("TreeSet");
		Set <String> set2 = new TreeSet < String >();
		set2.add("value1");
		set2.add("value2");
		set2.add("value3");
		set2.add("value4");
		set2.add("value5");
		System.out.println(set2);
	}
}
