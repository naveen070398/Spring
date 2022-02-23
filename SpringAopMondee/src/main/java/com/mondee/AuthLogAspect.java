      package com.mondee;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthLogAspect  implements MethodInterceptor {

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("Authentication Done");
		Object ob=mi.proceed();
		System.out.println("Logging information Stored");
		return null;
	}

}                   
