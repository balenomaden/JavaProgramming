package test;

class Wallet {
	static int cashTotal;
	int coin;
	int bill;
	Wallet ( int c , int b )
	{
		coin = c ; bill = b ;
		cashTotal += coin ;cashTotal += bill;
	}
}



public class test2 {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wallet w1 = new Wallet ( 12,100);
		Wallet w2 = new Wallet ( 3 , 300 );
		System.out.println("W2のbill" + w2.bill);
		System.out.println("Cash トータル " + Wallet.cashTotal);
	
		for ( int j = 1 ; j <= 10 ; j ++ )
		{
			
			if ( j % 3 != 0 )  continue;
			System.out.print ( j + " " );
		}
		
		String[] sArray = { "java", "python", "VBA", "c"};
		for ( String s : sArray)
		{
			System.out.println(s);
		}
		
		Hello();
	}

	public static void Hello ()
	 {
	 	System.out.println("こんにちは");
	 }
}
