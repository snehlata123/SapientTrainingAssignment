package enc;

public class StrategyPatternImple {
	
	private Strategy strategy;
	
	

	public StrategyPatternImple(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	public int findStrategy(int a,int b){
		return strategy.doSomething(a, b);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println( new StrategyPatternImple(new StrategyCheckSum()).findStrategy(10, 20));
	}

	
}


interface Strategy{
	public int doSomething(int a, int b);
}

class StrategyCheckMutiply implements Strategy{

	@Override
	public int doSomething(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

class StrategyCheckSum implements Strategy{

	@Override
	public int doSomething(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}