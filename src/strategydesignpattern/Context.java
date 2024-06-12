package strategydesignpattern;

import strategydesignpattern.strategy.IStrategy;

public class Context {
	private IStrategy iStrategy;
	
	public Context() {
		this.iStrategy=new DefaultStrategyImpl();
	}
	public void process() {
		System.out.println("Step Default...");
		iStrategy.applyStrategy();
		System.out.println("Final Step ended!");
	}
	public void setiStrategy(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}
	
	
}
