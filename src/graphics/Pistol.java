package graphics;

public class Pistol extends Weapon {
	
	private int originalDamage;
	private long timeCreated = System.currentTimeMillis();
	
	public Pistol(String name, int damage) {
		super(name, damage);
		this.originalDamage = this.getDamage();
	}

	public void activateSpecial() {
		long timeNow = System.currentTimeMillis();
		// For every second that this pistol exists, it's damage goes up by one.
		this.setDamage(originalDamage + (int)((timeNow - timeCreated) / 1000));
		System.out.println(this.getDamage());
	}
	
}
