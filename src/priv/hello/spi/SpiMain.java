package priv.hello.spi;

import java.util.ServiceLoader;

/**
 * @author yuqiang lin
 * @description 通过spi的方式加载实现类
 * @email 1098387108@qq.com
 * @date 2019/6/14 5:31 PM
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<Hello> loaders = ServiceLoader.load(Hello.class);
        for (Hello helloImpl : loaders) {
            helloImpl.sayHello();
        }
    }
}
