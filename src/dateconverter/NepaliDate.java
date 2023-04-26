package dateconverter;

public class NepaliDate {
	   private String nepaliDate;
	    private int npDaysInMonth;
	    private int npYear;
	    private int npMonth;
	    private int npDay;
		public String getNepaliDate() {
			return nepaliDate;
		}
		public void setNepaliDate(String nepaliDate) {
			this.nepaliDate = nepaliDate;
		}
		public int getNpDaysInMonth() {
			return npDaysInMonth;
		}
		@Override
		public String toString() {
			return "NepaliDate [nepaliDate=" + nepaliDate + ", npDaysInMonth=" + npDaysInMonth + ", npYear=" + npYear
					+ ", npMonth=" + npMonth + ", npDay=" + npDay + "]";
		}
		public void setNpDaysInMonth(int npDaysInMonth) {
			this.npDaysInMonth = npDaysInMonth;
		}
		public int getNpYear() {
			return npYear;
		}
		public void setNpYear(int npYear) {
			this.npYear = npYear;
		}
		public int getNpMonth() {
			return npMonth;
		}
		public void setNpMonth(int npMonth) {
			this.npMonth = npMonth;
		}
		public int getNpDay() {
			return npDay;
		}
		public void setNpDay(int npDay) {
			this.npDay = npDay;
		}

}
