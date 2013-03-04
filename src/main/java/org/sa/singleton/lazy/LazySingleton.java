package org.sa.singleton.lazy;

public class LazySingleton 
{
	
	private static LazySingleton ms_instance;
	
	private LazySingleton()
	{
		
	}
	
	public static LazySingleton instance()
	{
		//	Double locking check mechanism
		if(ms_instance == null)
		{
			synchronized (ms_instance) 
			{
				if(ms_instance == null)
				{
					ms_instance = new LazySingleton();
				}
			}
		}
		
		return ms_instance;
	}
	
}
