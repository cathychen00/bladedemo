package com.cathy.bladedemo;

import com.blade.Blade;

public class Application {
    public static void main(String[] args) {
//        Blade.me().get("/", (request, response) -> {
//            response.text("Hello World");
//        }).start();

        //showFileList(true)可以查看目录
        Blade.of().showFileList(true).start(Application.class,args);
    }
}
