package strategydesignpattern.game.test;

import strategydesignpattern.game.personages.King;
import strategydesignpattern.game.personages.Personage;
import strategydesignpattern.game.personages.Prince;
import strategydesignpattern.game.personages.Queen;
import strategydesignpattern.game.strategies.BehaviourWeaponArrowAndArk;
import strategydesignpattern.game.strategies.BehaviourWeaponDagger;
import strategydesignpattern.game.strategies.BehaviourWeaponGun;

public class TestGame {

	public static void main(String[] args) {
		Personage prince=new Prince();
		prince.fight();
		
		Personage queen=new Queen();
		queen.fight();
		
		Personage king= new King();
		king.fight();
		
		System.out.println("---SWITCH---");
		prince.setBehaviourWeapon(new BehaviourWeaponArrowAndArk());
		prince.fight();
		
		queen.setBehaviourWeapon(new BehaviourWeaponGun());
		queen.fight();
		
		king.setBehaviourWeapon(new BehaviourWeaponDagger());
		king.fight();
	}

}
