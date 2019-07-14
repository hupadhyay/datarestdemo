package in.himtech.java.datarestdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="AUTHOR")
public class Author {

	@Id
	@GeneratedValue
	@Column(name="AUTHOR_ID")
	private Integer authorId;
	
	@NotNull(message = "name could not be null")
	@Column(name = "NAME", length = 25)
	private String authorName;
	
	@NotNull(message = "city could not be null")
	@Column(name = "CITY", length = 25)
	private String city;
	
	@Min(value = 0, message = "rating could not be less than 0.")
	@Max(value = 10, message = "rating could not be more than 10.")
	@Column(name = "RATING", length = 5)
	private Integer rating;
	
	@Email
	@Column(name="EMAIL", length = 30)
	private String email;
}
