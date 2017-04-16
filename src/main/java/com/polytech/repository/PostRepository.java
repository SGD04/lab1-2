package com.polytech.repository;


import com.polytech.models.Post;

import java.util.List;

/**
 * Created by Sergio on 12/03/2017.
 */
public interface PostRepository {
	void save(Post post);

	Post findById(long id);

	List<Post> findAll();
}
