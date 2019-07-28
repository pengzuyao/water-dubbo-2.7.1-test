package com.pzy.java_spi;

import com.pzy.java_spi.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class CarDemo {

    public static void main(String[] args) {
        //加载这个接口的实现类
        ServiceLoader<CarInterface> serviceLoaders = ServiceLoader.load(CarInterface.class);

        Iterator<CarInterface> iterator = serviceLoaders.iterator();
        while (iterator.hasNext()){
            CarInterface next = iterator.next();
            next.getColor();
        }
    }
}
