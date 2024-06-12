package strategydesignpattern.game.personages;

import strategydesignpattern.game.strategies.BehaviourWeaponArrowAndArk;
import strategydesignpattern.game.strategies.BehaviourWeaponDagger;

public class Queen extends Personage {
	
	public Queen() {
		this.behaviourWeapon=new BehaviourWeaponArrowAndArk();
	}

	@Override
	public void fight() {
		score+=4;
		System.out.println("I am a Queen!!! ");
		this.behaviourWeapon.useWeapon();
		System.out.println("Score= "+score);
		if(score>15) {
			this.setBehaviourWeapon(new BehaviourWeaponDagger());
		}
	}

}
