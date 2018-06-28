package com.cathy.bladedemo.controller;

import com.blade.mvc.Const;
import com.blade.mvc.annotation.*;
import com.blade.mvc.multipart.FileItem;
import com.blade.mvc.ui.RestResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Path
public class UploadController {
    @GetRoute("/upload")
    public String upload(){
        return "upload.html";
    }

    @PostRoute("/upload")
    @JSON
    public RestResponse saveUpload(@MultipartParam FileItem fileItem){
        if(null!=fileItem){
            byte[] data=fileItem.getData();
            try{
                Files.write(Paths.get(Const.CLASSPATH+ "/static/upload/" +fileItem.getFileName()),data);
                return RestResponse.ok();
            }catch (IOException ex){
                ex.printStackTrace();
                return RestResponse.fail(ex.getMessage());
            }
        }

        return RestResponse.ok();
    }
}
