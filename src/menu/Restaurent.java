package menu;

public class Restaurent {

	private String name;
	private long phoneNumberL;
	private String email;
	private String webSiteName;
	private String address;
	
		public Restaurent(String name, long phoneNumberL, String email, String webSiteName, String address) {
		this.name = name;
		this.phoneNumberL = phoneNumberL;
		this.email = email;
		this.webSiteName = webSiteName;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNumberL() {
		return this.phoneNumberL;
	}
	
	public void setPhoneNumberL(long phoneNumberL) {
		this.phoneNumberL = phoneNumberL;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getWebSiteName() {
		return this.webSiteName;
	}
	
	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
}