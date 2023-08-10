package week06;

public class Card {
	private String name;     // card name
	private int value;       //card value
	
	//constructor
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//describe card
	public void describe() {
		System.out.println(this.name + " -->" + this.value);
	}

}
