/**
 * 
 */
package com.fields.business.interceptor;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author bbx高
 *
 */
public class ServiceInterceptor implements MethodBeforeAdvice, ThrowsAdvice, AfterReturningAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		
	}

	public void afterThrowing(Method method, Object[] args, Object target, RuntimeException throwable) {
		// TODO Auto-generated method stub
		throw throwable;

	}

	@Override
	public void afterReturning(Object arg0, Method method, Object[] arg2, Object arg3) throws Throwable {
		
	}

}
