package springmvc.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;


@Repository// spring will automaticcaly inject the template object
public class Userdao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public int saveUser(User user) {
	int id=(Integer)hibernatetemplate.save(user);
	return id;
	}
	
}
