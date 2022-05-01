package com.sofkaU.relationalDB.service;

import com.sofkaU.relationalDB.entity.Comment;
import com.sofkaU.relationalDB.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    List<Post> findAllPosts();

    void deleteComment(Comment comment);

    void deletePost(Post post);

}
