package com.udemy.workshopmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.udemy.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") // Busca pelo título do post, ignorando case ("i")
	List<Post> searchTitle(String text);
	
	@Query(" { $and: [ { date: { $gte: ?1 } }, { date: { $lte: ?2 } } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date dateIni, Date datefim); //Buscar posts contendo um dado string em qualquer lugar
	//(no título, corpo ou comentários) e em um dado intervalo de datas. gte = Greater than or iqual/ lte = less than or iqual.

}
