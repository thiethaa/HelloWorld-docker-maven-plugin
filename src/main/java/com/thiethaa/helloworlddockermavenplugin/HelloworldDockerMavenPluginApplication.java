package com.thiethaa.helloworlddockermavenplugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldDockerMavenPluginApplication {

    @GetMapping("/")
    public String hello(){
        return "Hello from TeamCity yeayyy...";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloworldDockerMavenPluginApplication.class, args);
    }

}
