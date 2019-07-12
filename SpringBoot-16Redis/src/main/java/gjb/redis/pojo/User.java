package gjb.redis.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String address;
	
}
