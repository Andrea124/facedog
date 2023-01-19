package com.microservicios.users.service.user;

import java.sql.ResultSet;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.users.entity.Post;
import com.microservicios.users.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	private static final Logger log = Logger.getLogger(PostServiceImpl.class);
	@Autowired
	private PostRepository postRepository;

	@Override
	public Post savePosts(Post postEntity) {
		return postRepository.save(postEntity);
	}
	

	@Override
	public List<Post> seachPosts(String username) {
		return postRepository.findByUsername(username);
	}
}
