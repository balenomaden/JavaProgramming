package ex3;

public class ex3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for ( int j = 9 ; j > 0 ; j--)
		{

			for (int i = 1 ; i <= j ; i++)
			{
				if ((i+j)%2==0 )
				System.out.print("★");

				else {
					System.out.print("☆");
				}

			}

			System.out.println();
		}

	}

}
