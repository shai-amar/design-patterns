package org.sa.singleton.eager;

public class EagerSingleton 
{
	/**
	 * Eager instantiation initialize immediately the instance thus insures one and only one instance.
	 *  
	 */
	private static EagerSingleton ms_instance = new EagerSingleton();
	
	private EagerSingleton()
	{
		
	}
	
	public static EagerSingleton getInstance()
	{
		return ms_instance;
	}
	
}
