package priv.hello.spi.impl;

import priv.hello.spi.Hello;

/**
 * @author yuqiang lin
 * @description 英文hello
 * @email 1098387108@qq.com
 * @date 2019/6/14 5:26 PM
 */
public class EnHelloImpl implements Hello {
    @Override
    public void sayHello() {
        System.out.println("你好啊小伙子。");
    }
}
