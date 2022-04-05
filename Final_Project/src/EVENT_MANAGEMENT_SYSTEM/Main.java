package EVENT_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Main { 



	public static void main(String[] args){ 


		Login i=new Login();
		Welcomepage p =new Welcomepage();

		Event_details u =new Event_details();
		String choice2 = null;
		String choice3 = null;

		p.displaywelcomemessage();

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		p.setAnswer(sc.nextLine());
		if(p.getAnswer().equalsIgnoreCase("YES"))
		{
			System.out.println("You will be directed to login page");
			System.out.println("*******************************************************************");
			System.out.println("Enter the username");
			i.setName(sc.nextLine());

			System.out.println("Enter your password");
			i.setPassword(sc.nextLine());

			System.out.println("*******************************************************************");
			System.out.println("Welcome Back !" +i.name);
			System.out.println("*******************************************************************");

			do {
				System.out.println("Select the type of event you want to choose");
				System.out.println("1)Birthday Party \n2)Marriage Party \n3)Corporate Party");


				u.choice = sc.nextInt();
				if(u.choice<1 || u.choice>3) {
					System.out.println("*******************************************************************");
					System.out.println("Wrong Choice, Please select a valid Choice from 1-3");
					System.out.println("*******************************************************************");
					sc.nextLine();
					System.out.println("Press ENTER key to proceed");
					choice3=sc.nextLine();
				}
			}while(u.choice <1 || u.choice>3);

			switch(u.choice)
			{
			case 1 :System.out.println("Birthday Party \nCost of hall= Rs.100.0 per person(Mandatory)");
			System.out.println("*******************************************************************");
			sc.nextLine();
			System.out.println("Press ENTER key to proceed");
			choice3=sc.nextLine();
			do {
				System.out.println("There are two packs for Birthday party");
				System.out.println("1)Golden pack includes\n*40 Birthday caps and Musical cake cutting knife\nFour fun activities -  @Magic show  @Gun shooting  @Tatto maker  @Puppet show \nPrice - Rs.10000.0" );
				System.out.println("\n2)Silver Pack includes\n*20 Birthday caps\nTwo fun activities -  @Magic show  @Tatto maker\nPrice - Rs.5000.0");
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.print("Select your pack");
				System.out.println("\n");
				u.choice5 = sc.nextInt();
				if(u.choice5<1 || u.choice5>2) {
					System.out.println("*******************************************************************");
					System.out.println("Wrong Choice, Please select a valid Choice from 1-2");
					System.out.println("*******************************************************************");
					sc.nextLine();
					System.out.println("Press ENTER key to proceed");
					choice3=sc.nextLine();




				}
			}while(u.choice5 <1 || u.choice5>2);


			switch(u.choice5)
			{
			case 1 :System.out.println("Selected golden pack");
			break;
			case 2 :System.out.println("Selected silver pack");
			break;
			}

			break;
			case 2:System.out.println("Marriage Party \nCost=500.0 per person(Mandatory)");
			System.out.println("*******************************************************************");
			sc.nextLine();
			System.out.println("Press ENTER key to proceed");
			choice3=sc.nextLine();
			do {
				System.out.println("There are two packs for Marriage party");
				System.out.println("1)Golden pack includes\n*Photobooth and DJ night \n*Live music and special performances\nPrice - Rs.15000.0");
				System.out.println("\n2)Silver Pack includes\n*Photobooth and DJ night\nPrice - Rs.10000.0");
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.print("Select your pack");
				System.out.println("\n");
				u.choice5 = sc.nextInt();
				if(u.choice5<1 || u.choice5>2) {
					System.out.println("*******************************************************************");
					System.out.println("Wrong Choice, Please select a valid Choice from 1-2");
					System.out.println("*******************************************************************");
					sc.nextLine();
					System.out.println("Press ENTER key to proceed");
					choice3=sc.nextLine();




				}
			}while(u.choice5 <1 || u.choice5>2);


			switch(u.choice5)
			{
			case 1 :System.out.println("Selected golden pack");
			break;
			case 2 :System.out.println("Selected silver pack");
			break;
			}
			break;

			case 3:System.out.println("Corporate Party \nCost=1000.0 per person(Mandatory)");
			System.out.println("*******************************************************************");
			sc.nextLine();
			System.out.println("Press ENTER key to proceed");
			choice3=sc.nextLine();
			do {
				System.out.println("There are two packs for Corporate event");
				System.out.println("1)Golden pack includes\n*Seminars and Golf Events\n*Trade shows and Product launch events\n*Business dinner\nPrice - Rs.20000.0");
				System.out.println("\n2)Silver Pack includes\n*Seminars and Product launch events\nPrice - Rs.15000.0");
				System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.print("Select your pack");
				System.out.println("\n");
				u.choice5 = sc.nextInt();
				if(u.choice5<1 || u.choice5>2) {
					System.out.println("*******************************************************************");
					System.out.println("Wrong Choice, Please select a valid Choice from 1-2");
					System.out.println("*******************************************************************");
					sc.nextLine();
					System.out.println("Press ENTER key to proceed");
					choice3=sc.nextLine();




				}
			}while(u.choice5 <1 || u.choice5>2);


			switch(u.choice5)
			{
			case 1 :System.out.println("Selected golden pack");
			break;
			case 2 :System.out.println("Selected silver pack");
			break;
			}
			break;
			}
			System.out.println("*******************************************************************");
			System.out.println("Enter the time of the event(Day/Night)");
			u.setDays(sc.nextLine());
			u.setDays(sc.nextLine());
			System.out.println("Enter the no of guests for the event");
			u.setGuests(sc.nextInt());
			System.out.println("*******************************************************************");
			do {
				System.out.println("Select the type of Cuisine(Any one) \n\nChinese Cuisine(Complementary)");
				System.out.println("1)Indian Cuisine(Rs.1000.0 per person)\n2)Italian Cuisine(Rs.1500.0 per person)\n3)American Cuisine(Rs.1800.0 per person)\n4)Japanese Cuisine(Rs.2000.0 per person)");
				System.out.println("*******************************************************************");

				u.choice6 = sc.nextInt();
				if(u.choice6<1 || u.choice6>4) {
					System.out.println("*******************************************************************");
					System.out.println("Wrong Choice, Please select a valid Choice from 1-4");
					System.out.println("*******************************************************************");
					sc.nextLine();
					System.out.println("Press ENTER key to proceed");
					choice3=sc.nextLine();




				}
			}while(u.choice6 <1 || u.choice6>4);


			switch(u.choice6)
			{
			case 1 :System.out.println("Indian Cuisine \nCost= Rs.1000.0 per person");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			break;
			case 2:System.out.println("Italian Cuisine \nCost= Rs.1500.0 per person ");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			break;

			case 3:System.out.println("American Cuisine \nCost= Rs.1800.0 per person ");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			break; 
			case 4:System.out.println("Japanese Cuisine \nCost= Rs.2000.0 per person ");
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			break; 
			}
			choice3=sc.nextLine();
			System.out.println("*******************************************************************");
			System.out.println("Press ENTER key to proceed");
			System.out.println("*******************************************************************");
			sc.nextLine();

			i.login1(); 
			u.display2();
			u.display3();


			System.out.println("*******************************************************************");
			System.out.println("Press ENTER key to proceed");
			System.out.println("*******************************************************************");
			choice2=sc.nextLine();

			u.display4();
		}

		else {

			System.out.println("Thanks for choosing us!!");
		}
	}
}


