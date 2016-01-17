package graphics;

import java.util.concurrent.TimeUnit;

public class Game {
	
	public static void main(String[] args) {
		Weapon shit = new Pistol("shit", 15);
		
		System.out.println("The weapon \"" + shit.getName() + "\" does " + shit.getDamage() + " damge.");
		
		shit.activateSpecial();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		shit.activateSpecial();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		shit.activateSpecial();
		
		System.out.println("The weapon \"" + shit.getName() + "\" does " + shit.getDamage() + " damge.");
	}
}
