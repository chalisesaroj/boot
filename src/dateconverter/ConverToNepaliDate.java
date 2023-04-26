package dateconverter;

import java.time.LocalDateTime;

public class ConverToNepaliDate {
	public static NepaliDate GetNepaliDate(LocalDateTime enDate)
    {

        int[] npDateData = NepaliDateDataProvider.GetNepaliDate(enDate.getYear());

        //Getting English day of the year
        int enDayOfYear = enDate.getDayOfYear();

        //Initializing Nepali Year from the data
        int npYear = npDateData[0];

        //Initializing Nepali month to Poush (9)
        //This is because English date Jan 1 always fall in Poush month of Nepali Calendar, which is 9th month of Nepali calendar
        int npMonth = 9;

        //Initializing Nepali DaysInMonth with total days in the month of Poush
        int npDaysInMonth = npDateData[2];

        //Initializing temp nepali days
        //This is sum of total days in each Nepali month starting Jan 1 in Nepali month Poush
        //Note: for the month Poush, only counting days after Jan 1
        //***** This is the key field to calculate Nepali date *****
        int npTempDays = npDateData[2] - npDateData[1] + 1;

        //Looping through Nepali date data array to get exact Nepali month, Nepali year & Nepali daysInMonth information
        for (int i = 3; enDayOfYear > npTempDays; i++)
        {
            npTempDays += npDateData[i];
            npDaysInMonth = npDateData[i];
            npMonth++;

            if (npMonth > 12)
            {
                npMonth -= 12;
                npYear++;
            }
        }

        //Calculating Nepali day
        int npDay = npDaysInMonth - (npTempDays - enDayOfYear);

        NepaliDate npDate = new NepaliDate();
        npDate.setNepaliDate(String.format("%1$s/%2$s/%3$s", npYear, npMonth, npDay));
        npDate.setNpYear(npYear);
        npDate.setNpMonth(npMonth);
        npDate.setNpDay(npDay);
        npDate.setNpDaysInMonth(npDaysInMonth);

        System.out.println(npDate);

        return npDate;
    }

    public static String ConvertNumerals(String input) {

        return input.replace('0', ')')
                .replace('1', '!')
                .replace('2', '@')
                .replace('3', '#')
                .replace('4', '$')
                .replace('5', '%')
                .replace('6', '^')
                .replace('7', '&')
                .replace('8', '*')
                .replace('9', '(')
                .replace('/','÷');

    }
}
