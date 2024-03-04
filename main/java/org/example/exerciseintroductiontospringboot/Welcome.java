package org.example.exerciseintroductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {


@GetMapping(path = "/name")
    public String getName(){
        return "My name is Haya";

    }
    @GetMapping(path = "/age")
    public String getAge(){
    return "My age is 23";
    }

    @GetMapping(path = "/check/status")
    public String getStatus(){
    return "Everything is OK";
    }

    @GetMapping("/health")
    public String getHealth() {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public String[] getNames() {
        String[] names = {"Haya", "Sara", "Noura"}; //  array of names
        return names;

    }
}
