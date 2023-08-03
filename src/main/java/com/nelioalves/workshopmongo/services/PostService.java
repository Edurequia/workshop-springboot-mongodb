package com.nelioalves.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.repositories.PostRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotfFoundException;

@Service
public class PostService {
	
	@Autowired
	PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotfFoundException("Object not found!"));
	}
	
}
