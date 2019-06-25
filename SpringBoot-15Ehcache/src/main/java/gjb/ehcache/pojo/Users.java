package gjb.ehcache.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String username;
	private String password;

}
