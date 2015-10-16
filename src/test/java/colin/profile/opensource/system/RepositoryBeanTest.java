package colin.profile.opensource.system;

import java.util.Iterator;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import colin.profile.opensource.system.core.dao.UserManagerDao;
import colin.profile.opensource.system.core.pojo.Homework_User_Entity;


public class RepositoryBeanTest extends BaseBeanTest{
	
	@Autowired
	private UserManagerDao userManagerDao;
	
	@Test
	public void testUserRepository(){
		Iterator<Homework_User_Entity> userEntities=this.userManagerDao.findAll().iterator();
		while(userEntities.hasNext()){
			Homework_User_Entity user_Entity=userEntities.next();
			System.out.println(user_Entity.getUser_name());
		}
	}

}
