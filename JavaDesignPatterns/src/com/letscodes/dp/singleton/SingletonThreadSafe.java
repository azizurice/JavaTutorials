package com.letscodes.dp.singleton;
/*There are many ways to make a Singleton Class as thread safe. The following one is one of the best ones*/
public class SingletonThreadSafe {
	
	private SingletonThreadSafe(){
		
	}
	public static SingletonThreadSafe getInstance(){
		return InstanceHolder.instance;
	}

	private static class InstanceHolder{
		private static final SingletonThreadSafe instance =new SingletonThreadSafe();
	}
}
