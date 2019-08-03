package net.coding.demo.hello;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jiong on 2017/7/10.
 */
public class HelloTest {

    @Test
    public void testEnglishHello() {
        Assert.assertEquals(Hello.say("english"), "Hello World!");
    }

    @Test
    public void testAnyHello() {
        Assert.assertEquals(Hello.say("java"), "Hello World!");
    }

    @Test
    public void testChineseHello() {
        Assert.assertEquals(Hello.say("chinese"), "你好，世界！");
    }

    @Test
    public void testJapaneseHello() {
        Assert.assertEquals(Hello.say("japanese"), "こんにちは世界!");
    }

    @Test
    public void testFrenchHello() {
        Assert.assertEquals(Hello.say("french"), "Bonjour le monde!");
    }
}
