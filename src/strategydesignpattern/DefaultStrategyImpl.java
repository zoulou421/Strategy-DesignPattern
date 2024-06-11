package strategydesignpattern;

import strategydesignpattern.strategy.IStrategy;

public class DefaultStrategyImpl implements IStrategy{

	@Override
	public void applyStrategy() {
		System.out.println("Intermediate step with algo strategy by default");
	}

}
