package com.cathy.bladedemo.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.RestResponse;
import com.cathy.bladedemo.model.User;

import java.util.ArrayList;
import java.util.List;

@Path
public class AjaxController {
    @GetRoute("/ajax")
    public String ajax(){
        return "ajax.html";
    }

    @GetRoute("users")
    @JSON
    public RestResponse<List<User>> users(){
        List<User> users = this.buildUsers();
        return RestResponse.ok(users);
    }

    private List<User> buildUsers(){
        List<User> users = new ArrayList<>();
        for(int i=1;i<=10;i++){
            User user=new User();
            user.setId(i);
            user.setUserName("用户"+i);
            user.setAge(i+20);

            users.add(user);
        }

        return users;
    }
}
