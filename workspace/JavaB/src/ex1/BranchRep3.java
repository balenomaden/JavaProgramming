package ex1;
import java.util.Random;
import java.util.Scanner;

public class BranchRep3 {

	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int inp = 0;
		int rnd = new Random().nextInt(6)+1;
		int cnt = 0;
		
		while ( rnd !=inp) 
		{
			
			if ( cnt != 0)
			{
				System.out.println("違います・");
			}
			System.out.print("数値 ( 1 - 6 ) " );
			inp = sc.nextInt();
			cnt ++ ;
			
		}
		
		System.out.println("rnd ; " + rnd );
		System.out.println(cnt + "回目で正解です");
	}
	}
	