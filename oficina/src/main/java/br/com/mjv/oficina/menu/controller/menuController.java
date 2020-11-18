package br.com.mjv.oficina.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url do menu.
 *
 */

@Controller
public class menuController {

	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
}
