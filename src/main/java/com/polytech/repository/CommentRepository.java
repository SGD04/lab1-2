package com.polytech.repository;

import com.polytech.models.Comment;
import com.polytech.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sergio on 08/04/2017.
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
	List<Comment> findByPost(Post post);
}
