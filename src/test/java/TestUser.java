import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxq.model.User;
import com.yxq.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application.xml"})
public class TestUser {

	@Autowired
	private UserService userService;
	
	@Test
	public void testAddUser(){
		User u= new User();
		u.setAge(20);
		u.setMobile("13811125477");
		u.setName("yxq2");
		userService.addUser(u);
	}
}
