package strategydesignpattern.game.personages;

import strategydesignpattern.game.strategies.BehaviourWeapon;

public abstract class Personage {
 protected String name;
 protected int score;
 
 protected BehaviourWeapon behaviourWeapon; 
 
 public abstract void fight();

 public void setBehaviourWeapon(BehaviourWeapon behaviourWeapon) {
		this.behaviourWeapon = behaviourWeapon;
}
 
 
 
}
