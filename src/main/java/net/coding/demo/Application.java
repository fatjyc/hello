package net.coding.demo;

import net.coding.demo.hello.Hello;

public class Application {

    public static void main(String[] args) {
        String language = null;
        if (args.length > 0) {
            language = args[0];
        }
        System.out.println(Hello.say(language));
    }
}
