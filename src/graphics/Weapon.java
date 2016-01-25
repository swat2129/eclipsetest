package graphics;

/*
 * Singhung (Wilson) Wat (big Cuck)
 * January 17, 2016-
 * Abstract class for homework.
 */
for (int u = 0; u < 4; u++){
	System.out.println("u");
}
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
