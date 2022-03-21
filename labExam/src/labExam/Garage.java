package labExam;

import java.awt.AWTException;

public class Garage {
	
	private String Garage(double hour) throws Exception {
		if (hour > 0 && hour < 3) {
			return "2 euro";
		}
		else if (hour > 3 && hour < 4 ) {
			return "2.50 euro";
		}
		else if (hour > 4 && hour < 5) {
			return "3.00 euro";
		}
		else if (hour > 5 && hour < 6) {
			return "3.50 euro";
		}
		else if (hour > 6 && hour < 7) {
			return "4.00 euro";
		}
		else if (hour > 7 && hour < 8) {
			return "4.50 euro";
		}
		else if (hour > 8 && hour < 9) {
			return "5.00 euro";
		}
		else if (hour > 9 && hour < 10) {
			return "5.50 euro";
		}
		else if (hour > 10 && hour < 11) {
			return "6.00 euro";
		}
		else if (hour > 11 && hour < 12) {
			return "6.50 euro";
		}
		else if (hour > 12 && hour < 13) {
			return "7.00 euro";
		}
		else if (hour > 13 && hour < 14) {
			return "7.50 euro";
		}
		else if (hour > 14 && hour < 15) {
			return "8.00 euro";
		}
		else if (hour > 15 && hour < 16) {
			return "8.50 euro";
		}
		else if (hour > 16 && hour < 17) {
			return "9.00 euro";
		}
		else if (hour > 17 && hour < 18) {
			return "9.50";
		}
		else if (hour > 18 && hour < 19) {
			return "10 euro";
		}
		else   {
			throw new Exception("Car cannot stay over 24 hours");}
		}
		
	
		public static void main(String[]args) {
			Garage calculator = new Garage();
			try {
				System.out.println(calculator.Garage(34));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		
		
	}
}


