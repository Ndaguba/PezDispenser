class PezDispenser{
	private String characterName;
// class which serves as a blueprint for PezDispenser
	
public PezDispenser (String characterName) {
	this.characterName = characterName;
// this constructor is required for everytume we create a new PezDispenser
}	

// because the characterName is private we would not be able to see it
// so we create a method/function to see the value of the PezDispenser

public String getCharacterName() {
	return characterName;
// this would display the value of the charaterName when called 
// we added String because that is the data type of the return value.
	
}
	// lets say you want to Swap character heads and return the previous one
public String swappHead(String characterName) {
	String originalCharacterName = this.characterName;
	this.characterName = characterName;
	return originalCharacterName;
}

	
}