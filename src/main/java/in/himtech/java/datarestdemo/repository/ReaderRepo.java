package in.himtech.java.datarestdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.himtech.java.datarestdemo.model.Reader;

@RepositoryRestResource(path = "readers", itemResourceRel = "reader", collectionResourceRel = "readers")
public interface ReaderRepo extends JpaRepository<Reader, String> {

}
