package patternpractice;

public class BridgeClient{
	public static void main(String[] args){
		
	}
}

/**
 * interface for the primary property
 */
interface PrimaryPattern{
	void module();
}

/**
 * primary property
 * could have any numbers of primary properties
 */
class PrimaryProperty implements PrimaryPattern{
	@Override
	public void module(){
		System.out.println("Processing data for this primary property...");
	}
}

/**
 * secondary poperty structure
 * holding one instance of primary property
 */
class SecondaryPropertyPattern{
	private PrimaryProperty primaryProperty = null;
	
	public void SecondaryProperty(PrimaryProperty primaryProperty){
		this.primaryProperty = primaryProperty;
	}
	
	public void module(){
		primaryProperty.module();
	}
}

/**
 * secondary property
 * could have any numbers of secondary properties
 */
class SecondaryProperty extends SecondaryPropertyPattern{
	@Override
	public void SecondaryProperty(PrimaryPattern primaryProperty){
		supter(primaryProperty);
	}
	
	@Override 
	public void module(){
		super.module();
		System.out.println("This line will realize the implementation of this secondary property...")
	}
}