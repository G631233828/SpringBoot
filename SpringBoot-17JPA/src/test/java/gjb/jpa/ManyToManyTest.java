package gjb.jpa;

import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gjb.jpa.dao.RoleRepository;
import gjb.jpa.pojo.Menus;
import gjb.jpa.pojo.Roles;

/**
 * 一对多的关联关系
 * 
 * @author fliay
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainClass.class)
public class ManyToManyTest {
	@Autowired
	private RoleRepository r;

	/**
	 * 一对多关联关系的添加
	 */
	@Test
	public void testSave() {
		// 创建角色对象
		Roles r = new Roles();
		r.setRoleName("经理");
		// 创建菜单对象
		Menus m = new Menus();
		m.setMenusName("客户管理系统");
		m.setFatherId(0);

		Menus m2 = new Menus();
		m2.setFatherId(1);
		m2.setMenusName("项目管理");
		// 关联
		r.getMenu().add(m);
		r.getMenu().add(m2);
		m.getRole().add(r);
		m2.getRole().add(r);
		this.r.save(r);
  
	}

	@Test
	@Transactional
	public void findUser() {
	Optional<Roles> roles = this.r.findById(1);
 
	System.out.println(roles.get().getRoleName());
		
		roles.get().getMenu().forEach((menu)->{
			System.out.println(menu.getMenusName());
		});
	}

}
