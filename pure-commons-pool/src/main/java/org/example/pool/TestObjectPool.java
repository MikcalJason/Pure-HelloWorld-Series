package org.example.pool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * 自定义对象池
 *
 * @author lz
 * @date 2019/7/30
 */
public class TestObjectPool extends GenericObjectPool<TestObject> {

    public TestObjectPool(PooledObjectFactory<TestObject> factory) {
        super(factory);
    }

    public TestObjectPool(PooledObjectFactory<TestObject> factory, GenericObjectPoolConfig<TestObject> config) {
        super(factory, config);
    }

    public TestObjectPool(PooledObjectFactory<TestObject> factory, GenericObjectPoolConfig<TestObject> config, AbandonedConfig abandonedConfig) {
        super(factory, config, abandonedConfig);
    }
}