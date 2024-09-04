package Currency_Converter;

import java.util.Scanner;

public class Currency_Converter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
		
		System.out.println("==============CURRENCY CONVERTER=========================");


		System.out.println("Select The Transaction Cuurency");
		System.out.println("1 : INDIA \n2 : AMERICA \n3 : PAKISTAN");
		Float currencyFrom=sc.nextFloat();
		System.out.println("Enter Ammount");
		Float amt=sc.nextFloat();
		System.out.println();

		System.out.println("Select The Cuurency In Which To Convert");
		System.out.println("1 : INDIA \n2 : AMERICA \n3 : PAKISTAN");
		int currencyTo=sc.nextInt();

		if(((currencyFrom<0)&&(currencyFrom<=3))&&((currencyTo<0)&&(currencyTo<=3)))
		{
			System.out.println("==========Enter Valid Choice======");
		}
		else if((currencyFrom==1)&&(currencyTo==1))
		{
			System.out.println("INDIA Ruppe \n"+amt);
		}
		else if((currencyFrom==1)&&(currencyTo==2))
		{
			System.out.println("INDIA  TO  USA");			
			System.out.println((amt/83.96));
		}
		else if((currencyFrom==1)&&(currencyTo==3))
		{
			System.out.printf("INDIA  TO  PAKISTAN\n %.2f",(amt*3.32));
		}
		
		
		
		else if((currencyFrom==2)&&(currencyTo==2))
		{
			System.out.println("USA Dollar \n"+amt);
		}
		else if((currencyFrom==2)&&(currencyTo==1))
		{
			System.out.println("USA  TO  INDIA");			
			System.out.println((amt*83.96));
		}
		else if((currencyFrom==2)&&(currencyTo==3))
		{
			System.out.println("USA  TO  PAKISTAN");			
			System.out.println((amt*278.64));
		}
		
		
		else if((currencyFrom==3)&&(currencyTo==3))
		{
			System.out.println("PAKISTAN RUPEE \n"+amt);
		}
		else if((currencyFrom==3)&&(currencyTo==1))
		{
			System.out.println("PAKISTAN  TO  INDIA");			
			System.out.println((amt/3.32));
		}
		else if((currencyFrom==3)&&(currencyTo==2))
		{
			System.out.println("PAKISTAN TO USA");			
			System.out.println((amt/278.64));
		}
		else {
			System.out.println("............Thank You..............");
		}
		System.out.println("\nFor Continoue Press 1..");
		ch=sc.nextInt();
		}while(ch==1);

	}

}
