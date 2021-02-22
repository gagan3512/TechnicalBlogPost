package com.upgrad.technicalblogpost.controller;

import com.upgrad.technicalblogpost.model.Post;
import com.upgrad.technicalblogpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
//1. Controller -> rest controller

@Controller
public class HomeController {

    public HomeController(){
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPost(Model model)
    {
        ArrayList<Post> posts = postService.getAllPost();

       /* ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("post 1");
        post1.setBody("post body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("post 2");
        post2.setBody("post body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("post 3");
        post3.setBody("post body 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
*/
        model.addAttribute( "posts", posts);

        return "index";



    }

}
