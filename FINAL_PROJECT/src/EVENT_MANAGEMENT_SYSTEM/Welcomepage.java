package EVENT_MANAGEMENT_SYSTEM;

public class Welcomepage extends Login  {
	protected String answer;
	

	
	
	
	public String getAnswer() {
		return answer;
		}
		public void setAnswer(String answer) {
		this.answer = answer;
		}
	public void displaywelcomemessage(){
		
		System.out.println("Welcome to Booking Management System");
	    System.out.println("*********************************************************************");
	    System.out.println("To continue you have to login first.");
	    System.out.println("Do you want to continue with login?");
	    System.out.println("(YES / NO)");
	    System.out.println("*********************************************************************");
	    }
	
	
	  
}
