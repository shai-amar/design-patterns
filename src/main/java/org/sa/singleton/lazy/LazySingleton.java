package org.sa.singleton.lazy;

public class LazySingleton 
{
	
	private LazySingleton()
	{}
	
	public static LazySingleton instance()
	{   //  Initializing the lazy singleton only by demand, meaning, the
	    // inner class does not created until it is called
		return LazySingletonHolder.INSTANCE;
	}

    private static class LazySingletonHolder
    {
        public static final LazySingleton INSTANCE =  new LazySingleton();
    }
	
}
