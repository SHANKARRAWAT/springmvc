package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.Userdao;
import springmvc.model.User;

@Service
public class UserService {

	@Autowired
	private Userdao dao;
	public int createUser(User user) {
		return this.dao.saveUser(user);
	}
}
