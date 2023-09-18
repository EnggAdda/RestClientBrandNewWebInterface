package com.example.restclientbrandnewwebinterface.controller;

import com.example.restclientbrandnewwebinterface.entity.Post;
import com.example.restclientbrandnewwebinterface.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/listofposts")
    List<Post> getPosts(){
       return postService.getPostList();
    }

    @GetMapping("/getPostById/{id}")
    Post getPostById(@PathVariable Integer id ){
        return postService.getPostById(id);
    }

    @PostMapping("/insertPost")
    Post insert(@RequestBody Post post ){
        return postService.insert(post);
    }

    @PutMapping("/update/{id}")
    Post insert(@PathVariable Integer id ,@RequestBody Post post ){
        return postService.update(id , post);
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Integer id  ){
         postService.delete(id);
    }


}
