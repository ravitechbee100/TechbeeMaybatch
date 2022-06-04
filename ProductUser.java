package com.example.MamoDemoProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUser {
	@Autowired
	private RepositoryProduct userRepository;

	public ListProduct createUser(ListProduct user) {
		return userRepository.save(user);
	}

	public List<ListProduct> createUsers(List<ListProduct> users) {
		return userRepository.saveAll(users);
	}

	public ListProduct getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

	public List<ListProduct> getUsers() {
		return userRepository.findAll();
	}
	
	public ListProduct updateUser(ListProduct product) {
		
		ListProduct list=null;
		Optional<ListProduct> optionaluser=userRepository.findById(product.getProductId());
		if(optionaluser.isPresent()) {
			list=optionaluser.get();
			list.setProductName(product.getProductName());
			list.setProductName(product.getProductPrice());
			userRepository.save(list);
		}else {
			return new ListProduct();
		}
		return list;
	}
	
	public String deleteUserById(int id) {
		userRepository.deleteById(id);
		return "User got deleted";
	}
	
	

}
