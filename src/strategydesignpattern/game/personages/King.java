package strategydesignpattern.game.personages;

import strategydesignpattern.game.strategies.BehaviourWeaponDagger;

public class King extends Personage {
	
	public King() {
		this.behaviourWeapon=new BehaviourWeaponDagger();
	}

	@Override
	public void fight() {
		
		System.out.println("I am the King!!!");
		this.behaviourWeapon.useWeapon();
	}

}
