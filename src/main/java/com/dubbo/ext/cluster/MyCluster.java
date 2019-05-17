package com.dubbo.ext.cluster;


import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.Cluster;
import com.alibaba.dubbo.rpc.cluster.Directory;

/**
 * @ClassName MyCluster
 * @Description 集群容错扩展， 一般默认为重试2次
 * @Author xuery
 * @Date 2019/5/16 16:33
 * @Version 1.0
 */
public class MyCluster implements Cluster {

    @Override
    public <T> Invoker<T> join(Directory<T> directory) throws RpcException {
        return null;
    }
}
