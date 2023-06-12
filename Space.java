public class Space {
	String nameOfSpace; 
	int location;
	Player owner = new Player();
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
		public void setOwner(Player newOwner) {
		owner = newOwner;
	}
	public Player getIsOwnedBy(){
		return owner;
	}
}
