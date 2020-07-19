package patternpractice;

public class AdapterClient{
	public static void main(String args[]){
		Target adapter1 = new Adapter1():
		adapterl.handler();
		Target adapter2 = new Adapter2();
		adapter2.handler();
	}
}

/**
 * design pattern - interface dependency pattern
 * adapter should have one interface to virtualize its structure
 */
Interface Target{
	void handler();
}

/**
 * adaptee function
 *
 **/
class Adaptee{
	public void request(){
		System.out.println("This method realize some implementations...");
	}
}

/**
 * adapter function with heritation of adaptee method
 *
 */
class Adapter1 implements Target extends Adaptee{
	@Override
	public void handler(){
		super.request();
	}
}

/**
 * adapter function with combination of adaptee method
 *
 */
class Adapter2 implements Target{
	private Adapter adapter;
	public Adapter2(Adapter adapter){
		this.adapter = adapter;
	}
	@Override
	public void handler(){
		adapter.reuquest();
	}
}