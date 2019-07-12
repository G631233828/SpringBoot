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
import javax.persistence.ManyToMany;
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
@Table(name = "menus")
public class Menus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "menusId")
	private Integer menusId;

	@Column(name = "menusName")
	private String menusName;
	@Column(name = "menusUrl")
	private String menusUrl;
	@Column(name = "fatherId")
	private Integer fatherId;
	
	//CascadeType.PERSIST 级联添加
	@ManyToMany(mappedBy="menu",cascade=CascadeType.PERSIST,fetch = FetchType.LAZY)
	private Set<Roles> role = new HashSet<>();
}
