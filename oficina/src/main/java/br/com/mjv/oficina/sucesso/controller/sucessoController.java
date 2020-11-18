package br.com.mjv.oficina.sucesso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de sucesso.
 *
 */

@Controller
public class sucessoController {

	@RequestMapping("/sucesso")
	public String sucesso() {
		return "sucesso";
	}
}
