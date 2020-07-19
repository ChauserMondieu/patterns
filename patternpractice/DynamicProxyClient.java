package patternpractice;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class DynamicProxyClient{
	public static void main(String[] args){
		Module module = new Module();
		ModuleHandler handler = new ModuleHandler();
		proxy = (ModulePattern)handler.newProxyInstance(module);
		proxy.business();
		
	}
}

interface ModulePattern{
	void business();
}

class Module implements ModulePattern{
	@Overrride
	public void business(){
		System.out.println("This module will complete basic business function...");
	}
}

class ModuleHandler implements InvocationHandler{
	private ModulePattern module = null;
	public ModulePattern newProxyInstance(ModulePatten module){
		this.module = module;
		return newProxyInstance(module.getClass().getClassloader(),module.getClass().getInterfaces(),this);
	}
	@Override
	public void invoke(Object proxy, Method method, Object[] args){
		System.out.println("things needs to be done beforehand...");
		method.invoke(module,args);
		System.out.println("things needs to be done afterhand...");
		return null;
	}
}