package com.hmily;

import com.hmily.starter.MiniApplication;

/**
 * @ClassName Application
 * @Description TODO
 * @Author Hmily
 * @Date 2019/12/22 16:05
 **/
public class Application {

    public static void main(String[] args) {
        System.out.println("hello world!");
        MiniApplication.run(Application.class, args);
    }
}
