package bhaichalja;

public class Freind {
   
	
	private String chintu;

	public void setName(String name) {
		chintu=name;
	}
	public String getName(){
		return chintu;	
		
	}
	public void saying() {
		System.out.printf("your first girlfriend name %s",
				getName());
	}
	
	
}
