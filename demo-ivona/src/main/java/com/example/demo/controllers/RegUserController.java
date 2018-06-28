package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.RegUser;
import com.example.demo.repositories.RegUserRepository;

@Controller
@RequestMapping("/users")
public class RegUserController {

	@Autowired
	RegUserRepository regUserRepository;
	
	@RequestMapping("/")
	public String getAllUsers(Model model) {
		model.addAttribute("listaUsera",regUserRepository.findAll());
		return "users";
	}
	
	@RequestMapping("/delete")
	public String deleteUser(Model model, @RequestParam("id") long id) {
		
		regUserRepository.deleteById(id);
		model.addAttribute("listaUsera",regUserRepository.findAll());
		return "users";
		
	}
	
	@RequestMapping("/edit")
	public String editUser(Model model, @RequestParam("id") long id) {
		
		RegUser ru = regUserRepository.findById(id);
		model.addAttribute("user", ru);
		return "edituser";
	}
	
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute("user") RegUser u, Model model) {
	
		RegUser ru = regUserRepository.findById(u.getId());

		ru.setAdmin(u.getAdmin());
		ru.setMail(u.getMail());
		regUserRepository.save(ru);
		
		model.addAttribute("listaUsera",regUserRepository.findAll());
		
		return "users";
	}
	
	@RequestMapping("/new")
	public String newUser(Model model) {
		RegUser ru = new RegUser();
		model.addAttribute("user", ru);
		return "new";
	}
	
	@RequestMapping("/create")
	public String createUser(@ModelAttribute("user") RegUser u, Model model) {
		
		RegUser ru = new RegUser();
		ru.setAdmin(u.getAdmin());
		ru.setMail(u.getMail());
		ru.setPassword(u.getPassword());
		regUserRepository.save(ru);
		
		model.addAttribute("listaUsera",regUserRepository.findAll());
		
		return "users";
		
	}
	
	
	@SuppressWarnings("unused")
	private static class UserBody{
		public String mail;
		public boolean admin;
		public long id;
	}	
	
}
