public class Space {
	String nameOfSpace; 
	int location;
	
	public Space(int localLocation, String nameSpace) {
		nameOfSpace = nameSpace;
		location = localLocation;
	}
	
	public int getLocation(){
		return location;
	}
	
	public void doAction() {
		
	}
	
	public String getSpaceName() {
		return nameOfSpace;
	}
}
