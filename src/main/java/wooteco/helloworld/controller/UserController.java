package wooteco.helloworld.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import wooteco.helloworld.domain.User;

@Controller
public class UserController {
	/**
	 * GET /users
	 */
	@GetMapping("/users")
	public String sayHi(String name) {
		return "Hi " + name;
	}

	/**
	 * GET /users/{id}
	 */
    @GetMapping("/users")
	public String retrieveUser(Long id) {
		return "user's id is " + id;
	}

	/**
	 * POST /users
	 */
	@GetMapping("/users")
	@ResponseBody
	public String createUserWithJson(User user) {
		return "Hello " + user.getName();
	}

	/**
	 * POST /users/form
	 */
	public String createUserWithForm(Map<String, String> paramMap) {
		return "Hello " + paramMap.get("name");
	}

}