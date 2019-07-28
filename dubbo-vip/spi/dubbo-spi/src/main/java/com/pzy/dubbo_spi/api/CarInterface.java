package com.pzy.dubbo_spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
@SPI
public interface CarInterface {

    @Adaptive("car")
    public void getColor(URL url);
}
