package in.himtech.java.datarestdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@GeneratedValue
	private Integer bookId;
	
	@NotNull(message = "Name could not be null")
	@Size(max = 50, message="Size of name could not be more than 50 characters")
	private String name;
	
	@NotNull(message = "Author could not be null")
	@Size(max = 50, message="Size of author name could not be more than 50 characters")
	private String author;
	
	@NotNull(message = "Publisher could not be null")
	@Size(max = 100, message="Size of publisher could not be more than 100 characters")
	private String publisher;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return String.format("Book [bookId=%s, name=%s, author=%s, publisher=%s]", bookId, name, author, publisher);
	}
}