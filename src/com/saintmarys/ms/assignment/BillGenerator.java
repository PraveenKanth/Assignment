package code;

import java.util.Scanner;

public class BillGenerator {

	
	private static final double appleCiderPr = 5.50;
	private static final double appleJuicePr = 4.50;

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("This program calculates the prices of the orders."+"\n");
		
		//Get the input from the user
		@SuppressWarnings("resource")
		Scanner getPeopleCount = new Scanner(System.in);
		Scanner getName = new Scanner(System.in);
		Scanner getInterval = new Scanner(System.in);
		
		
				
		System.out.println("How many people ordered?");
		int peopleCount = getPeopleCount.nextInt();
		
		String[] personName =new String[peopleCount];
		int[] appleCider = new int[peopleCount];
		int[] appleJuice = new int[peopleCount];
		
		for(int i = 0; i < peopleCount ; i++) {
			System.out.println("\nEnter the name of Person #"+(i+1)+":");
			personName[i] =  getName.next();
			System.out.println("How many orders of cider did "+personName[i]+" have?");
			appleCider[i] =  getName.nextInt();
			System.out.println("How many orders of juice did "+personName[i]+" have?");
			appleJuice[i] =  getName.nextInt();
		}
		
		
		
		System.out.println("Names \t Cider \t Juice \t Subtotal (Cider) \t Subtotal (Juice) \tTotal");
		System.out.println("--------------------------------------------------------------------------------");
		for(int i = 0; i < peopleCount ; i++) {
			
			System.out.println(personName[i]+"\t" + appleCider[i] +"\t"+appleJuice[i] +"\t" 
					+"$ "+(appleCider[i]*appleCiderPr)+"\t" 
					+"$ "+(appleJuice[i]*appleJuicePr)+"\t"
					+ "$ "+((appleCider[i]*appleCiderPr)+(appleJuice[i]*appleJuicePr))
					);
		}
		
		double ciderTotal = 0;
		double juiceTotal = 0;
		double ciderPriceTotal = 0;
		double juicePriceTotal = 0;
		double total = 0;
		
		for(int i = 0; i < peopleCount; i++) {
			
			ciderTotal+=appleCider[i];
			juiceTotal+=appleJuice[i];
		}
		ciderPriceTotal = appleCiderPr * ciderTotal;
		juicePriceTotal = appleJuicePr * juiceTotal;
		total = ciderPriceTotal + juicePriceTotal;
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("Total");
		System.out.print(ciderTotal+"\t"+juiceTotal+"\t $"+ciderPriceTotal+"\t $"+juicePriceTotal+"\t $"+total+"\n");
		
		
		System.out.print("Average");
		System.out.print(ciderTotal/peopleCount+"\t"+
				juiceTotal/peopleCount+"\t $"+
				ciderPriceTotal/peopleCount+"\t $"+juicePriceTotal/peopleCount+"\t $"+total/peopleCount);
		
		
	}

}
