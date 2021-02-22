package com.upgrad.technicalblogpost.service;

import com.upgrad.technicalblogpost.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public PostService(){
        System.out.println("*** PostService ***");
    }


    @RequestMapping("/")
    public ArrayList<Post> getAllPost()
    {
        ArrayList<Post> posts = new ArrayList<>();

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

        return posts;
    }




    public ArrayList<Post> getOnePost()
    {
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;
    }



}
