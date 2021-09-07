package com.company.creational.singlenton.singleton2;

public class Client {

	public static void main(String[] args) {
		LazyRegistryIODH singleton;
		
		
		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		System.out.println(singleton == singleton2);

		RegistryEnum registryEnum = RegistryEnum.INSTANCE;
		System.out.println(registryEnum);

	}

}
