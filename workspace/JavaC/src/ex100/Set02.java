package ex100;
import java.util.HashSet;
import java.util.Set;

public class Set02 {
	public static void main ( String [] args )
	{
		Set < Integer > weight = new HashSet < Integer >();
		weight.add(1 * 1 + 2 * 0 + 3 * 0 );
		weight.add(1 * 1 + 2 * 1 + 3 * 0 );
		weight.add(1 * 1 + 2 * 1 + 3 * 1 );
		
		System.out.println(weight);
	}
}
 