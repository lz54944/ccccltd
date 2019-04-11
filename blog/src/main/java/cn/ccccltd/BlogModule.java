package cn.ccccltd;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 *  图标和上传模块
 */
@Component
public class BlogModule {

    @PostConstruct
    public  void init(){
        System.out.println("-----------------------------------------------");
        System.out.println("--                                           --");
        System.out.println("--          Blog Module Loaded               --");
        System.out.println("--                                           --");
        System.out.println("-----------------------------------------------");
    }
}
