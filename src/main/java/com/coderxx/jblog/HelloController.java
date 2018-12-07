package com.coderxx.jblog;

import com.coderxx.jblog.property.CrossProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.nio.file.*;

@RestController
public class HelloController {
    @Autowired
    private CrossProperty crossProperty;

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") Integer id) {
        return ", id = " + id + crossProperty.getOrigin();
    }

    @GetMapping("/writeDataToFile")
    public String writeDataToFile(String jsonStr) throws IOException {
//        try{
//            String data = " This content will append to the end of the file";
//
//            File file =new File("blogs/1.md");
//
//            //if file doesnt exists, then create it
//            if(!file.exists()){
//                file.createNewFile();
//            }
//
//            //true = append file
//            FileWriter fileWritter = new FileWriter(file.getPath(),true);
//
////            System.out.println(file.getPath()+file.getName());
//
//            fileWritter.write(data);
//            fileWritter.close();
//
//            System.out.println("Done");
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        return "1";
    }
}
