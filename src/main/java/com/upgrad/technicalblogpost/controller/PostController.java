package com.upgrad.technicalblogpost.controller;

import com.upgrad.technicalblogpost.model.Post;
import com.upgrad.technicalblogpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPost(Model model){
        ArrayList<Post> posts = postService.getOnePost();
       model.addAttribute("post" , posts);
        return "posts";
    }
}
