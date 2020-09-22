package Assigment3;

public class Question7 {

	public static void main(String[] args) {
		/* Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles */
		
		int price=95;
		int change, quarters, dimes, nickles;
		
		quarters=(100-price)/25;
		dimes=((100-price)%25)/10;
		nickles=(100-price-quarters*25-dimes*10)/5;
		
		System.out.println("Price in cents :"+price);
		System.out.println("Your change is "+quarters+" quarters,  "+dimes+" dimes,  "+nickles+" nicles.");
				
		
	}

}
