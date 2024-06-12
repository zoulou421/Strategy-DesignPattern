package strategydesignpattern.game.personages;

import strategydesignpattern.game.strategies.BehaviourWeaponGun;

public class Prince extends Personage {
	
	public Prince() {
		this.behaviourWeapon=new BehaviourWeaponGun();
	}

	@Override
	public void fight() {
		System.out.println("I am a Prince...");
		this.behaviourWeapon.useWeapon();
		
	}

}
