package com.udemy.workshopmongo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.workshopmongo.domain.Post;
import com.udemy.workshopmongo.repository.PostRepository;
import com.udemy.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){ //tem que acrescentar um dia a mais na maxDate. 
		//Porque ele entende até 00:00 daquele dia, sendo que na verdaed queremos as 24 horas. 
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000); //somando 24 horas em milissegundos
		 
		return repo.fullSearch(text, minDate, maxDate);
	}

}
