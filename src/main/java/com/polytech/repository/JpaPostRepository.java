package com.polytech.repository;

import com.polytech.models.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sergio on 12/03/2017.
 */

@Repository
@Transactional
public class JpaPostRepository implements PostRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public JpaPostRepository(){
	}

	public void save(Post post) {
		entityManager.persist(post);
	}

	@Override
	public Post findById(long id) {
		return (entityManager.find(Post.class, id));
	}

	public List<Post> findAll() {
		Query query = entityManager.createQuery("SELECT p FROM Post p");
		return query.getResultList();

	}

}
