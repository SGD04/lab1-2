package com.polytech.web;


import com.polytech.configuration.ApplicationConfiguration;
import com.polytech.models.Post;
import com.polytech.services.business.PublicationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by Sergio on 13/03/2017.
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Coucou Polytech");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		PublicationService publicationService = applicationContext.getBean(PublicationService.class);

		Post post = new Post("Luminy !!", "user");
		publicationService.post(post);

		post = new Post("Hello", "user");
		publicationService.post(post);

		post = new Post("World", "user");
		publicationService.post(post);

		List<Post> posts = publicationService.fetchAll();
		System.out.println(posts);

	}
}
