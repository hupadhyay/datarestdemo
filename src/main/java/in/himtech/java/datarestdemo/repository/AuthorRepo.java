package in.himtech.java.datarestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.himtech.java.datarestdemo.model.Author;

@RepositoryRestResource(path = "authors", itemResourceRel = "author", collectionResourceRel = "authors")
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
