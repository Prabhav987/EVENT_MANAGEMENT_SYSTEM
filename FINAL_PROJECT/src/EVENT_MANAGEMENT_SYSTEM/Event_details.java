package EVENT_MANAGEMENT_SYSTEM;

public class Event_details extends Welcomepage {
	protected int event;
	protected int event2;
	protected String days;
	protected int guests;
	protected int cuisine;
	int choice,choice5,choice6;
 double total, total1,total2;
	public int getEvent() {
		return event;
	}
	public void setEvent(int event) {
		this.event = event;
	}
	public int getEvent2() {
		return event2;
	}
	public void setEvent2(int event2) {
		this.event2 = event2;
	}

	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public int getGuests() {
		return guests;
	}
	public void setGuests(int guests) {
		this.guests = guests;
	}
	public int getCuisine() {
		return cuisine;
	}
	public void setCuisine(int cuisine) {
		this.cuisine = cuisine;
	}
	public void display2() {
		if(choice==1)
		{
			System.out.println("Event Type - Birthday Party");
			if(choice5==1) {
				System.out.println("Selected Pack - Golden pack includes\n*40 Birthday caps and Musical cake cutting knife\nFour fun activities -  @Magic show  @Gun shooting  @Tatto maker  @Puppet show \nPrice - Rs.10000.0" );
			}else
				System.out.println("Selected Pack - Silver Pack includes\n*20 Birthday caps\n*Two fun activities -  @Magic show  @Tatto maker\nPrice - Rs.5000.0");
			}
	else if(choice==2) { 
		System.out.println("Event Type - Marriage Party");
		if(choice5==1) {
			System.out.println("Selected Pack - Golden pack includes\n*Photobooth and DJ night \n*Live music and special performances\nPrice - Rs.15000.0");
		}else
			System.out.println("Selected Pack - Silver Pack includes\n*Photobooth and DJ night\nPrice - Rs.10000.0");
		}
	else {
		System.out.println("Event Type - Corporate Party");
		if(choice5==1) {
			System.out.println("Selected Pack - Golden pack includes\n*Seminars and Golf Events\n*Trade shows and Product launch events\n*Business dinner\nPrice - Rs.20000.0");
		}else
			System.out.println("Selected Pack - Silver Pack includes\n*Seminars and Product launch events\nPrice - Rs.15000.0");
	}}
		public void display3(){
			if(choice6==1) {
			System.out.println("Cuisine Selected - 1)Indian Cuisine  2)Chinese Cuisine");
			}
			else if(choice6==2) {
			System.out.println("Cuisine Selected - 1)Italian Cuisine  2)Chinese Cuisine");
			}
			else if(choice6==3) {
			System.out.println("Cuisine Selected - 1)American Cuisine  2)Chinese Cuisine");
				
			}else
			System.out.println("Cuisine Selected - 1)Japanese Cuisine  2)Chinese Cuisine");
}
		public void display4(){	
			System.out.println("Bill Details -");
			if(choice==1) {
				total= 100.0*getGuests();
				System.out.println("Cost of hall -  Rs."+ total+"(Per person)");
				if(choice5==1) {
					System.out.println("Package Price - Rs.10000.0 (Golden Pack)");
				}else
					System.out.println("Package Price - Rs.5000.0 (Silver Pack)");
			
				if(choice6==1) {
					total1 =getGuests()*1000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Indian Cuisine)");
					}
					else if(choice6==2) {
						total1 =getGuests()*1500.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - Italian Cuisine)");
					}
					else if(choice6==3) {
						total1 =getGuests()*1800.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - American Cuisine)");
					}else if(choice6==3) {
						total1 =getGuests()*2000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Japanese Cuisine)");
					}
					if(choice5==1) {
						total2=total+total1+10000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
					}else if(choice5==2) {
						total2=total+total1+5000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
				}}
			else if(choice==2) {
				total= 500.0*getGuests();
				System.out.println("Cost of hall -  Rs."+ total+"(Per person)");
				if(choice5==1) {
					System.out.println("Package Price - Rs.15000.0 (Golden Pack)");
				}else
					System.out.println("Package Price - Rs.10000.0 (Silver Pack)");
				if(choice6==1) {
					total1 =getGuests()*1000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Indian Cuisine)");
					}
					else if(choice6==2) {
						total1 =getGuests()*1500.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - Italian Cuisine)");
					}
					else if(choice6==3) {
						total1 =getGuests()*1800.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - American Cuisine)");
					}else if(choice6==4) {
						total1 =getGuests()*2000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Japanese Cuisine)");
					}
					if(choice5==1) {
						total2=total+total1+15000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
					}else if(choice5==2) {
						total2=total+total1+10000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
				}}
			else if(choice==3) {
				total= 1000*getGuests();
				System.out.println("Cost of hall -  Rs."+ total+"(Per person)");
				if(choice5==1) {
					System.out.println("Package Price - Rs.20000.0 (Golden Pack)");
				}else
					System.out.println("Package Price - Rs.15000.0 (Silver Pack)");
			
				if(choice6==1) {
					total1 =getGuests()*1000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Indian Cuisine)");
					}
					else if(choice6==2) {
						total1 =getGuests()*1500.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - Italian Cuisine)");
					}
					else if(choice6==3) {
						total1 =getGuests()*1800.0;
						System.out.println("Cuisine price - Rs."+ total1+"(Per person - American Cuisine)");
					}else if(choice6==4) {
						total1 =getGuests()*2000.0;
					System.out.println("Cuisine price - Rs."+ total1+"(Per person - Japanese Cuisine)");
					}
					if(choice5==1) {
						total2=total+total1+20000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
					}else if(choice5==2) {
						total2=total+total1+15000.0;
						System.out.println("Total Payable - Rs."+total2);
						System.out.println("\nWe will contact you for further more details. Thank You!!");
				}
					
					}
			}
			
}

