package com.ovchikov.mememanager.server.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("meme")
public class MemeController {
    private List<String> developers = Stream.of(
            new String("aboba"),
            new String("baboba"),
            new String("caboba")
    ).collect(Collectors.toList());

    @GetMapping
    public List<String> list(){
        return developers;
    }

    @PostMapping
    public String create(@RequestBody String developer){
        this.developers.add(developer);
        return developer;
    }

}
