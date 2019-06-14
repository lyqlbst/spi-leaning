package priv.hello.spi.impl;

import priv.hello.spi.Hello;

/**
 * @author yuqiang lin
 * @description 中文hello
 * @email 1098387108@qq.com
 * @date 2019/6/14 5:28 PM
 */
public class CnHelloImpl implements Hello {
    @Override
    public void sayHello() {
        System.out.println("How's going, dude.");
    }
}
