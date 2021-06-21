package com.q.pojo;

// µÃÂ¿‡
public class Hello {
    private String string;

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }

    public Hello() {
    }

    public Hello(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
