package EVENT_MANAGEMENT_SYSTEM;

public class Login {
	
        protected String name;
		protected String password;
		protected String answer;
		
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		
		public String getPassword() {
		return password;
		}
		public void setPassword(String password) {
		this.password = password;
		}
		
		public void login1(){
			 System.out.println("Event Details");
			System.out.println("Username - "+getName());
			
		}
			
		
		}


