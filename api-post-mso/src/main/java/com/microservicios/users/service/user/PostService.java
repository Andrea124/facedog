package com.microservicios.users.service.user;
import java.util.List;
import com.microservicios.users.entity.Post;

public interface PostService {

	Post savePosts(Post post);

	
	//Post seachPosts(String username);
	
	List<Post> seachPosts(String username);
}
