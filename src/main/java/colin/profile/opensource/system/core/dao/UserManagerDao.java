package colin.profile.opensource.system.core.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import colin.profile.opensource.system.core.pojo.Homework_User_Entity;

@Repository
public interface UserManagerDao extends PagingAndSortingRepository<Homework_User_Entity, String>{

}
