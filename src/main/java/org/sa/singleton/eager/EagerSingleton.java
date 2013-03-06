package org.sa.singleton.eager;

public class EagerSingleton 
{
	
	private static EagerSingleton ms_instance = new EagerSingleton();
	
	private EagerSingleton()
	{
		
	}
	
	public static EagerSingleton getInstance()
	{
		return ms_instance;
	}
	
}
