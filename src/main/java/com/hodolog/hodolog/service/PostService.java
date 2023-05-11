package com.hodolog.hodolog.service;

import com.hodolog.hodolog.domain.Post;
import com.hodolog.hodolog.repository.PostRepository;
import com.hodolog.hodolog.request.PostCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    public void write(PostCreate postcreate){
        Post post = Post.builder()
                .title(postcreate.getTitle())
                .content(postcreate.getContent())
                .build();

        postRepository.save(post);
    }
}
