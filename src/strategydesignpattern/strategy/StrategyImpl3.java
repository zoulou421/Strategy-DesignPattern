package strategydesignpattern.strategy;

public class StrategyImpl3 implements IStrategy{

	@Override
	public void applyStrategy() {
		System.out.println("Intermediate step with algo strategy 3");
	}

}
