package strategydesignpattern;

import java.util.Scanner;

import strategydesignpattern.strategy.IStrategy;

public class App {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//STATIC APPROACH
		/* Context ctx=new Context();
		ctx.process();
		System.out.println("------------------");
		ctx.setiStrategy(new StrategyImpl1());
		ctx.process();
		
		System.out.println("------------------");
		ctx.setiStrategy(new StrategyImpl2());
		ctx.process();
		
		System.out.println("------------------");
		ctx.setiStrategy(new StrategyImpl3());
		ctx.process();*/
		
		//DYNAMIC APPROACH
		Context context=new Context();
		boolean end=false;
		Scanner sc=new Scanner(System.in);
		while(!end) {
			System.out.println("Enter your strategy: ");
			String strategyClassName=sc.nextLine();
			IStrategy strategy=(IStrategy)Class.forName(strategyClassName).newInstance();
			context.setiStrategy(strategy);
			System.out.println("------------------");
			context.process();
		}
		 

	}

}
