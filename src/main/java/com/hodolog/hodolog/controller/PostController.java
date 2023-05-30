package com.hodolog.hodolog.controller;

import com.hodolog.hodolog.domain.Post;
import com.hodolog.hodolog.request.PostCreate;
import com.hodolog.hodolog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    @GetMapping("/posts/{postId}")
    public Post get(@PathVariable(name = "postId")  Long id) {
        Post post = postService.get(id);
        return post;
    }
}
