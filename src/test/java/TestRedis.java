import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxq.model.User;
import com.yxq.service.impl.RedisClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application.xml"})
public class TestRedis {

	@Test
	public void test(){
		
		RedisClient redis= new RedisClient("10.8.107.87", 6379);
		
		
		User u= new User();
		u.setAge(20);
		u.setMobile("13811125455");
		u.setName("yxq2");
		
		redis.set("u1", u);
		
		User b= redis.get("u1", User.class);
		
		System.out.println(redis.type("u1"));
		System.out.println(b.toString());
	}
}
