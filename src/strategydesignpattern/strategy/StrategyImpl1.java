package strategydesignpattern.strategy;

public class StrategyImpl1 implements IStrategy{

	@Override
	public void applyStrategy() {
		System.out.println("Intermediate step with algo strategy 1");
	}

}
