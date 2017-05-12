package com.huang.decorator;

/**
 * 具体对象
 */
public class PersonComponent implements Componet{


    private String name;

    public PersonComponent(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("装扮对象是"+name);
    }
}
