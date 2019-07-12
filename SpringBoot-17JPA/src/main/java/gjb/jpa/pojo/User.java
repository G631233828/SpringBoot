package gjb.jpa.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="user2")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//主键生成策略
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	//CascadeType.PERSIST 级联操作
	@ManyToOne(cascade=CascadeType.PERSIST) //设置级联操作
	//@JoinColumn 维护外键
	@JoinColumn(name="role_Id")
	private Roles roles;
	
	
}