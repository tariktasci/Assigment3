package Assigment3;

public class Question5 {

	public static void main(String[] args) {
		
		/*Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds  */
		
		int inputSecond, hours, minutes, seconds;
		
		inputSecond=3700;
		
		hours=inputSecond/3600; //1 HOUR =3600 SECOND
		minutes=(inputSecond-hours*3600)/60;
		seconds=inputSecond%60;
		
		System.out.println("inputSecond is "+inputSecond+"\n");
		System.out.println(hours+"hours, "+minutes+"minutes, "+seconds+"seconds"+"\n");
		
		/*-Assign values to the hours, minutes, seconds variables
		-Display the result
		 
		hours=2;
		minutes=30;
		seconds=33;
		
		inputSecond=hours*3600+minutes*60+seconds;
		
		System.out.println("inputSecond is "+inputSecond);
		
	*/
	}

}
