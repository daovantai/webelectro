package web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class LogoutController {
	@GetMapping
	public String logout(HttpSession ss) {
		ss.removeAttribute("tendn");
		return "redirect:/";
	}
}