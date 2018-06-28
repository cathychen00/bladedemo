package com.cathy.bladedemo.controller;

import com.blade.mvc.annotation.*;
import com.blade.mvc.http.Request;
import com.blade.mvc.ui.RestResponse;

@Path
public class IndexController {

    @GetRoute("/")
    public String index() {
        return "index.html";
    }

//    @PostRoute("/save")
//    public void saveUser(@Param String username) {
//        System.out.println("save " +username);
//    }
//
//    @PutRoute("/put")
//    public void updateUser(@Param String username) {
//        System.out.println("update "+username);
//    }
//
//    @DeleteRoute("/delete/:id")
//    public void deleteUser(@PathParam int id){
//        System.out.println("delete "+id);
//    }

    @GetRoute("/signin")
    public String signin(){
        return "signin.html";
    }

    @PostRoute("/signin")
    @JSON
    public RestResponse signin(Request request){
        return RestResponse.ok();
    }
}
