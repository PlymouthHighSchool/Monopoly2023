import java.awt.*;
public class Sets extends Property {
		String color;
		int numberInSet;
	Property[] inSet = new Property[10];
Sets(String theColor, int theNumberInSet) {// this is a constructor for a single set
		color = theColor;
		numberInSet = theNumberInSet;

		}	
public Property[] Sets() {//this is the constructor for the array of sets which uses the other
	
		
		inSet[0]=new Sets("Purple",2);
		inSet[1]=new Sets("BabyBlue",3);
		inSet[2]=new Sets("Pink",3);
		inSet[3]=new Sets("Orange",3);
		inSet[4]=new Sets("Red",3);
		inSet[5]=new Sets("Yellow",3);
		inSet[6]=new Sets("Green",3);
		inSet[7]=new Sets("Blue",2);
		inSet[8] = new Sets("RailRoads",4);
		inSet[9] = new Sets("Utilties",2);
		return inSet;
		
	}
}
