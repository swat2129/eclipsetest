package graphics;

public class Pistol extends Weapon {
	
	int originalDamage;
	long timeCreated = System.currentTimeMillis();
	
	public Pistol(String name, int damage) {
		super(name, damage);
		originalDamage = this.damage;
	}

	public void activateSpecial() {
		long timeNow = System.currentTimeMillis();
		damage = originalDamage + (int)((timeNow - timeCreated) / 1000);
		System.out.println(damage);
	}
	
}
