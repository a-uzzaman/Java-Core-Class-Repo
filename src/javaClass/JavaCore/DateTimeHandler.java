package javaClass.JavaCore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today= LocalDate.now();
		LocalDate tomorrow= today.plusDays(5);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(today.format(myFormatObj));
		System.out.println(tomorrow.format(myFormatObj));
	}

}
