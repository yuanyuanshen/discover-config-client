package cn.itcast.test.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hello")
    public String sayHello(){
    	return "hello spring boot!";
    }
    @RequestMapping("/helloTest")
    public String sayHelloTest(){
    	return "hello spring 111111111!";
    }

}

