package labExam;

import junit.framework.TestCase;

public class GarageTest extends TestCase {
	
	//Test #1: Under 3 hours 
	//Objectives: test to check if the car is charged 2 euro for under 3 hours and above 0 hours
	//Objective inputs: hours:2
	//Expected outputs: 2 euro
	
	
	//Test #2: 0 hours
	//Objectives: test to check if the exeption is called at 0
	//Objective inputs: hours:0
	//Expected outputs: "A car cannot stay for 0 hours"
	
	
	//Test #3: each hour over 3
	//Objectives: test that every hour over 3 hours the sum of the charge is added by 0.50 euro up to 16 hours
	//Objective inputs: hours:4
	//Expected outputs: 2.50 euro
	
	
}
