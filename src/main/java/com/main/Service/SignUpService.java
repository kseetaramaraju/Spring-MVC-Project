package com.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.Entiry.User;
import com.main.Repository.SignUpRepository;

@Service
public class SignUpService 
{
	@Autowired
	private SignUpRepository signUpRepository;

	public void serviceMethod(String id,String name,String password,String email)
	{
		User user=new User();

		user.setuId(id);
		user.setuName(name);
		user.setuPassword(password);
		user.setuEmail(email);


		signUpRepository.userDetails(user);

		System.out.println("Calling userDetails() in service class");
	}

	public void serviceUpdateMethod(String id,String name)
	{

		signUpRepository.userUpdate(id,name);

	}

	public void serviceDeleteMethod(String id) {
		signUpRepository.userDelete(id);

	}

	public List serviceGetAllData() {
	
		List<User> list=signUpRepository.userGetAllData();
		
		return list;
	}

}
