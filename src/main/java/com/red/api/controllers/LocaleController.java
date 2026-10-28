package com.red.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LocaleController {
	@GetMapping("/locale")
	public String locale(HttpServletRequest request) {
		String ultimoURL = request.getHeader("referer");
		return "redirect:".concat(ultimoURL);
	}
}
