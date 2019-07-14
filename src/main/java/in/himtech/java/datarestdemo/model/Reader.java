package in.himtech.java.datarestdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "READER")
public class Reader {
	
	@Id
	@GenericGenerator(name = "reader_id", strategy = "in.himtech.java.datarestdemo.idgenerator.ReaderIdGenerator")
	@GeneratedValue(generator = "reader_id")
	@Column(name = "READER_ID")
	private String readerId;

	@NotEmpty(message = "Reader name could not be null or empty.")
	@Column(name = "READER_NAME")
	private String readerName;

	@Email(message = "Email format is not correct")
	@Column(name = "EMAIL")
	private String email;

	@Max(value = 5, message = "Not more than 5 books can be issued.")
	@Column(name = "NUMBER_BOOK")
	private Integer numBook;
}
