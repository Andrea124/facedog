package com.microservicios.users.api;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.users.entity.Post;
import com.microservicios.users.service.user.PostServiceImpl;

@RestController
@RequestMapping("api/post")
public class PostController {

	private static final Logger log = Logger.getLogger(PostController.class);
	@Autowired
	private PostServiceImpl PostService;

	@GetMapping("/{username}")
	@ResponseStatus(OK)
	public List<Post> leer(@PathVariable("username") String username) {
		log.info(">>> seach post");

		return PostService.seachPosts(username);
	}

	@PostMapping
	@ResponseStatus(CREATED)
	public Post crear(@RequestBody Post user_post) {
		log.info(">>> create user");
		return PostService.savePosts(user_post);
	}

}
