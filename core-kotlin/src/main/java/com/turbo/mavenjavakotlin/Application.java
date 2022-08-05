package com.turbo.mavenjavakotlin;

import com.turbo.mavenjavakotlin.services.JavaService;

public class Application {

    public static void main(String[] args) {
        new JavaService().sayHello();

        new KotlinService().sayHello();
    }

}
