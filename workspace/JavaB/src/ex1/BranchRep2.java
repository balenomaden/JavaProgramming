package ex1;

public class BranchRep2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 5;

		while (i > 0)
		{
			if ( i % 2 == 0)
			{
				System.out.println(i + "偶数です。\n");
			}else
			{
				System.out.println(i + "奇数です。\n");
			}
			i--;

		}
		System.out.println("終了");

	}

}
