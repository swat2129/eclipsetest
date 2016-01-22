package graphics;

import java.util.concurrent.TimeUnit;

public class Game {
	
	public static void main(String[] args) {
		Weapon gun = new Pistol("pistol", 15);
		
		System.out.println("The weapon \"" + gun.getName() + "\" does " + gun.getDamage() + " damge.");
		
		gun.activateSpecial();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		gun.activateSpecial();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		gun.activateSpecial();
		
		System.out.println("The weapon \"" + gun.getName() + "\" does " + gun.getDamage() + " damge.");
	}
}
