package net.coding.demo.hello;

/**
 * Created by jiong on 2017/7/10.
 */
public class Hello {

    public static String say(String language) {
        Translator translator;
        if (null == language || "".equals(language)) {
            translator = new Translator();
        } else {
            translator = new Translator(language);
        }
        return translator.say();
    }
}
