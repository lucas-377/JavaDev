package br.com.mjv.oficina.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url da home.
 *
 */

@Controller
public class homeController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
