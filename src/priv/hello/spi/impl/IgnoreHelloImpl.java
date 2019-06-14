package priv.hello.spi.impl;

import priv.hello.spi.Hello;

/**
 * @author yuqiang lin
 * @description 忽略的hello
 * @email 1098387108@qq.com
 * @date 2019/6/14 5:35 PM
 */
public class IgnoreHelloImpl implements Hello {
    @Override
    public void sayHello() {
        System.out.println("I'm ignored.");
    }
}
