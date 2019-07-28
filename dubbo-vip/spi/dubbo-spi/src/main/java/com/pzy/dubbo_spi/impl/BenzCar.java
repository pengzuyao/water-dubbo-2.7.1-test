package com.pzy.dubbo_spi.impl;

import com.pzy.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class BenzCar implements CarInterface {

    private CarInterface carInterface;

    public void setCarInterface(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("before");
        carInterface.getColor(url);
        System.out.println("after");
    }
}
