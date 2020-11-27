package br.com.mjv.oficina.registro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de registro de defeitos veiculares.
 *
 */

@Controller
public class registroController {

	@RequestMapping("/registro")
	public String registro() {
		return "registro";
	}
}
