package patternpractice;

public class StaticProxyClient{
	public static void main(String[] args){
		RealComponent real = new RealComponent();
		ProxyComponent proxy = new ProxyComponent(real);
		proxy.business();
	}
}

/**
 * structure of real component and proxy component
 */
interface Pattern{
	void before();
	void after();
	void business():
}

/** 
 * real component
 */
class RealComponent{
	@Override
	public void business(){
		System.out.println("This method will implememt the main business logic for project...")
	}
}

/**
 * proxy component
 */
class ProxyComponent{
	private RealComponent realComponent = null;
	
	public void ProxyComponent(Pattern realComponent){
		this.realComponent = realComponent;
	}
	
	@Override
	public void before(){
		System.out.println("procedures and processes before main business unit...")
	}
	
	@Override
	public void after(){
		System.out.println("procedures and processes after main business unit...")
	}
	
	@Override
	public void business(){
		realComponent.business
	}
}

