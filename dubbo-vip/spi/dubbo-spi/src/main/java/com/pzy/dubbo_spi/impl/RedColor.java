package com.pzy.dubbo_spi.impl;


import com.pzy.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class RedColor implements CarInterface {

    @Override
    public void getColor(URL url) {
        System.out.println("red");
    }
}
