package ex3;

public class exx1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int math = 20;
		int lang = 30;
		int sci = 40;
		int eng = 50;
		int soc = 80;
		//int gym = 70;
		int sum = math + lang + sci + eng + soc  ;
		int ave = sum / 5 ;
		System.out.println("平均点は" + ave + "点です");

		System.out.println();
		System.out.println();

		int[] score = new int [] {20,30,40,50,80,70};
	//	int[] score2 = {20,30,40,50,80};
		/*int[] score = new int [6];
		score[0]=20;
		score[1]=30;
		score[2]=40;
		score[3]=50;
		score[4]=80;*/

		// sum  = score[0]+score[1]+score[2]+score[3]+score[4];
		
		sum = 0;
		for (int i = 0; i < score.length; i++)
		{
			sum += score[i];
		}
		 ave = sum/score.length;
		System.out.println("均点は" + ave + "点です");
		
		sum = 0;
		ave = 0;
		
		for (int point : score )
		{
			sum = sum + point ;
		}
		ave = sum / score.length;
		System.out.println("均点は" + ave + "点です");
	}

}
