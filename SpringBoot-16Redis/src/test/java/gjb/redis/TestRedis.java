package gjb.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gjb.redis.pojo.User;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={MainClass.class})
public class TestRedis {
	
	@Autowired
	private RedisTemplate<String,Object> redisTemplate;

	@Test
	public void testget() {
		Object aaa = (Object) redisTemplate.opsForValue().get("user");
		System.out.println(aaa);
	}
	
	
	
	@Test
	public void testSet() {
	 redisTemplate.opsForValue().set("user", "fliay");;
	}
	
	
	//redis�������
	@Test
	public void savaPojo(){
		User user = new User();
		user.setName("jack");
		user.setAge(20);
		user.setAddress("�Ϻ�");
		//ʹ��jdk���л���
		this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		this.redisTemplate.opsForValue().set("USERS", user);
	}
	
	/**
	 * redisȡ������
	 */
	@Test
	public void getPojo(){
		//ʹ��jdk���л���
		this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		User user = (User) this.redisTemplate.opsForValue().get("USERS");
		System.out.println(user);
	}
	
	
	
	/**
	 * ����json��ʽ��User����
	 */
	@Test
	public void saveUserByJson(){
		
		User user = new User();
		user.setName("jack2");
		user.setAge(20);
		user.setAddress("�Ϻ�2");
		
		//ʹ��jdk���л���
		this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
		this.redisTemplate.opsForValue().set("USER2", user);
	}
	
	
	/**
	 * redisȡ������
	 */
	@Test
	public void getPojoByJson(){
		//ʹ��jdk���л���
		this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<User>(User.class));
		User user = (User) this.redisTemplate.opsForValue().get("USERS");
		System.out.println(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
