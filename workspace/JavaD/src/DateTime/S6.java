package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class S6 {

	public static void main(String[] args) {
		LocalDate nyugaku = LocalDate.of(2020,4,2);
		LocalDate today = LocalDate.now();
		long days = ChronoUnit.DAYS.between(nyugaku, today);
		System.out.println(nyugaku + "から" + today + "まで " + days + "日");

		Period p = Period.between(nyugaku, today);
		System.out.println(p.getYears() + "年" + p.getMonths()
		+ "月" + p.getDays() + "日");
	}

}