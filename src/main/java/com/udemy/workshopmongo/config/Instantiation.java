package com.udemy.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.workshopmongo.domain.Post;
import com.udemy.workshopmongo.domain.User;
import com.udemy.workshopmongo.repository.PostRepository;
import com.udemy.workshopmongo.repository.UserRepository;
@Component
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository repoUser;
	
	@Autowired
	private PostRepository repoPost;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
		stf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		repoUser.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, stf.parse("21/03/208"),"Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, stf.parse("23/03/2018"),"Bom dia", "Acordei feliz hoje!", maria);
		
		repoUser.saveAll(Arrays.asList(maria, alex,bob));
		repoPost.saveAll(Arrays.asList(post1,post2));
		
	}

}
