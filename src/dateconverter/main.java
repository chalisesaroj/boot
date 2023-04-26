package dateconverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
	public static void main(String[] args) {
		
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	String caseStartDate = dateFormat.format(LocalDateTime.now());
	NepaliDate npDate = ConverToNepaliDate.GetNepaliDate(LocalDateTime.parse(caseStartDate, dateFormat));
	String todaysDate= ConverToNepaliDate.ConvertNumerals(npDate.getNepaliDate());
	}
}
