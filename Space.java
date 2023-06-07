
public class Space {
	String nameOfSpace;
	int location;
	Player isOwnedBy;
	Boolean isOwned;
public Space(int location, String nameSpace) {
	nameOfSpace = nameSpace;
	location = location;
}
	public String getSpaceName(){
		return(nameOfSpace);
	}
	public int getLocation(){
		return location;
	}
}
