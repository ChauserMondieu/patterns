package patternpractice;

import java.util.Map;
import java.util.HashMap;

public class FlyWeightClient{
	public static void main(){
		FlyWeightFactory fwf = new FlyWeightFactory();
		String innerStatus = "";
		instance = fwf.getFlyweightinstance(innerStatus);
		instance.getInnerStatus();
		instance.getOutterStatus();
	}
}

/**
 * class containing outter status
 */
class FlyWeightOutterStatus{
	private String outterStatus;
	public void FlyWeightOutterStatus(String s){
		this.outterStatus = s;
	}
	
	public void setOutterStatus(String s){
		this.outterStatus = s;
	}
	
	public String getOutterStatus(){
		return outterStatus;
	}
}

/**
 * interface defining all possible status for instances
 */
interface FlyWeightPattern{
	void setInnerStatus(String s);
	String getInnerStatus();
	void displayOutterStatus(OutterStatus o);
}

/**
 * class of realization for all possible status
*/ 
class FlyWeightInnerStatus implements FlyWeightPattern{
	private String innerStatus;
	public void FlyWeightInnerStatus(String s){
		supter();
		this.innerStatus = s;
	}
	
	@Override
	public void setInnerStatus(String s){
		this.innerStatus = s;
	}
	
	@Override
	public String getInnerStatus(){
		return this.innerStatus;
	}
	
	@Override
	public String displayOutterStatus(OutterStatus o){
		return o.getOutterStatus();
	}
}

/**
 * flyweight factory, storing all inner status infomation of all instance,
 * using map to construct flyweight pool, and the key is defined by inner status, which is more stable
 */
 class FlyWeightFactory{
	 private Map<String,FlyWeightInnerStatus> flyweightPool= new HashMap<String,FlyWeightInnerStatus>();
	 public FlyWeightInnerStatus getFlyweightinstance(String innerStatus){
		 if(null != innerStatus){
			 return flyweightPool.get(innerStatus);
		 }else{
			 FlyWeightInnerStatus fwi = new FlyWeightInnerStatus(innerStatus);
			 flyweightPool.put(innerStatus,fwi);
			 return fwi;
		 }
	 }
 }