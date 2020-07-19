package paternpractice;

public class CombinationClient{
	public static void main(String[] args){
		
	}
}

interface Composite{
	void business();
}

interface Leaf implements Composite{
	@Override
	public void business(){
		System.out.println("implementing main logic...");
	}
	
	public void leaf(){
		System.out.println("implementation special to leaf...");
	}
	
}

interface Container implements Composite{
	@Override
	public void business(){
		System.out.println("implementing main logic...");
	}
	
	public void container(){
		System.out.println("implementation special to containers....");
	}
}