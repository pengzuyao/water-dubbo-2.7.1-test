package com.pzy.dubbo_spi;

import com.pzy.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-28
 */
public class CarDemo {

    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);
        CarInterface red = extensionLoader.getExtension("benz");
        Map<String ,String> map = new HashMap<>();
        map.put("car" ,"red");
        URL url = new URL("" ,"", 1,map);
        red.getColor(url);
    }
}
