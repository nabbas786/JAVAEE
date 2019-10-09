package com.nad.contorller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nad.model.LoginForm;
@RestController
public class LoginContorller {

	@GetMapping("/login")
	public ModelAndView showLoginView(Model model) {
	  model.addAttribute("loginForm", new LoginForm());
	  return new ModelAndView("login");
	}
	
	@PostMapping("/login")
	public ModelAndView login(@Valid @ModelAttribute("loginForm") LoginForm form,
	                    BindingResult bindingResult,
	                    HttpSession session) {
	  if (!bindingResult.hasErrors()) {
	    final boolean authenticated = "abc@test.com".equals(form.getEmail());
	    final String loginStatus = authenticated ? "OK" : "FAILED";
	    session.setAttribute("loginStatus", loginStatus);
	  }
	  return new ModelAndView("login");
	}
}
