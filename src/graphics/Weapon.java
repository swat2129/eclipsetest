package graphics;

/*
 * Singhung (Wilson) Wat
 * January 17, 2016
 * Abstract class for homework.
 */

public abstract class Weapon {
	
	private String name;
	private int damage;
	
	public Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public void setDamage(int newDamage) {
		this.damage = newDamage;
	}
	
	public abstract void activateSpecial();
}
