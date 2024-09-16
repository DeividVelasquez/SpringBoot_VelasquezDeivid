package com.example.prueba;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String holii(){
        return "Holaaa pecuecas!!!";
    }

    @RequestMapping("/json")
    public Map<String, String> prueba(){
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Hola pecuecasssssssss");
        return map;
    }



}
