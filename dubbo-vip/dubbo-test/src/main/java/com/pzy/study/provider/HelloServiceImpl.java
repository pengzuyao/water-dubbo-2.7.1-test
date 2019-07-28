package com.pzy.study.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.RpcContext;
import com.pzy.study.api.HelloService;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-27
 */
public class HelloServiceImpl implements HelloService {

    public String sayHello(String userName) {

        URL url = RpcContext.getContext().getUrl();
        System.out.println(url);
        return "hello dubbo!" + userName;
    }
}
