package com.nad.patterns;

public class SingletonLesyPattern {
	public static SingletonLesyPattern getInstance() {
		return InstanceCreator._instance;
		
	}
	
	private static class InstanceCreator{
		private static final SingletonLesyPattern _instance;
		static {
			_instance=new SingletonLesyPattern();
		}
	}
}
