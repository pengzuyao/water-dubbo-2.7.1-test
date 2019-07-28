package com.pzy.java_spi.impl;

import com.pzy.java_spi.api.CarInterface;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class RedColor implements CarInterface {

    @Override
    public void getColor() {
        System.out.println("red");
    }
}
