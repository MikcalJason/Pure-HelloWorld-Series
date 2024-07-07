/**
 * Created on  13-09-19 20:56
 */
package com.quick.start.proxy;

import com.quick.start.pure.controller.TestController;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */
public class CachePointcut extends StaticMethodMatcherPointcut implements ClassFilter {
    @Override
    public boolean matches(Class<?> clazz) {
        if (clazz.equals(TestController.class)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        if (targetClass.equals(TestController.class) && method.getName().equals("world")) {
            return true;
        }
        return false;
    }
}