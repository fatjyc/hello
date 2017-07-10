package net.coding.demo.hello;

/**
 * Created by jiong on 2017/7/10.
 */
public class Translator {

    private String language;

    public Translator() {
        this.language = "english";
    }

    public Translator(String language) {
        this.language = language;
    }

    public String say() {
        if (language.equals("chinese")) {
            return "你好，世界！";
        } else {
            return "Hello World!";
        }
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
