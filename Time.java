public class Time {
	public static void main (String[] args) {

		int hour = 14;
		int minute = 16;
		int seconds = 6;
		int secondsInDay = 86400;
		int secondsSinceMidnight = hour*3600 + minute*60 + seconds;
		double percentageDayPassed = secondsSinceMidnight*100.0 / secondsInDay;
		
		System.out.println("Seconds since midnight: " + secondsSinceMidnight);
		System.out.println("Seconds left in the day: " + (secondsInDay - secondsSinceMidnight));
		System.out.println("Percentage of day passed: " + percentageDayPassed);
		
		int finalHour = 14;
		int finalMinute = 33;
		int finalSecond = 2;
		
		System.out.println("Seconds spent making this project: " + ((14*3600+33*60+2)-(14*3600+16*60+6)));
	}

}
