package in.himtech.java.datarestdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.himtech.java.datarestdemo.model.Book;

@RepositoryRestResource(path = "books", itemResourceRel = "book", collectionResourceRel = "books")
interface BookRepo extends JpaRepository<Book, Integer>{
	
	
}