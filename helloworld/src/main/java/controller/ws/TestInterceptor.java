package controller.ws;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TestInterceptor {
    @AroundInvoke
    private Object countCalls(InvocationContext ic) throws Exception {
    	
        System.out.println("Interceptor called on method " + ic.getMethod().getName() );
        return ic.proceed();
    }
}