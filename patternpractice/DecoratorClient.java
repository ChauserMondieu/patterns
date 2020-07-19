package patternpractice;

public class DecoratorClient{
	public static void main(String args[]){
		// initialize one concrete component
		Component concreteComponent = new ConcreteComponent();
		// apply one decorator to this concete component
		Component decoratedComponent = new ConcreteDecorator(concreteComponent);
	}
	
}

/**
 * design pattern - interface dependency pattern
 *
 */
interface Component{
	void moudule();
}

/**
 * decoretee class - basic class
 *
 */
class ConcreteComponent implements Component{
	@Override
	public void module(){
		System.out.println("This method implements some functions...")
	}
}

/** 
 * decorator class
 *
 */
class Decorator implements Component{
	private ConcreteComponent concreteComponent = null;
	
	public Decorator(Component concreteComponent){
		this.concreteComponent = concreteComponent;
	}
	
	@Override
	public void module(){
		super.module();
	}
}

/**
 * decorator that realizes more implementations
 *
 */
class ConcreteDecorator extends Decorator{
	public void ConcreteDecorator(Component concreteComponent){
		super(concreteComponent);
	}
	
	@Override
	public void module(){
		super.module();
		System.out.println("this is the extra implementation...");
	}
}