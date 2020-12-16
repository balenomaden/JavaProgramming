package DateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime localdatetime = LocalDateTime.now();
		OffsetDateTime offsetdatetime = OffsetDateTime.now();
		ZonedDateTime zoneddatetime = ZonedDateTime.now();

		System.out.println("1. ローカルな時間 : " + localdatetime);
		System.out.println("2. 時差を扱う時間 : " + offsetdatetime);
		System.out.println("3. タイムゾーンを扱う日時 :" + zoneddatetime);

		//日付をつくる(日付オブジェクト作成)
		//今日の日付
		LocalDate today = LocalDate.now();
		System.out.println(today);
		//年月日を指定して作成
		LocalDate date1 = LocalDate.of(2021,12,8);
		System.out.println(date1);

		LocalDate date3 = LocalDate.parse("2020-12-19");
		System.out.println("date 3 : " + date3);

		//日付の編集
		LocalDate date2 = LocalDate.of(2021, 7, 13);
		//書式を作る
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年MM月dd日 eeee");
		//書式在
		System.out.println(date2.format(fmt));

		//和暦で表示する
		JapaneseDate jdate2 = JapaneseDate.from(date2);
		DateTimeFormatter jfmt = DateTimeFormatter.ofPattern("Gy年MM月dd日 eeee");
		//書式在使って編集し、出力する
		System.out.println(jdate2.format(jfmt));


	}

}
