package gjb.jpa.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
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
@Table(name = "roles")
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 主键生成策略
	@Column(name = "roleId")
	private Integer roleId;

	@Column(name = "roleName")
	private String roleName;

	@OneToMany(mappedBy = "roles", fetch = FetchType.EAGER)
	private Set<User> user = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.PERSIST) 
	// @JoinTable 映射中间表
	// joinColumns 当前表中的主键所关联的中间表中的外键字段
	// inverseJoinColumns是副操作表的中间表列
	@JoinTable(name = "tb_role_menu", 
	inverseJoinColumns = @JoinColumn(name = "menu_id"), 
	joinColumns = @JoinColumn(name = "role_id"))
	private Set<Menus> menu = new HashSet<>();

}
