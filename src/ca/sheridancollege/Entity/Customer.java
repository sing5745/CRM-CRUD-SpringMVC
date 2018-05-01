package ca.sheridancollege.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@Table(name="customer")
@NoArgsConstructor
@ToString
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	@Column(name="first_name")
	private String firstName;
	
	@Getter
	@Setter
	@Column(name="last_name")
	private String lastName;
	
	@Getter
	@Setter
	@Column(name="email")
	private String email;
	
}
