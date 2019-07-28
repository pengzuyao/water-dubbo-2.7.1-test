package com.pzy.dubbo_spi.impl;

import com.pzy.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class CarWrapper2 implements CarInterface {

    private CarInterface carInterface;

    public CarWrapper2(CarInterface carInterface){
        this.carInterface = carInterface;
    }

    @Override
    public void getColor(URL url) {
        //AOP....
        //before
        System.out.println("before2");
        carInterface.getColor(url);
        //after
        System.out.println("after2");
    }
}
