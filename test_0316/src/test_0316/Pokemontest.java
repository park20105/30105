package test_0316;

public class Pokemontest {
	
	public static void main(String[] args) {
		Pokemon p = new Pokemon("피카츄", 4, "물");
		Pokemon p1 = new Pokemon("파이리", 4, "불");
		
		p.showInformation();
		p1.showInformation();
		
	}
}

class Pokemon {
	String name;
	int legs;
	String skill;
	public Pokemon(String n, int l, String s) {
		name = n;
		legs = l;
		skill = s;
	}
	
	public void showInformation() {
		System.out.println("객체의 이름은 " + name + ", 다리 갯수는 " + legs + "개, 기술은 " + skill);
	}
}
