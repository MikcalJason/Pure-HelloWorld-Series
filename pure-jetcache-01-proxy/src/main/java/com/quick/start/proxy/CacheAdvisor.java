/**
 * Created on  13-09-19 20:40
 */
package com.quick.start.proxy;


import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;

/**
 * @author <a href="mailto:areyouok@gmail.com">huangli</a>
 */
public class CacheAdvisor extends AbstractBeanFactoryPointcutAdvisor {

    public static final String CACHE_ADVISOR_BEAN_NAME = "jetcache3s.internalCacheAdvisor";


    @Override
    public Pointcut getPointcut() {
        CachePointcut cachePointcut = new CachePointcut();
        return cachePointcut;
    }
}
