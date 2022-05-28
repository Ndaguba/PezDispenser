import java.io.Console;
import java.util.*;
public class main {

	public static void main (String [] args) {
		PezDispenser dispenser = new PezDispenser("emeka");
		System.out.printf("my name is %s\n",dispenser.getCharacterName());
		
	// lets create a new PezDispenser.
		PezDispenser dispenserII = new PezDispenser("uche");
		System.out.printf("my name is %s\n",dispenserII.getCharacterName());
	}
}
