package colin.profile.opensource.system.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import colin.profile.opensource.system.core.dao.UserManagerDao;
import colin.profile.opensource.system.core.pojo.Homework_User_Entity;

@Service
public class UserManagerService {

	@Autowired
	private UserManagerDao userManagerDao;

	public List<Homework_User_Entity> listAllUserInfoService(){
		Iterator<Homework_User_Entity> userEntities=this.userManagerDao.findAll().iterator();
		List<Homework_User_Entity> user_Entities=new ArrayList<Homework_User_Entity>();
		while(userEntities.hasNext()){
			Homework_User_Entity user_Entity=userEntities.next();
			user_Entities.add(user_Entity);
		}
		return user_Entities;
	}
}
